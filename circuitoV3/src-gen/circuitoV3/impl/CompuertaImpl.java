/**
 */
package circuitoV3.impl;

import circuitoV3.CircuitoV3Package;
import circuitoV3.Compuerta;
import circuitoV3.DataFlow;
import circuitoV3.FlowTarget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compuerta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.impl.CompuertaImpl#getEntrante_cambio <em>Entrante cambio</em>}</li>
 *   <li>{@link circuitoV3.impl.CompuertaImpl#getPin_total <em>Pin total</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompuertaImpl extends FlowSourceImpl implements Compuerta {
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
	 * The default value of the '{@link #getPin_total() <em>Pin total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin_total()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_TOTAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPin_total() <em>Pin total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin_total()
	 * @generated
	 * @ordered
	 */
	protected int pin_total = PIN_TOTAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompuertaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitoV3Package.Literals.COMPUERTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getEntrante_cambio() {
		if (entrante_cambio == null) {
			entrante_cambio = new EObjectWithInverseResolvingEList<DataFlow>(DataFlow.class, this,
					CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO, CircuitoV3Package.DATA_FLOW__TARGET);
		}
		return entrante_cambio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPin_total() {
		return pin_total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin_total(int newPin_total) {
		int oldPin_total = pin_total;
		pin_total = newPin_total;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitoV3Package.COMPUERTA__PIN_TOTAL, oldPin_total,
					pin_total));
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
		case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
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
		case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
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
		case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
			return getEntrante_cambio();
		case CircuitoV3Package.COMPUERTA__PIN_TOTAL:
			return getPin_total();
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
		case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
			getEntrante_cambio().clear();
			getEntrante_cambio().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case CircuitoV3Package.COMPUERTA__PIN_TOTAL:
			setPin_total((Integer) newValue);
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
		case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
			getEntrante_cambio().clear();
			return;
		case CircuitoV3Package.COMPUERTA__PIN_TOTAL:
			setPin_total(PIN_TOTAL_EDEFAULT);
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
		case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
			return entrante_cambio != null && !entrante_cambio.isEmpty();
		case CircuitoV3Package.COMPUERTA__PIN_TOTAL:
			return pin_total != PIN_TOTAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowTarget.class) {
			switch (derivedFeatureID) {
			case CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO:
				return CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowTarget.class) {
			switch (baseFeatureID) {
			case CircuitoV3Package.FLOW_TARGET__ENTRANTE_CAMBIO:
				return CircuitoV3Package.COMPUERTA__ENTRANTE_CAMBIO;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (pin_total: ");
		result.append(pin_total);
		result.append(')');
		return result.toString();
	}

} //CompuertaImpl
