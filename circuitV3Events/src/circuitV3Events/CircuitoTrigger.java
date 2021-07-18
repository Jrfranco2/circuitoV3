package circuitV3Events;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;

import com.google.common.collect.Lists;

import circuitoV3.CircuitoV3Package;
import circuitoV3.Sistema;
import circuitoV3.util.CircuitoUpdate;

public class CircuitoTrigger implements ModelChangeTrigger {
	private Session session;

	public CircuitoTrigger(Session session) {
		this.session = session;
	}

	public static final NotificationFilter IS_FLOW_CHANGE = new NotificationFilter.Custom() {

		public boolean matches(Notification notification) {
			return (!notification.isTouch() && notification.getFeature() instanceof EStructuralFeature
					&& ((EStructuralFeature) notification.getFeature()).getEContainingClass()
							.getEPackage() == CircuitoV3Package.eINSTANCE);
		}
	};

	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
		System.out.println("Hola");
		final Collection<Sistema> systems = Lists.newArrayList();
		for (Resource res : session.getTransactionalEditingDomain().getResourceSet().getResources()) {
			for (EObject root : res.getContents()) {
				if (root instanceof Sistema) {
					systems.add((Sistema) root);
				}
			}
		}
		if (systems.size() > 0) {
			Command result = new RecordingCommand(session.getTransactionalEditingDomain()) {

				@Override
				protected void doExecute() {
					for (Sistema system : systems) {
						new CircuitoUpdate().updateModelState(system);
					}

				}
			};
			return Options.newSome(result);
		}
		return Options.newNone();
	}

	@Override
	public int priority() {
		return 0;
	}

}
