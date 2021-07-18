/**
 */
package circuitoV3.impl;

import circuitoV3.CircuitoV3Package;
import circuitoV3.DataFlow;
import circuitoV3.FlowSource;
import circuitoV3.FlowTarget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.impl.DataFlowImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link circuitoV3.impl.DataFlowImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends FlowElementImpl implements DataFlow {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected FlowTarget target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitoV3Package.Literals.DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowTarget getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (FlowTarget) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuitoV3Package.DATA_FLOW__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowTarget basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(FlowTarget newTarget, NotificationChain msgs) {
		FlowTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircuitoV3Package.DATA_FLOW__TARGET, oldTarget, newTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(FlowTarget newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO,
						FlowTarget.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject) newTarget).eInverseAdd(this, CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO,
						FlowTarget.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitoV3Package.DATA_FLOW__TARGET, newTarget,
					newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSource getSource() {
		if (eContainerFeatureID() != CircuitoV3Package.DATA_FLOW__SOURCE)
			return null;
		return (FlowSource) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(FlowSource newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSource, CircuitoV3Package.DATA_FLOW__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(FlowSource newSource) {
		if (newSource != eInternalContainer()
				|| (eContainerFeatureID() != CircuitoV3Package.DATA_FLOW__SOURCE && newSource != null)) {
			if (EcoreUtil.isAncestor(this, newSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this, CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO,
						FlowSource.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitoV3Package.DATA_FLOW__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircuitoV3Package.DATA_FLOW__TARGET:
			if (target != null)
				msgs = ((InternalEObject) target).eInverseRemove(this, CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO,
						FlowTarget.class, msgs);
			return basicSetTarget((FlowTarget) otherEnd, msgs);
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSource((FlowSource) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircuitoV3Package.DATA_FLOW__TARGET:
			return basicSetTarget(null, msgs);
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			return basicSetSource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			return eInternalContainer().eInverseRemove(this, CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO,
					FlowSource.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircuitoV3Package.DATA_FLOW__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CircuitoV3Package.DATA_FLOW__TARGET:
			setTarget((FlowTarget) newValue);
			return;
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			setSource((FlowSource) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CircuitoV3Package.DATA_FLOW__TARGET:
			setTarget((FlowTarget) null);
			return;
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			setSource((FlowSource) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CircuitoV3Package.DATA_FLOW__TARGET:
			return target != null;
		case CircuitoV3Package.DATA_FLOW__SOURCE:
			return getSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFlowImpl
