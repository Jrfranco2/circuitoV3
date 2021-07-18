/**
 */
package circuitoV3.impl;

import circuitoV3.And;
import circuitoV3.CircuitoV3Factory;
import circuitoV3.CircuitoV3Package;
import circuitoV3.Compuerta;
import circuitoV3.DataFlow;
import circuitoV3.FlowElement;
import circuitoV3.FlowSource;
import circuitoV3.FlowTarget;
import circuitoV3.Led;
import circuitoV3.Not;
import circuitoV3.Or;
import circuitoV3.Pulsador;
import circuitoV3.Sistema;

import circuitoV3.util.CircuitoV3Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuitoV3PackageImpl extends EPackageImpl implements CircuitoV3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sistemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pulsadorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compuertaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see circuitoV3.CircuitoV3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircuitoV3PackageImpl() {
		super(eNS_URI, CircuitoV3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CircuitoV3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CircuitoV3Package init() {
		if (isInited)
			return (CircuitoV3Package) EPackage.Registry.INSTANCE.getEPackage(CircuitoV3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredCircuitoV3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		CircuitoV3PackageImpl theCircuitoV3Package = registeredCircuitoV3Package instanceof CircuitoV3PackageImpl
				? (CircuitoV3PackageImpl) registeredCircuitoV3Package
				: new CircuitoV3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCircuitoV3Package.createPackageContents();

		// Initialize created meta-data
		theCircuitoV3Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theCircuitoV3Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return CircuitoV3Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theCircuitoV3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircuitoV3Package.eNS_URI, theCircuitoV3Package);
		return theCircuitoV3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSistema() {
		return sistemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSistema_Elementos() {
		return (EReference) sistemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPulsador() {
		return pulsadorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPulsador_Numero_pin() {
		return (EAttribute) pulsadorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElement_Estado() {
		return (EAttribute) flowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElement_NombreElemento() {
		return (EAttribute) flowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSource() {
		return flowSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSource_Saliente_cambio() {
		return (EReference) flowSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowTarget() {
		return flowTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowTarget_Entrante_cambio() {
		return (EReference) flowTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Target() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Source() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompuerta() {
		return compuertaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompuerta_Pin_total() {
		return (EAttribute) compuertaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNot() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLed() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLed_Numero_pin() {
		return (EAttribute) ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitoV3Factory getCircuitoV3Factory() {
		return (CircuitoV3Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		sistemaEClass = createEClass(SISTEMA);
		createEReference(sistemaEClass, SISTEMA__ELEMENTOS);

		pulsadorEClass = createEClass(PULSADOR);
		createEAttribute(pulsadorEClass, PULSADOR__NUMERO_PIN);

		flowElementEClass = createEClass(FLOW_ELEMENT);
		createEAttribute(flowElementEClass, FLOW_ELEMENT__NOMBRE_ELEMENTO);
		createEAttribute(flowElementEClass, FLOW_ELEMENT__ESTADO);

		flowSourceEClass = createEClass(FLOW_SOURCE);
		createEReference(flowSourceEClass, FLOW_SOURCE__SALIENTE_CAMBIO);

		flowTargetEClass = createEClass(FLOW_TARGET);
		createEReference(flowTargetEClass, FLOW_TARGET__ENTRANTE_CAMBIO);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__TARGET);
		createEReference(dataFlowEClass, DATA_FLOW__SOURCE);

		compuertaEClass = createEClass(COMPUERTA);
		createEAttribute(compuertaEClass, COMPUERTA__PIN_TOTAL);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		notEClass = createEClass(NOT);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__NUMERO_PIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pulsadorEClass.getESuperTypes().add(this.getFlowSource());
		flowSourceEClass.getESuperTypes().add(this.getFlowElement());
		flowTargetEClass.getESuperTypes().add(this.getFlowElement());
		dataFlowEClass.getESuperTypes().add(this.getFlowElement());
		compuertaEClass.getESuperTypes().add(this.getFlowSource());
		compuertaEClass.getESuperTypes().add(this.getFlowTarget());
		compuertaEClass.getESuperTypes().add(this.getFlowElement());
		andEClass.getESuperTypes().add(this.getCompuerta());
		orEClass.getESuperTypes().add(this.getCompuerta());
		notEClass.getESuperTypes().add(this.getCompuerta());
		ledEClass.getESuperTypes().add(this.getFlowTarget());

		// Initialize classes, features, and operations; add parameters
		initEClass(sistemaEClass, Sistema.class, "Sistema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSistema_Elementos(), this.getFlowElement(), null, "elementos", null, 0, -1, Sistema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pulsadorEClass, Pulsador.class, "Pulsador", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPulsador_Numero_pin(), ecorePackage.getEInt(), "numero_pin", null, 1, 1, Pulsador.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowElement_NombreElemento(), ecorePackage.getEString(), "nombreElemento", null, 0, 1,
				FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowElement_Estado(), ecorePackage.getEBoolean(), "estado", null, 1, 1, FlowElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSourceEClass, FlowSource.class, "FlowSource", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSource_Saliente_cambio(), this.getDataFlow(), this.getDataFlow_Source(),
				"saliente_cambio", null, 0, -1, FlowSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowTargetEClass, FlowTarget.class, "FlowTarget", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowTarget_Entrante_cambio(), this.getDataFlow(), this.getDataFlow_Target(),
				"entrante_cambio", null, 0, -1, FlowTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_Target(), this.getFlowTarget(), this.getFlowTarget_Entrante_cambio(), "target", null,
				1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Source(), this.getFlowSource(), this.getFlowSource_Saliente_cambio(), "source", null,
				1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compuertaEClass, Compuerta.class, "Compuerta", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompuerta_Pin_total(), ecorePackage.getEInt(), "pin_total", null, 1, 1, Compuerta.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, Not.class, "Not", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ledEClass, Led.class, "Led", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLed_Numero_pin(), ecorePackage.getEInt(), "numero_pin", null, 1, 1, Led.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(sistemaEClass, source, new String[] { "constraints", "vacioNombre nombre_repetido" });
		addAnnotation(pulsadorEClass, source, new String[] { "constraints", "pin_fuera_rango" });
		addAnnotation(notEClass, source, new String[] { "constraints", "variasConexiones" });
		addAnnotation(ledEClass, source, new String[] { "constraints", "pin_fuera_rango varias_conexiones" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(sistemaEClass, source, new String[] { "vacioNombre",
				"self.elementos->forAll(c1 | c1.nombreElemento<>\'\' and c1.nombreElemento<>null and c1->excludes(DataFlow))",
				"nombre_repetido",
				"self.elementos->forAll(c1,c2 | c1.nombreElemento=c2.nombreElemento implies c1=c2)" });
		addAnnotation(pulsadorEClass, source, new String[] { "pin_fuera_rango",
				"FlowSource.allInstances()->exists(numero_pin>1 and numero_pin<13)" });
		addAnnotation(notEClass, source,
				new String[] { "variasConexiones", "Not.allInstances()->exists(self.entrante_cambio->size()<2)" });
		addAnnotation(ledEClass, source,
				new String[] { "pin_fuera_rango", "FlowSource.allInstances()->exists(numero_pin>1 and numero_pin<13)",
						"varias_conexiones", "Led.allInstances()->exists(self.entrante_cambio->size()<2)" });
	}

} //CircuitoV3PackageImpl
