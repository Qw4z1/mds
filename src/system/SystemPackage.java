/**
 */
package system;

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
 * @see system.SystemFactory
 * @model kind="package"
 * @generated
 */
public interface SystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "system";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se/chalmers/arvidk/mse/ims";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "se.chalmers.arvidk.mse.ims";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemPackage eINSTANCE = system.impl.SystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link system.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.PersonImpl
	 * @see system.impl.SystemPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Is Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IS_RESPONSIBLE = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link system.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.BooleanConditionImpl
	 * @see system.impl.SystemPackageImpl#getBooleanCondition()
	 * @generated
	 */
	int BOOLEAN_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__INPUT = 2;

	/**
	 * The feature id for the '<em><b>For Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__FOR_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__CONTAINS = 4;

	/**
	 * The number of structural features of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link system.impl.WorkPieceImpl <em>Work Piece</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.WorkPieceImpl
	 * @see system.impl.SystemPackageImpl#getWorkPiece()
	 * @generated
	 */
	int WORK_PIECE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__TO = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__ID = 2;

	/**
	 * The feature id for the '<em><b>Is Stored</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__IS_STORED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Inlcuded In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE__INLCUDED_IN = 5;

	/**
	 * The number of structural features of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Work Piece</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PIECE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link system.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.StepImpl
	 * @see system.impl.SystemPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Overseen By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OVERSEEN_BY = 3;

	/**
	 * The feature id for the '<em><b>Input Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Applies Output Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__APPLIES_OUTPUT_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 6;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEP = 7;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link system.impl.ManufacturingImpl <em>Manufacturing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.ManufacturingImpl
	 * @see system.impl.SystemPackageImpl#getManufacturing()
	 * @generated
	 */
	int MANUFACTURING = 4;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__OUTPUT = STEP__OUTPUT;

	/**
	 * The feature id for the '<em><b>Overseen By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__OVERSEEN_BY = STEP__OVERSEEN_BY;

	/**
	 * The feature id for the '<em><b>Input Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__INPUT_CONDITION = STEP__INPUT_CONDITION;

	/**
	 * The feature id for the '<em><b>Applies Output Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__APPLIES_OUTPUT_CONDITION = STEP__APPLIES_OUTPUT_CONDITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING__STEP = STEP__STEP;

	/**
	 * The number of structural features of the '<em>Manufacturing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manufacturing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUFACTURING_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.impl.QualityAssuranceImpl <em>Quality Assurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.QualityAssuranceImpl
	 * @see system.impl.SystemPackageImpl#getQualityAssurance()
	 * @generated
	 */
	int QUALITY_ASSURANCE = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__OUTPUT = STEP__OUTPUT;

	/**
	 * The feature id for the '<em><b>Overseen By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__OVERSEEN_BY = STEP__OVERSEEN_BY;

	/**
	 * The feature id for the '<em><b>Input Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__INPUT_CONDITION = STEP__INPUT_CONDITION;

	/**
	 * The feature id for the '<em><b>Applies Output Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__APPLIES_OUTPUT_CONDITION = STEP__APPLIES_OUTPUT_CONDITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__STEP = STEP__STEP;

	/**
	 * The number of structural features of the '<em>Quality Assurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Assurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.impl.TransportImpl <em>Transport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.TransportImpl
	 * @see system.impl.SystemPackageImpl#getTransport()
	 * @generated
	 */
	int TRANSPORT = 6;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__SPEED = STEP__SPEED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__INPUT = STEP__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__OUTPUT = STEP__OUTPUT;

	/**
	 * The feature id for the '<em><b>Overseen By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__OVERSEEN_BY = STEP__OVERSEEN_BY;

	/**
	 * The feature id for the '<em><b>Input Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__INPUT_CONDITION = STEP__INPUT_CONDITION;

	/**
	 * The feature id for the '<em><b>Applies Output Condition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__APPLIES_OUTPUT_CONDITION = STEP__APPLIES_OUTPUT_CONDITION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT__STEP = STEP__STEP;

	/**
	 * The number of structural features of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.impl.IMSImpl <em>IMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.IMSImpl
	 * @see system.impl.SystemPackageImpl#getIMS()
	 * @generated
	 */
	int IMS = 7;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Work Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__WORK_PIECES = 2;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__PERSONS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__NAME = 4;

	/**
	 * The feature id for the '<em><b>Storages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__STORAGES = 5;

	/**
	 * The number of structural features of the '<em>IMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>IMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link system.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.impl.StorageImpl
	 * @see system.impl.SystemPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 8;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CAPACITY = 0;

	/**
	 * The feature id for the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__IS_START = 1;

	/**
	 * The feature id for the '<em><b>Is End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__IS_END = 2;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__HAS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ID = 4;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link system.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see system.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link system.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see system.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link system.Person#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see system.Person#getRole()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Role();

	/**
	 * Returns the meta object for the reference list '{@link system.Person#getIsResponsible <em>Is Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Responsible</em>'.
	 * @see system.Person#getIsResponsible()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_IsResponsible();

	/**
	 * Returns the meta object for class '{@link system.BooleanCondition <em>Boolean Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Condition</em>'.
	 * @see system.BooleanCondition
	 * @generated
	 */
	EClass getBooleanCondition();

	/**
	 * Returns the meta object for the attribute '{@link system.BooleanCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see system.BooleanCondition#getName()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EAttribute getBooleanCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link system.BooleanCondition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see system.BooleanCondition#getDescription()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EAttribute getBooleanCondition_Description();

	/**
	 * Returns the meta object for the reference list '{@link system.BooleanCondition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see system.BooleanCondition#getInput()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EReference getBooleanCondition_Input();

	/**
	 * Returns the meta object for the reference list '{@link system.BooleanCondition#getForOutput <em>For Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>For Output</em>'.
	 * @see system.BooleanCondition#getForOutput()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EReference getBooleanCondition_ForOutput();

	/**
	 * Returns the meta object for the reference list '{@link system.BooleanCondition#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see system.BooleanCondition#getContains()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EReference getBooleanCondition_Contains();

	/**
	 * Returns the meta object for class '{@link system.WorkPiece <em>Work Piece</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Piece</em>'.
	 * @see system.WorkPiece
	 * @generated
	 */
	EClass getWorkPiece();

	/**
	 * Returns the meta object for the reference '{@link system.WorkPiece#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see system.WorkPiece#getFrom()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_From();

	/**
	 * Returns the meta object for the reference '{@link system.WorkPiece#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see system.WorkPiece#getTo()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_To();

	/**
	 * Returns the meta object for the attribute '{@link system.WorkPiece#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see system.WorkPiece#getId()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EAttribute getWorkPiece_Id();

	/**
	 * Returns the meta object for the reference list '{@link system.WorkPiece#getIsStored <em>Is Stored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Stored</em>'.
	 * @see system.WorkPiece#getIsStored()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_IsStored();

	/**
	 * Returns the meta object for the attribute '{@link system.WorkPiece#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see system.WorkPiece#getType()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EAttribute getWorkPiece_Type();

	/**
	 * Returns the meta object for the reference list '{@link system.WorkPiece#getInlcudedIn <em>Inlcuded In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inlcuded In</em>'.
	 * @see system.WorkPiece#getInlcudedIn()
	 * @see #getWorkPiece()
	 * @generated
	 */
	EReference getWorkPiece_InlcudedIn();

	/**
	 * Returns the meta object for class '{@link system.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see system.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link system.Step#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see system.Step#getSpeed()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Speed();

	/**
	 * Returns the meta object for the reference list '{@link system.Step#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see system.Step#getInput()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Input();

	/**
	 * Returns the meta object for the reference list '{@link system.Step#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see system.Step#getOutput()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Output();

	/**
	 * Returns the meta object for the reference '{@link system.Step#getOverseenBy <em>Overseen By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overseen By</em>'.
	 * @see system.Step#getOverseenBy()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OverseenBy();

	/**
	 * Returns the meta object for the reference list '{@link system.Step#getInputCondition <em>Input Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Condition</em>'.
	 * @see system.Step#getInputCondition()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InputCondition();

	/**
	 * Returns the meta object for the reference list '{@link system.Step#getAppliesOutputCondition <em>Applies Output Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies Output Condition</em>'.
	 * @see system.Step#getAppliesOutputCondition()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_AppliesOutputCondition();

	/**
	 * Returns the meta object for the attribute '{@link system.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see system.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the reference list '{@link system.Step#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Step</em>'.
	 * @see system.Step#getStep()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Step();

	/**
	 * Returns the meta object for class '{@link system.Manufacturing <em>Manufacturing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manufacturing</em>'.
	 * @see system.Manufacturing
	 * @generated
	 */
	EClass getManufacturing();

	/**
	 * Returns the meta object for class '{@link system.QualityAssurance <em>Quality Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Assurance</em>'.
	 * @see system.QualityAssurance
	 * @generated
	 */
	EClass getQualityAssurance();

	/**
	 * Returns the meta object for class '{@link system.Transport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport</em>'.
	 * @see system.Transport
	 * @generated
	 */
	EClass getTransport();

	/**
	 * Returns the meta object for class '{@link system.IMS <em>IMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMS</em>'.
	 * @see system.IMS
	 * @generated
	 */
	EClass getIMS();

	/**
	 * Returns the meta object for the containment reference list '{@link system.IMS#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see system.IMS#getConditions()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link system.IMS#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see system.IMS#getSteps()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link system.IMS#getWorkPieces <em>Work Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work Pieces</em>'.
	 * @see system.IMS#getWorkPieces()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_WorkPieces();

	/**
	 * Returns the meta object for the containment reference list '{@link system.IMS#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see system.IMS#getPersons()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Persons();

	/**
	 * Returns the meta object for the attribute '{@link system.IMS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see system.IMS#getName()
	 * @see #getIMS()
	 * @generated
	 */
	EAttribute getIMS_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link system.IMS#getStorages <em>Storages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Storages</em>'.
	 * @see system.IMS#getStorages()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Storages();

	/**
	 * Returns the meta object for class '{@link system.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see system.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link system.Storage#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see system.Storage#getCapacity()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link system.Storage#isIsStart <em>Is Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Start</em>'.
	 * @see system.Storage#isIsStart()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_IsStart();

	/**
	 * Returns the meta object for the attribute '{@link system.Storage#isIsEnd <em>Is End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is End</em>'.
	 * @see system.Storage#isIsEnd()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_IsEnd();

	/**
	 * Returns the meta object for the reference list '{@link system.Storage#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see system.Storage#getHas()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Has();

	/**
	 * Returns the meta object for the attribute '{@link system.Storage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see system.Storage#getId()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SystemFactory getSystemFactory();

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
		 * The meta object literal for the '{@link system.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.PersonImpl
		 * @see system.impl.SystemPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ROLE = eINSTANCE.getPerson_Role();

		/**
		 * The meta object literal for the '<em><b>Is Responsible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__IS_RESPONSIBLE = eINSTANCE.getPerson_IsResponsible();

		/**
		 * The meta object literal for the '{@link system.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.BooleanConditionImpl
		 * @see system.impl.SystemPackageImpl#getBooleanCondition()
		 * @generated
		 */
		EClass BOOLEAN_CONDITION = eINSTANCE.getBooleanCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONDITION__NAME = eINSTANCE.getBooleanCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONDITION__DESCRIPTION = eINSTANCE.getBooleanCondition_Description();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONDITION__INPUT = eINSTANCE.getBooleanCondition_Input();

		/**
		 * The meta object literal for the '<em><b>For Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONDITION__FOR_OUTPUT = eINSTANCE.getBooleanCondition_ForOutput();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONDITION__CONTAINS = eINSTANCE.getBooleanCondition_Contains();

		/**
		 * The meta object literal for the '{@link system.impl.WorkPieceImpl <em>Work Piece</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.WorkPieceImpl
		 * @see system.impl.SystemPackageImpl#getWorkPiece()
		 * @generated
		 */
		EClass WORK_PIECE = eINSTANCE.getWorkPiece();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__FROM = eINSTANCE.getWorkPiece_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__TO = eINSTANCE.getWorkPiece_To();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECE__ID = eINSTANCE.getWorkPiece_Id();

		/**
		 * The meta object literal for the '<em><b>Is Stored</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__IS_STORED = eINSTANCE.getWorkPiece_IsStored();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PIECE__TYPE = eINSTANCE.getWorkPiece_Type();

		/**
		 * The meta object literal for the '<em><b>Inlcuded In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PIECE__INLCUDED_IN = eINSTANCE.getWorkPiece_InlcudedIn();

		/**
		 * The meta object literal for the '{@link system.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.StepImpl
		 * @see system.impl.SystemPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__SPEED = eINSTANCE.getStep_Speed();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUT = eINSTANCE.getStep_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTPUT = eINSTANCE.getStep_Output();

		/**
		 * The meta object literal for the '<em><b>Overseen By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OVERSEEN_BY = eINSTANCE.getStep_OverseenBy();

		/**
		 * The meta object literal for the '<em><b>Input Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUT_CONDITION = eINSTANCE.getStep_InputCondition();

		/**
		 * The meta object literal for the '<em><b>Applies Output Condition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__APPLIES_OUTPUT_CONDITION = eINSTANCE.getStep_AppliesOutputCondition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STEP = eINSTANCE.getStep_Step();

		/**
		 * The meta object literal for the '{@link system.impl.ManufacturingImpl <em>Manufacturing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.ManufacturingImpl
		 * @see system.impl.SystemPackageImpl#getManufacturing()
		 * @generated
		 */
		EClass MANUFACTURING = eINSTANCE.getManufacturing();

		/**
		 * The meta object literal for the '{@link system.impl.QualityAssuranceImpl <em>Quality Assurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.QualityAssuranceImpl
		 * @see system.impl.SystemPackageImpl#getQualityAssurance()
		 * @generated
		 */
		EClass QUALITY_ASSURANCE = eINSTANCE.getQualityAssurance();

		/**
		 * The meta object literal for the '{@link system.impl.TransportImpl <em>Transport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.TransportImpl
		 * @see system.impl.SystemPackageImpl#getTransport()
		 * @generated
		 */
		EClass TRANSPORT = eINSTANCE.getTransport();

		/**
		 * The meta object literal for the '{@link system.impl.IMSImpl <em>IMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.IMSImpl
		 * @see system.impl.SystemPackageImpl#getIMS()
		 * @generated
		 */
		EClass IMS = eINSTANCE.getIMS();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__CONDITIONS = eINSTANCE.getIMS_Conditions();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__STEPS = eINSTANCE.getIMS_Steps();

		/**
		 * The meta object literal for the '<em><b>Work Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__WORK_PIECES = eINSTANCE.getIMS_WorkPieces();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__PERSONS = eINSTANCE.getIMS_Persons();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMS__NAME = eINSTANCE.getIMS_Name();

		/**
		 * The meta object literal for the '<em><b>Storages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__STORAGES = eINSTANCE.getIMS_Storages();

		/**
		 * The meta object literal for the '{@link system.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.impl.StorageImpl
		 * @see system.impl.SystemPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__CAPACITY = eINSTANCE.getStorage_Capacity();

		/**
		 * The meta object literal for the '<em><b>Is Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__IS_START = eINSTANCE.getStorage_IsStart();

		/**
		 * The meta object literal for the '<em><b>Is End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__IS_END = eINSTANCE.getStorage_IsEnd();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__HAS = eINSTANCE.getStorage_Has();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__ID = eINSTANCE.getStorage_Id();

	}

} //SystemPackage
