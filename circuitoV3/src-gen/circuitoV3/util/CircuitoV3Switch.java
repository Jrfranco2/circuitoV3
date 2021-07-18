/**
 */
package circuitoV3.util;

import circuitoV3.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see circuitoV3.CircuitoV3Package
 * @generated
 */
public class CircuitoV3Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircuitoV3Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitoV3Switch() {
		if (modelPackage == null) {
			modelPackage = CircuitoV3Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CircuitoV3Package.SISTEMA: {
			Sistema sistema = (Sistema) theEObject;
			T result = caseSistema(sistema);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.PULSADOR: {
			Pulsador pulsador = (Pulsador) theEObject;
			T result = casePulsador(pulsador);
			if (result == null)
				result = caseFlowSource(pulsador);
			if (result == null)
				result = caseFlowElement(pulsador);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.FLOW_ELEMENT: {
			FlowElement flowElement = (FlowElement) theEObject;
			T result = caseFlowElement(flowElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.FLOW_SOURCE: {
			FlowSource flowSource = (FlowSource) theEObject;
			T result = caseFlowSource(flowSource);
			if (result == null)
				result = caseFlowElement(flowSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.FLOW_TARGET: {
			FlowTarget flowTarget = (FlowTarget) theEObject;
			T result = caseFlowTarget(flowTarget);
			if (result == null)
				result = caseFlowElement(flowTarget);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.DATA_FLOW: {
			DataFlow dataFlow = (DataFlow) theEObject;
			T result = caseDataFlow(dataFlow);
			if (result == null)
				result = caseFlowElement(dataFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.COMPUERTA: {
			Compuerta compuerta = (Compuerta) theEObject;
			T result = caseCompuerta(compuerta);
			if (result == null)
				result = caseFlowSource(compuerta);
			if (result == null)
				result = caseFlowTarget(compuerta);
			if (result == null)
				result = caseFlowElement(compuerta);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseCompuerta(and);
			if (result == null)
				result = caseFlowSource(and);
			if (result == null)
				result = caseFlowTarget(and);
			if (result == null)
				result = caseFlowElement(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseCompuerta(or);
			if (result == null)
				result = caseFlowSource(or);
			if (result == null)
				result = caseFlowTarget(or);
			if (result == null)
				result = caseFlowElement(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseCompuerta(not);
			if (result == null)
				result = caseFlowSource(not);
			if (result == null)
				result = caseFlowTarget(not);
			if (result == null)
				result = caseFlowElement(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircuitoV3Package.LED: {
			Led led = (Led) theEObject;
			T result = caseLed(led);
			if (result == null)
				result = caseFlowTarget(led);
			if (result == null)
				result = caseFlowElement(led);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sistema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSistema(Sistema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pulsador</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pulsador</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePulsador(Pulsador object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElement(FlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSource(FlowSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowTarget(FlowTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compuerta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compuerta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompuerta(Compuerta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Led</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLed(Led object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CircuitoV3Switch
