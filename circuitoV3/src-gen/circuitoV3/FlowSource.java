/**
 */
package circuitoV3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.FlowSource#getSaliente_cambio <em>Saliente cambio</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getFlowSource()
 * @model abstract="true"
 * @generated
 */
public interface FlowSource extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * The list contents are of type {@link circuitoV3.DataFlow}.
	 * It is bidirectional and its opposite is '{@link circuitoV3.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saliente cambio</em>' containment reference list.
	 * @see circuitoV3.CircuitoV3Package#getFlowSource_Saliente_cambio()
	 * @see circuitoV3.DataFlow#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<DataFlow> getSaliente_cambio();

} // FlowSource
