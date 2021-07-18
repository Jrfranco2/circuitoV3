/**
 */
package circuitoV3.util;

import circuitoV3.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see circuitoV3.CircuitoV3Package
 * @generated
 */
public class CircuitoV3Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CircuitoV3Validator INSTANCE = new CircuitoV3Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "circuitoV3";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitoV3Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return CircuitoV3Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case CircuitoV3Package.SISTEMA:
			return validateSistema((Sistema) value, diagnostics, context);
		case CircuitoV3Package.PULSADOR:
			return validatePulsador((Pulsador) value, diagnostics, context);
		case CircuitoV3Package.FLOW_ELEMENT:
			return validateFlowElement((FlowElement) value, diagnostics, context);
		case CircuitoV3Package.FLOW_SOURCE:
			return validateFlowSource((FlowSource) value, diagnostics, context);
		case CircuitoV3Package.FLOW_TARGET:
			return validateFlowTarget((FlowTarget) value, diagnostics, context);
		case CircuitoV3Package.DATA_FLOW:
			return validateDataFlow((DataFlow) value, diagnostics, context);
		case CircuitoV3Package.COMPUERTA:
			return validateCompuerta((Compuerta) value, diagnostics, context);
		case CircuitoV3Package.AND:
			return validateAnd((And) value, diagnostics, context);
		case CircuitoV3Package.OR:
			return validateOr((Or) value, diagnostics, context);
		case CircuitoV3Package.NOT:
			return validateNot((Not) value, diagnostics, context);
		case CircuitoV3Package.LED:
			return validateLed((Led) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSistema(Sistema sistema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sistema, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSistema_vacioNombre(sistema, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSistema_nombre_repetido(sistema, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vacioNombre constraint of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SISTEMA__VACIO_NOMBRE__EEXPRESSION = "self.elementos->forAll(c1 | c1.nombreElemento<>'' and c1.nombreElemento<>null and c1->excludes(DataFlow))";

	/**
	 * Validates the vacioNombre constraint of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSistema_vacioNombre(Sistema sistema, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircuitoV3Package.Literals.SISTEMA, sistema, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "vacioNombre", SISTEMA__VACIO_NOMBRE__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nombre_repetido constraint of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SISTEMA__NOMBRE_REPETIDO__EEXPRESSION = "self.elementos->forAll(c1,c2 | c1.nombreElemento=c2.nombreElemento implies c1=c2)";

	/**
	 * Validates the nombre_repetido constraint of '<em>Sistema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSistema_nombre_repetido(Sistema sistema, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircuitoV3Package.Literals.SISTEMA, sistema, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nombre_repetido",
				SISTEMA__NOMBRE_REPETIDO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePulsador(Pulsador pulsador, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pulsador, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pulsador, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePulsador_pin_fuera_rango(pulsador, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the pin_fuera_rango constraint of '<em>Pulsador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PULSADOR__PIN_FUERA_RANGO__EEXPRESSION = "FlowSource.allInstances()->exists(numero_pin>1 and numero_pin<13)";

	/**
	 * Validates the pin_fuera_rango constraint of '<em>Pulsador</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePulsador_pin_fuera_rango(Pulsador pulsador, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(CircuitoV3Package.Literals.PULSADOR, pulsador, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "pin_fuera_rango",
				PULSADOR__PIN_FUERA_RANGO__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowElement(FlowElement flowElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowSource(FlowSource flowSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowTarget(FlowTarget flowTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowTarget, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlow(DataFlow dataFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataFlow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompuerta(Compuerta compuerta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compuerta, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnd(And and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOr(Or or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(not, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(not, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNot_variasConexiones(not, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the variasConexiones constraint of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NOT__VARIAS_CONEXIONES__EEXPRESSION = "Not.allInstances()->exists(self.entrante_cambio->size()<2)";

	/**
	 * Validates the variasConexiones constraint of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNot_variasConexiones(Not not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(CircuitoV3Package.Literals.NOT, not, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "variasConexiones",
				NOT__VARIAS_CONEXIONES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLed(Led led, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(led, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLed_pin_fuera_rango(led, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLed_varias_conexiones(led, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the pin_fuera_rango constraint of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LED__PIN_FUERA_RANGO__EEXPRESSION = "FlowSource.allInstances()->exists(numero_pin>1 and numero_pin<13)";

	/**
	 * Validates the pin_fuera_rango constraint of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLed_pin_fuera_rango(Led led, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(CircuitoV3Package.Literals.LED, led, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "pin_fuera_rango", LED__PIN_FUERA_RANGO__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the varias_conexiones constraint of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LED__VARIAS_CONEXIONES__EEXPRESSION = "Led.allInstances()->exists(self.entrante_cambio->size()<2)";

	/**
	 * Validates the varias_conexiones constraint of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLed_varias_conexiones(Led led, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(CircuitoV3Package.Literals.LED, led, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "varias_conexiones",
				LED__VARIAS_CONEXIONES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //CircuitoV3Validator
