package circuitV3Events;


import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;


public class CircuitoListener extends SessionManagerListener.Stub {

	@SuppressWarnings("unchecked")
	@Override 
	public void notifyAddSession(Session newSession) {
		final ResourceSet set = newSession.getTransactionalEditingDomain().getResourceSet();
		newSession.getEventBroker().addLocalTrigger(CircuitoTrigger.IS_FLOW_CHANGE,
				new CircuitoTrigger(newSession));
	}
}
