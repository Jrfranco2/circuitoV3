/**
 */
package circuitoV3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.FlowTarget#getEntrante_cambio <em>Entrante cambio</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getFlowTarget()
 * @model abstract="true"
 * @generated
 */
public interface FlowTarget extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Entrante cambio</b></em>' reference list.
	 * The list contents are of type {@link circuitoV3.DataFlow}.
	 * It is bidirectional and its opposite is '{@link circuitoV3.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrante cambio</em>' reference list.
	 * @see circuitoV3.CircuitoV3Package#getFlowTarget_Entrante_cambio()
	 * @see circuitoV3.DataFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<DataFlow> getEntrante_cambio();

} // FlowTarget
