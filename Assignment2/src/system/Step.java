/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.Step#getSpeed <em>Speed</em>}</li>
 *   <li>{@link system.Step#getInput <em>Input</em>}</li>
 *   <li>{@link system.Step#getOutput <em>Output</em>}</li>
 *   <li>{@link system.Step#getOverseenBy <em>Overseen By</em>}</li>
 *   <li>{@link system.Step#getInputCondition <em>Input Condition</em>}</li>
 *   <li>{@link system.Step#getAppliesOutputCondition <em>Applies Output Condition</em>}</li>
 *   <li>{@link system.Step#getId <em>Id</em>}</li>
 *   <li>{@link system.Step#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(double)
	 * @see system.SystemPackage#getStep_Speed()
	 * @model required="true"
	 * @generated
	 */
	double getSpeed();

	/**
	 * Sets the value of the '{@link system.Step#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(double value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link system.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see system.SystemPackage#getStep_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkPiece> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link system.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see system.SystemPackage#getStep_Output()
	 * @model required="true"
	 * @generated
	 */
	EList<WorkPiece> getOutput();

	/**
	 * Returns the value of the '<em><b>Overseen By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overseen By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overseen By</em>' reference.
	 * @see #setOverseenBy(Person)
	 * @see system.SystemPackage#getStep_OverseenBy()
	 * @model
	 * @generated
	 */
	Person getOverseenBy();

	/**
	 * Sets the value of the '{@link system.Step#getOverseenBy <em>Overseen By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overseen By</em>' reference.
	 * @see #getOverseenBy()
	 * @generated
	 */
	void setOverseenBy(Person value);

	/**
	 * Returns the value of the '<em><b>Input Condition</b></em>' reference list.
	 * The list contents are of type {@link system.BooleanCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Condition</em>' reference list.
	 * @see system.SystemPackage#getStep_InputCondition()
	 * @model
	 * @generated
	 */
	EList<BooleanCondition> getInputCondition();

	/**
	 * Returns the value of the '<em><b>Applies Output Condition</b></em>' reference list.
	 * The list contents are of type {@link system.BooleanCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies Output Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies Output Condition</em>' reference list.
	 * @see system.SystemPackage#getStep_AppliesOutputCondition()
	 * @model
	 * @generated
	 */
	EList<BooleanCondition> getAppliesOutputCondition();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see system.SystemPackage#getStep_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link system.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference list.
	 * The list contents are of type {@link system.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference list.
	 * @see system.SystemPackage#getStep_Step()
	 * @model
	 * @generated
	 */
	EList<Step> getStep();

} // Step
