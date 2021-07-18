/**
 */
package circuitoV3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see circuitoV3.CircuitoV3Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface CircuitoV3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circuitoV3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/circuitoV3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circuitoV3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitoV3Package eINSTANCE = circuitoV3.impl.CircuitoV3PackageImpl.init();

	/**
	 * The meta object id for the '{@link circuitoV3.impl.SistemaImpl <em>Sistema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.SistemaImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getSistema()
	 * @generated
	 */
	int SISTEMA = 0;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA__ELEMENTOS = 0;

	/**
	 * The number of structural features of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sistema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SISTEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.FlowElementImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NOMBRE_ELEMENTO = 0;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__ESTADO = 1;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.FlowSourceImpl <em>Flow Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.FlowSourceImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getFlowSource()
	 * @generated
	 */
	int FLOW_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__NOMBRE_ELEMENTO = FLOW_ELEMENT__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__ESTADO = FLOW_ELEMENT__ESTADO;

	/**
	 * The feature id for the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__SALIENTE_CAMBIO = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.PulsadorImpl <em>Pulsador</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.PulsadorImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getPulsador()
	 * @generated
	 */
	int PULSADOR = 1;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSADOR__NOMBRE_ELEMENTO = FLOW_SOURCE__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSADOR__ESTADO = FLOW_SOURCE__ESTADO;

	/**
	 * The feature id for the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSADOR__SALIENTE_CAMBIO = FLOW_SOURCE__SALIENTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Numero pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSADOR__NUMERO_PIN = FLOW_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pulsador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSADOR_FEATURE_COUNT = FLOW_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pulsador</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULSADOR_OPERATION_COUNT = FLOW_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.FlowTargetImpl <em>Flow Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.FlowTargetImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getFlowTarget()
	 * @generated
	 */
	int FLOW_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__NOMBRE_ELEMENTO = FLOW_ELEMENT__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__ESTADO = FLOW_ELEMENT__ESTADO;

	/**
	 * The feature id for the '<em><b>Entrante cambio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__ENTRANTE_CAMBIO = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.DataFlowImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NOMBRE_ELEMENTO = FLOW_ELEMENT__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ESTADO = FLOW_ELEMENT__ESTADO;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.CompuertaImpl <em>Compuerta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.CompuertaImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getCompuerta()
	 * @generated
	 */
	int COMPUERTA = 6;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA__NOMBRE_ELEMENTO = FLOW_SOURCE__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA__ESTADO = FLOW_SOURCE__ESTADO;

	/**
	 * The feature id for the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA__SALIENTE_CAMBIO = FLOW_SOURCE__SALIENTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Entrante cambio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA__ENTRANTE_CAMBIO = FLOW_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA__PIN_TOTAL = FLOW_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compuerta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA_FEATURE_COUNT = FLOW_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Compuerta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUERTA_OPERATION_COUNT = FLOW_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.AndImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getAnd()
	 * @generated
	 */
	int AND = 7;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NOMBRE_ELEMENTO = COMPUERTA__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ESTADO = COMPUERTA__ESTADO;

	/**
	 * The feature id for the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SALIENTE_CAMBIO = COMPUERTA__SALIENTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Entrante cambio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ENTRANTE_CAMBIO = COMPUERTA__ENTRANTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Pin total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__PIN_TOTAL = COMPUERTA__PIN_TOTAL;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = COMPUERTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = COMPUERTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.OrImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getOr()
	 * @generated
	 */
	int OR = 8;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NOMBRE_ELEMENTO = COMPUERTA__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ESTADO = COMPUERTA__ESTADO;

	/**
	 * The feature id for the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SALIENTE_CAMBIO = COMPUERTA__SALIENTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Entrante cambio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ENTRANTE_CAMBIO = COMPUERTA__ENTRANTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Pin total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__PIN_TOTAL = COMPUERTA__PIN_TOTAL;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = COMPUERTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = COMPUERTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.NotImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getNot()
	 * @generated
	 */
	int NOT = 9;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__NOMBRE_ELEMENTO = COMPUERTA__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ESTADO = COMPUERTA__ESTADO;

	/**
	 * The feature id for the '<em><b>Saliente cambio</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__SALIENTE_CAMBIO = COMPUERTA__SALIENTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Entrante cambio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__ENTRANTE_CAMBIO = COMPUERTA__ENTRANTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Pin total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__PIN_TOTAL = COMPUERTA__PIN_TOTAL;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = COMPUERTA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = COMPUERTA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuitoV3.impl.LedImpl <em>Led</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuitoV3.impl.LedImpl
	 * @see circuitoV3.impl.CircuitoV3PackageImpl#getLed()
	 * @generated
	 */
	int LED = 10;

	/**
	 * The feature id for the '<em><b>Nombre Elemento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NOMBRE_ELEMENTO = FLOW_TARGET__NOMBRE_ELEMENTO;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ESTADO = FLOW_TARGET__ESTADO;

	/**
	 * The feature id for the '<em><b>Entrante cambio</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ENTRANTE_CAMBIO = FLOW_TARGET__ENTRANTE_CAMBIO;

	/**
	 * The feature id for the '<em><b>Numero pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NUMERO_PIN = FLOW_TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = FLOW_TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = FLOW_TARGET_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link circuitoV3.Sistema <em>Sistema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sistema</em>'.
	 * @see circuitoV3.Sistema
	 * @generated
	 */
	EClass getSistema();

	/**
	 * Returns the meta object for the containment reference list '{@link circuitoV3.Sistema#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementos</em>'.
	 * @see circuitoV3.Sistema#getElementos()
	 * @see #getSistema()
	 * @generated
	 */
	EReference getSistema_Elementos();

	/**
	 * Returns the meta object for class '{@link circuitoV3.Pulsador <em>Pulsador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pulsador</em>'.
	 * @see circuitoV3.Pulsador
	 * @generated
	 */
	EClass getPulsador();

	/**
	 * Returns the meta object for the attribute '{@link circuitoV3.Pulsador#getNumero_pin <em>Numero pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero pin</em>'.
	 * @see circuitoV3.Pulsador#getNumero_pin()
	 * @see #getPulsador()
	 * @generated
	 */
	EAttribute getPulsador_Numero_pin();

	/**
	 * Returns the meta object for class '{@link circuitoV3.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see circuitoV3.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link circuitoV3.FlowElement#isEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see circuitoV3.FlowElement#isEstado()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Estado();

	/**
	 * Returns the meta object for the attribute '{@link circuitoV3.FlowElement#getNombreElemento <em>Nombre Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Elemento</em>'.
	 * @see circuitoV3.FlowElement#getNombreElemento()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_NombreElemento();

	/**
	 * Returns the meta object for class '{@link circuitoV3.FlowSource <em>Flow Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Source</em>'.
	 * @see circuitoV3.FlowSource
	 * @generated
	 */
	EClass getFlowSource();

	/**
	 * Returns the meta object for the containment reference list '{@link circuitoV3.FlowSource#getSaliente_cambio <em>Saliente cambio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saliente cambio</em>'.
	 * @see circuitoV3.FlowSource#getSaliente_cambio()
	 * @see #getFlowSource()
	 * @generated
	 */
	EReference getFlowSource_Saliente_cambio();

	/**
	 * Returns the meta object for class '{@link circuitoV3.FlowTarget <em>Flow Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Target</em>'.
	 * @see circuitoV3.FlowTarget
	 * @generated
	 */
	EClass getFlowTarget();

	/**
	 * Returns the meta object for the reference list '{@link circuitoV3.FlowTarget#getEntrante_cambio <em>Entrante cambio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entrante cambio</em>'.
	 * @see circuitoV3.FlowTarget#getEntrante_cambio()
	 * @see #getFlowTarget()
	 * @generated
	 */
	EReference getFlowTarget_Entrante_cambio();

	/**
	 * Returns the meta object for class '{@link circuitoV3.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see circuitoV3.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link circuitoV3.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see circuitoV3.DataFlow#getTarget()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Target();

	/**
	 * Returns the meta object for the container reference '{@link circuitoV3.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see circuitoV3.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for class '{@link circuitoV3.Compuerta <em>Compuerta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compuerta</em>'.
	 * @see circuitoV3.Compuerta
	 * @generated
	 */
	EClass getCompuerta();

	/**
	 * Returns the meta object for the attribute '{@link circuitoV3.Compuerta#getPin_total <em>Pin total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin total</em>'.
	 * @see circuitoV3.Compuerta#getPin_total()
	 * @see #getCompuerta()
	 * @generated
	 */
	EAttribute getCompuerta_Pin_total();

	/**
	 * Returns the meta object for class '{@link circuitoV3.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see circuitoV3.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link circuitoV3.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see circuitoV3.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link circuitoV3.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see circuitoV3.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link circuitoV3.Led <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Led</em>'.
	 * @see circuitoV3.Led
	 * @generated
	 */
	EClass getLed();

	/**
	 * Returns the meta object for the attribute '{@link circuitoV3.Led#getNumero_pin <em>Numero pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero pin</em>'.
	 * @see circuitoV3.Led#getNumero_pin()
	 * @see #getLed()
	 * @generated
	 */
	EAttribute getLed_Numero_pin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircuitoV3Factory getCircuitoV3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link circuitoV3.impl.SistemaImpl <em>Sistema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.SistemaImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getSistema()
		 * @generated
		 */
		EClass SISTEMA = eINSTANCE.getSistema();

		/**
		 * The meta object literal for the '<em><b>Elementos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SISTEMA__ELEMENTOS = eINSTANCE.getSistema_Elementos();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.PulsadorImpl <em>Pulsador</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.PulsadorImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getPulsador()
		 * @generated
		 */
		EClass PULSADOR = eINSTANCE.getPulsador();

		/**
		 * The meta object literal for the '<em><b>Numero pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULSADOR__NUMERO_PIN = eINSTANCE.getPulsador_Numero_pin();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.FlowElementImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__ESTADO = eINSTANCE.getFlowElement_Estado();

		/**
		 * The meta object literal for the '<em><b>Nombre Elemento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__NOMBRE_ELEMENTO = eINSTANCE.getFlowElement_NombreElemento();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.FlowSourceImpl <em>Flow Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.FlowSourceImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getFlowSource()
		 * @generated
		 */
		EClass FLOW_SOURCE = eINSTANCE.getFlowSource();

		/**
		 * The meta object literal for the '<em><b>Saliente cambio</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SOURCE__SALIENTE_CAMBIO = eINSTANCE.getFlowSource_Saliente_cambio();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.FlowTargetImpl <em>Flow Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.FlowTargetImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getFlowTarget()
		 * @generated
		 */
		EClass FLOW_TARGET = eINSTANCE.getFlowTarget();

		/**
		 * The meta object literal for the '<em><b>Entrante cambio</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TARGET__ENTRANTE_CAMBIO = eINSTANCE.getFlowTarget_Entrante_cambio();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.DataFlowImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TARGET = eINSTANCE.getDataFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.CompuertaImpl <em>Compuerta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.CompuertaImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getCompuerta()
		 * @generated
		 */
		EClass COMPUERTA = eINSTANCE.getCompuerta();

		/**
		 * The meta object literal for the '<em><b>Pin total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUERTA__PIN_TOTAL = eINSTANCE.getCompuerta_Pin_total();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.AndImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.OrImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.NotImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link circuitoV3.impl.LedImpl <em>Led</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuitoV3.impl.LedImpl
		 * @see circuitoV3.impl.CircuitoV3PackageImpl#getLed()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLed();

		/**
		 * The meta object literal for the '<em><b>Numero pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__NUMERO_PIN = eINSTANCE.getLed_Numero_pin();

	}

} //CircuitoV3Package
