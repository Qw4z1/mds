/**
 */
package manufacturingSystem.util;

import java.util.Map;

import manufacturingSystem.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see manufacturingSystem.ManufacturingSystemPackage
 * @generated
 */
public class ManufacturingSystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ManufacturingSystemValidator INSTANCE = new ManufacturingSystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "manufacturingSystem";

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
	public ManufacturingSystemValidator() {
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
	  return ManufacturingSystemPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ManufacturingSystemPackage.WORK_PIECE:
				return validateWorkPiece((WorkPiece)value, diagnostics, context);
			case ManufacturingSystemPackage.MANUFACTURING_STEP:
				return validateManufacturingStep((ManufacturingStep)value, diagnostics, context);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM:
				return validateManufacturingSystem((ManufacturingSystem)value, diagnostics, context);
			case ManufacturingSystemPackage.TRANSPORT_STEP:
				return validateTransportStep((TransportStep)value, diagnostics, context);
			case ManufacturingSystemPackage.QUALITY_ASSURANCE_STEP:
				return validateQualityAssuranceStep((QualityAssuranceStep)value, diagnostics, context);
			case ManufacturingSystemPackage.STEP:
				return validateStep((Step)value, diagnostics, context);
			case ManufacturingSystemPackage.RESPONSIBLE:
				return validateResponsible((Responsible)value, diagnostics, context);
			case ManufacturingSystemPackage.INPUT_CONDITION:
				return validateInputCondition((InputCondition)value, diagnostics, context);
			case ManufacturingSystemPackage.STORAGE_POINT:
				return validateStoragePoint((StoragePoint)value, diagnostics, context);
			case ManufacturingSystemPackage.MANUFACTURING_SYSTEM_ELEMENT:
				return validateManufacturingSystemElement((ManufacturingSystemElement)value, diagnostics, context);
			case ManufacturingSystemPackage.COMPOSITE_STEP:
				return validateCompositeStep((CompositeStep)value, diagnostics, context);
			case ManufacturingSystemPackage.WORK_PIECE_TYPE:
				return validateWorkPieceType((WorkPieceType)value, diagnostics, context);
			case ManufacturingSystemPackage.OUTPUT_DECISION:
				return validateOutputDecision((OutputDecision)value, diagnostics, context);
			case ManufacturingSystemPackage.WORK_PIECE_CONDITION:
				return validateWorkPieceCondition((WorkPieceCondition)value, diagnostics, context);
			case ManufacturingSystemPackage.BINARY_CONDITION:
				return validateBinaryCondition((BinaryCondition)value, diagnostics, context);
			case ManufacturingSystemPackage.NEGATION:
				return validateNegation((Negation)value, diagnostics, context);
			case ManufacturingSystemPackage.BINARY_TYPE:
				return validateBinaryType((BinaryType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPiece(WorkPiece workPiece, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPiece, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingStep(ManufacturingStep manufacturingStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacturingStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_oneResponsible(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_sevenOutputInputs(manufacturingStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_nineForEachStep(manufacturingStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystem(ManufacturingSystem manufacturingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacturingSystem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacturingSystem, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystem_threeThereShallNotExist(manufacturingSystem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the threeThereShallNotExist constraint of '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANUFACTURING_SYSTEM__THREE_THERE_SHALL_NOT_EXIST__EEXPRESSION = "\n" +
		"\t\tself.consistsOf->selectByKind(Step).oclAsType(ManufacturingSystemElement).responsible->excludes(self.responsible)";

	/**
	 * Validates the threeThereShallNotExist constraint of '<em>Manufacturing System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystem_threeThereShallNotExist(ManufacturingSystem manufacturingSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM,
				 manufacturingSystem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "threeThereShallNotExist",
				 MANUFACTURING_SYSTEM__THREE_THERE_SHALL_NOT_EXIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransportStep(TransportStep transportStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transportStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_oneResponsible(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_sevenOutputInputs(transportStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_nineForEachStep(transportStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityAssuranceStep(QualityAssuranceStep qualityAssuranceStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualityAssuranceStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_oneResponsible(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_sevenOutputInputs(qualityAssuranceStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_nineForEachStep(qualityAssuranceStep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(step, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_oneResponsible(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_sevenOutputInputs(step, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_nineForEachStep(step, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneResponsible constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEP__ONE_RESPONSIBLE__EEXPRESSION = "\n" +
		"\t\tself.responsible->size() = 1";

	/**
	 * Validates the oneResponsible constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_oneResponsible(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.STEP,
				 step,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneResponsible",
				 STEP__ONE_RESPONSIBLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the sevenOutputInputs constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEP__SEVEN_OUTPUT_INPUTS__EEXPRESSION = "\n" +
		"\t\tStep.allInstances()->select(transition->includes(self))->forAll(output.outputTypes->excludesAll(self.input->selectByType(WorkPieceCondition).requiresType) = false)";

	/**
	 * Validates the sevenOutputInputs constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_sevenOutputInputs(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.STEP,
				 step,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sevenOutputInputs",
				 STEP__SEVEN_OUTPUT_INPUTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nineForEachStep constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STEP__NINE_FOR_EACH_STEP__EEXPRESSION = "\n" +
		"\t\tStep.allInstances()->select(transition->includes(self))->selectByKind(Step)->forAll(speed<=self.speed)";

	/**
	 * Validates the nineForEachStep constraint of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStep_nineForEachStep(Step step, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.STEP,
				 step,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "nineForEachStep",
				 STEP__NINE_FOR_EACH_STEP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsible(Responsible responsible, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsible, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(responsible, diagnostics, context);
		if (result || diagnostics != null) result &= validateResponsible_secondEachResponsibleThree(responsible, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the secondEachResponsibleThree constraint of '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESPONSIBLE__SECOND_EACH_RESPONSIBLE_THREE__EEXPRESSION = "\n" +
		"\t\tlet ms:Integer = Step.allInstances()->select(responsible=self)->size() in ms>0 and ms<4";

	/**
	 * Validates the secondEachResponsibleThree constraint of '<em>Responsible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsible_secondEachResponsibleThree(Responsible responsible, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.RESPONSIBLE,
				 responsible,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "secondEachResponsibleThree",
				 RESPONSIBLE__SECOND_EACH_RESPONSIBLE_THREE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputCondition(InputCondition inputCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragePoint(StoragePoint storagePoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storagePoint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoragePoint_fourNoStartStorage(storagePoint, diagnostics, context);
		if (result || diagnostics != null) result &= validateStoragePoint_fiveNoEndStorage(storagePoint, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the fourNoStartStorage constraint of '<em>Storage Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORAGE_POINT__FOUR_NO_START_STORAGE__EEXPRESSION = "\n" +
		"\t\tManufacturingSystem.allInstances()->collect(start)->includes(self) implies ManufacturingSystemElement.allInstances() -> collect(transition) -> excludes(self)";

	/**
	 * Validates the fourNoStartStorage constraint of '<em>Storage Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragePoint_fourNoStartStorage(StoragePoint storagePoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.STORAGE_POINT,
				 storagePoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "fourNoStartStorage",
				 STORAGE_POINT__FOUR_NO_START_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the fiveNoEndStorage constraint of '<em>Storage Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORAGE_POINT__FIVE_NO_END_STORAGE__EEXPRESSION = "\n" +
		"\t\tManufacturingSystem.allInstances()->collect(end)->includes(self) implies self.transition->isEmpty()";

	/**
	 * Validates the fiveNoEndStorage constraint of '<em>Storage Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragePoint_fiveNoEndStorage(StoragePoint storagePoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.STORAGE_POINT,
				 storagePoint,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "fiveNoEndStorage",
				 STORAGE_POINT__FIVE_NO_END_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystemElement(ManufacturingSystemElement manufacturingSystemElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manufacturingSystemElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manufacturingSystemElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(manufacturingSystemElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the fiveTransitionShallOnlyConnect constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MANUFACTURING_SYSTEM_ELEMENT__FIVE_TRANSITION_SHALL_ONLY_CONNECT__EEXPRESSION = "\n" +
		"\t\tManufacturingSystem.allInstances()->select(consistsOf->includes(self)).ManufacturingSystem::consistsOf->includesAll(self.transition)";

	/**
	 * Validates the fiveTransitionShallOnlyConnect constraint of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(ManufacturingSystemElement manufacturingSystemElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.MANUFACTURING_SYSTEM_ELEMENT,
				 manufacturingSystemElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "fiveTransitionShallOnlyConnect",
				 MANUFACTURING_SYSTEM_ELEMENT__FIVE_TRANSITION_SHALL_ONLY_CONNECT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeStep(CompositeStep compositeStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(compositeStep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateManufacturingSystemElement_fiveTransitionShallOnlyConnect(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_oneResponsible(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_sevenOutputInputs(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateStep_nineForEachStep(compositeStep, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeStep_eightForCompositeSteps(compositeStep, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the eightForCompositeSteps constraint of '<em>Composite Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_STEP__EIGHT_FOR_COMPOSITE_STEPS__EEXPRESSION = "\n" +
		"\t\tself.input->selectByKind(WorkPieceCondition).requiresType ->includesAll(self.contains.start.stores)\n" +
		"\t\tand self.output.outputTypes->includesAll(self.contains.end.stores)";

	/**
	 * Validates the eightForCompositeSteps constraint of '<em>Composite Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeStep_eightForCompositeSteps(CompositeStep compositeStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ManufacturingSystemPackage.Literals.COMPOSITE_STEP,
				 compositeStep,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "eightForCompositeSteps",
				 COMPOSITE_STEP__EIGHT_FOR_COMPOSITE_STEPS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPieceType(WorkPieceType workPieceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPieceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputDecision(OutputDecision outputDecision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputDecision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkPieceCondition(WorkPieceCondition workPieceCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workPieceCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryCondition(BinaryCondition binaryCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNegation(Negation negation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(negation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryType(BinaryType binaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //ManufacturingSystemValidator
