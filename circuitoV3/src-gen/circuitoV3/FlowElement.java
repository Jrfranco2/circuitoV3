/**
 */
package circuitoV3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.FlowElement#getNombreElemento <em>Nombre Elemento</em>}</li>
 *   <li>{@link circuitoV3.FlowElement#isEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(boolean)
	 * @see circuitoV3.CircuitoV3Package#getFlowElement_Estado()
	 * @model required="true"
	 * @generated
	 */
	boolean isEstado();

	/**
	 * Sets the value of the '{@link circuitoV3.FlowElement#isEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #isEstado()
	 * @generated
	 */
	void setEstado(boolean value);

	/**
	 * Returns the value of the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Elemento</em>' attribute.
	 * @see #setNombreElemento(String)
	 * @see circuitoV3.CircuitoV3Package#getFlowElement_NombreElemento()
	 * @model
	 * @generated
	 */
	String getNombreElemento();

	/**
	 * Sets the value of the '{@link circuitoV3.FlowElement#getNombreElemento <em>Nombre Elemento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Elemento</em>' attribute.
	 * @see #getNombreElemento()
	 * @generated
	 */
	void setNombreElemento(String value);

} // FlowElement
