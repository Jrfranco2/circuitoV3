/**
 */
package circuitoV3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pulsador</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.Pulsador#getNumero_pin <em>Numero pin</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getPulsador()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='pin_fuera_rango'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot pin_fuera_rango='FlowSource.allInstances()-&gt;exists(numero_pin&gt;1 and numero_pin&lt;13)'"
 * @generated
 */
public interface Pulsador extends FlowSource {
	/**
	 * Returns the value of the '<em><b>Numero pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero pin</em>' attribute.
	 * @see #setNumero_pin(int)
	 * @see circuitoV3.CircuitoV3Package#getPulsador_Numero_pin()
	 * @model required="true"
	 * @generated
	 */
	int getNumero_pin();

	/**
	 * Sets the value of the '{@link circuitoV3.Pulsador#getNumero_pin <em>Numero pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero pin</em>' attribute.
	 * @see #getNumero_pin()
	 * @generated
	 */
	void setNumero_pin(int value);

} // Pulsador
