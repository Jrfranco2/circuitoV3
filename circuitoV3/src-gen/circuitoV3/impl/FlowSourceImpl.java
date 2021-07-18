/**
 */
package circuitoV3.impl;

import circuitoV3.CircuitoV3Package;
import circuitoV3.DataFlow;
import circuitoV3.FlowSource;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.impl.FlowSourceImpl#getSaliente_cambio <em>Saliente cambio</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowSourceImpl extends FlowElementImpl implements FlowSource {
	/**
	 * The cached value of the '{@link #getSaliente_cambio() <em>Saliente cambio</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaliente_cambio()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> saliente_cambio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitoV3Package.Literals.FLOW_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getSaliente_cambio() {
		if (saliente_cambio == null) {
			saliente_cambio = new EObjectContainmentWithInverseEList<DataFlow>(DataFlow.class, this,
					CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO, CircuitoV3Package.DATA_FLOW__SOURCE);
		}
		return saliente_cambio;
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
		case CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSaliente_cambio()).basicAdd(otherEnd, msgs);
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
		case CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO:
			return ((InternalEList<?>) getSaliente_cambio()).basicRemove(otherEnd, msgs);
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
		case CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO:
			return getSaliente_cambio();
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
		case CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO:
			getSaliente_cambio().clear();
			getSaliente_cambio().addAll((Collection<? extends DataFlow>) newValue);
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
		case CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO:
			getSaliente_cambio().clear();
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
		case CircuitoV3Package.FLOW_SOURCE__SALIENTE_CAMBIO:
			return saliente_cambio != null && !saliente_cambio.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowSourceImpl
