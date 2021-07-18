/**
 */
package circuitoV3.impl;

import circuitoV3.CircuitoV3Package;
import circuitoV3.FlowElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.impl.FlowElementImpl#getNombreElemento <em>Nombre Elemento</em>}</li>
 *   <li>{@link circuitoV3.impl.FlowElementImpl#isEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowElementImpl extends MinimalEObjectImpl.Container implements FlowElement {
	/**
	 * The default value of the '{@link #getNombreElemento() <em>Nombre Elemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElemento()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ELEMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreElemento() <em>Nombre Elemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreElemento()
	 * @generated
	 * @ordered
	 */
	protected String nombreElemento = NOMBRE_ELEMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESTADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstado()
	 * @generated
	 * @ordered
	 */
	protected boolean estado = ESTADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuitoV3Package.Literals.FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(boolean newEstado) {
		boolean oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitoV3Package.FLOW_ELEMENT__ESTADO, oldEstado,
					estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreElemento() {
		return nombreElemento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreElemento(String newNombreElemento) {
		String oldNombreElemento = nombreElemento;
		nombreElemento = newNombreElemento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuitoV3Package.FLOW_ELEMENT__NOMBRE_ELEMENTO,
					oldNombreElemento, nombreElemento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircuitoV3Package.FLOW_ELEMENT__NOMBRE_ELEMENTO:
			return getNombreElemento();
		case CircuitoV3Package.FLOW_ELEMENT__ESTADO:
			return isEstado();
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
		case CircuitoV3Package.FLOW_ELEMENT__NOMBRE_ELEMENTO:
			setNombreElemento((String) newValue);
			return;
		case CircuitoV3Package.FLOW_ELEMENT__ESTADO:
			setEstado((Boolean) newValue);
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
		case CircuitoV3Package.FLOW_ELEMENT__NOMBRE_ELEMENTO:
			setNombreElemento(NOMBRE_ELEMENTO_EDEFAULT);
			return;
		case CircuitoV3Package.FLOW_ELEMENT__ESTADO:
			setEstado(ESTADO_EDEFAULT);
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
		case CircuitoV3Package.FLOW_ELEMENT__NOMBRE_ELEMENTO:
			return NOMBRE_ELEMENTO_EDEFAULT == null ? nombreElemento != null
					: !NOMBRE_ELEMENTO_EDEFAULT.equals(nombreElemento);
		case CircuitoV3Package.FLOW_ELEMENT__ESTADO:
			return estado != ESTADO_EDEFAULT;
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
		result.append(" (nombreElemento: ");
		result.append(nombreElemento);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //FlowElementImpl
