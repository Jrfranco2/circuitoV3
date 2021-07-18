/**
 */
package circuitoV3.impl;

import circuitoV3.CircuitoV3Package;
import circuitoV3.Pulsador;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pulsador</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.impl.PulsadorImpl#getNumero_pin <em>Numero pin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PulsadorImpl extends FlowSourceImpl implements Pulsador {
	/**
	 * The default value of the '{@link #getNumero_pin() <em>Numero pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero_pin()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_PIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero_pin() <em>Numero pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero_pin()
	 * @generated
	 * @ordered
	 */
	protected int numero_pin = NUMERO_PIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PulsadorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitoV3Package.Literals.PULSADOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero_pin() {
		return numero_pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero_pin(int newNumero_pin) {
		int oldNumero_pin = numero_pin;
		numero_pin = newNumero_pin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitoV3Package.PULSADOR__NUMERO_PIN, oldNumero_pin,
					numero_pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircuitoV3Package.PULSADOR__NUMERO_PIN:
			return getNumero_pin();
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
		case CircuitoV3Package.PULSADOR__NUMERO_PIN:
			setNumero_pin((Integer) newValue);
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
		case CircuitoV3Package.PULSADOR__NUMERO_PIN:
			setNumero_pin(NUMERO_PIN_EDEFAULT);
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
		case CircuitoV3Package.PULSADOR__NUMERO_PIN:
			return numero_pin != NUMERO_PIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (numero_pin: ");
		result.append(numero_pin);
		result.append(')');
		return result.toString();
	}

} //PulsadorImpl
