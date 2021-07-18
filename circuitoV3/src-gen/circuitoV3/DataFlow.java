/**
 */
package circuitoV3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.DataFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link circuitoV3.DataFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link circuitoV3.FlowTarget#getEntrante_cambio <em>Entrante cambio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowTarget)
	 * @see circuitoV3.CircuitoV3Package#getDataFlow_Target()
	 * @see circuitoV3.FlowTarget#getEntrante_cambio
	 * @model opposite="entrante_cambio" required="true"
	 * @generated
	 */
	FlowTarget getTarget();

	/**
	 * Sets the value of the '{@link circuitoV3.DataFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowTarget value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link circuitoV3.FlowSource#getSaliente_cambio <em>Saliente cambio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(FlowSource)
	 * @see circuitoV3.CircuitoV3Package#getDataFlow_Source()
	 * @see circuitoV3.FlowSource#getSaliente_cambio
	 * @model opposite="saliente_cambio" required="true" transient="false"
	 * @generated
	 */
	FlowSource getSource();

	/**
	 * Sets the value of the '{@link circuitoV3.DataFlow#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowSource value);

} // DataFlow
