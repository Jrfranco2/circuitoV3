/**
 */
package circuitoV3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compuerta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.Compuerta#getPin_total <em>Pin total</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getCompuerta()
 * @model abstract="true"
 * @generated
 */
public interface Compuerta extends FlowSource, FlowTarget, FlowElement {
	/**
	 * Returns the value of the '<em><b>Pin total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin total</em>' attribute.
	 * @see #setPin_total(int)
	 * @see circuitoV3.CircuitoV3Package#getCompuerta_Pin_total()
	 * @model required="true"
	 * @generated
	 */
	int getPin_total();

	/**
	 * Sets the value of the '{@link circuitoV3.Compuerta#getPin_total <em>Pin total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin total</em>' attribute.
	 * @see #getPin_total()
	 * @generated
	 */
	void setPin_total(int value);

} // Compuerta
