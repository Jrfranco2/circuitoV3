/**
 */
package circuitoV3.impl;

import circuitoV3.CircuitoV3Package;
import circuitoV3.DataFlow;
import circuitoV3.FlowTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.impl.FlowTargetImpl#getEntrante_cambio <em>Entrante cambio</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowTargetImpl extends FlowElementImpl implements FlowTarget {
	/**
	 * The cached value of the '{@link #getEntrante_cambio() <em>Entrante cambio</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrante_cambio()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> entrante_cambio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitoV3Package.Literals.FLOW_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getEntrante_cambio() {
		if (entrante_cambio == null) {
			entrante_cambio = new EObjectWithInverseResolvingEList<DataFlow>(DataFlow.class, this,
					CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO, CircuitoV3Package.DATA_FLOW__TARGET);
		}
		return entrante_cambio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntrante_cambio()).basicAdd(otherEnd, msgs);
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
		case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
			return ((InternalEList<?>) getEntrante_cambio()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
			return getEntrante_cambio();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
			getEntrante_cambio().clear();
			getEntrante_cambio().addAll((Collection<? extends DataFlow>) newValue);
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
		case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
			getEntrante_cambio().clear();
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
		case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
			return entrante_cambio != null && !entrante_cambio.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowTargetImpl
