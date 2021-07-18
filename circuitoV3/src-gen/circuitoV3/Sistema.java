/**
 */
package circuitoV3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sistema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link circuitoV3.Sistema#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see circuitoV3.CircuitoV3Package#getSistema()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='vacioNombre nombre_repetido'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot vacioNombre='self.elementos-&gt;forAll(c1 | c1.nombreElemento&lt;&gt;\'\' and c1.nombreElemento&lt;&gt;null and c1-&gt;excludes(DataFlow))' nombre_repetido='self.elementos-&gt;forAll(c1,c2 | c1.nombreElemento=c2.nombreElemento implies c1=c2)'"
 * @generated
 */
public interface Sistema extends EObject {
	/**
	 * Returns the value of the '<em><b>Elementos</b></em>' containment reference list.
	 * The list contents are of type {@link circuitoV3.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' containment reference list.
	 * @see circuitoV3.CircuitoV3Package#getSistema_Elementos()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getElementos();

} // Sistema
