/**
 */
package circuitoV3.impl;

import circuitoV3.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitoV3FactoryImpl extends EFactoryImpl implements CircuitoV3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CircuitoV3Factory init() {
		try {
			CircuitoV3Factory theCircuitoV3Factory = (CircuitoV3Factory) EPackage.Registry.INSTANCE
					.getEFactory(CircuitoV3Package.eNS_URI);
			if (theCircuitoV3Factory != null) {
				return theCircuitoV3Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CircuitoV3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitoV3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CircuitoV3Package.SISTEMA:
			return createSistema();
		case CircuitoV3Package.PULSADOR:
			return createPulsador();
		case CircuitoV3Package.DATA_FLOW:
			return createDataFlow();
		case CircuitoV3Package.AND:
			return createAnd();
		case CircuitoV3Package.OR:
			return createOr();
		case CircuitoV3Package.NOT:
			return createNot();
		case CircuitoV3Package.LED:
			return createLed();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sistema createSistema() {
		SistemaImpl sistema = new SistemaImpl();
		return sistema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pulsador createPulsador() {
		PulsadorImpl pulsador = new PulsadorImpl();
		return pulsador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Led createLed() {
		LedImpl led = new LedImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitoV3Package getCircuitoV3Package() {
		return (CircuitoV3Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CircuitoV3Package getPackage() {
		return CircuitoV3Package.eINSTANCE;
	}

} //CircuitoV3FactoryImpl
