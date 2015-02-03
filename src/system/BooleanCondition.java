/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.BooleanCondition#getName <em>Name</em>}</li>
 *   <li>{@link system.BooleanCondition#getDescription <em>Description</em>}</li>
 *   <li>{@link system.BooleanCondition#getInput <em>Input</em>}</li>
 *   <li>{@link system.BooleanCondition#getForOutput <em>For Output</em>}</li>
 *   <li>{@link system.BooleanCondition#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getBooleanCondition()
 * @model
 * @generated
 */
public interface BooleanCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see system.SystemPackage#getBooleanCondition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link system.BooleanCondition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see system.SystemPackage#getBooleanCondition_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link system.BooleanCondition#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link system.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see system.SystemPackage#getBooleanCondition_Input()
	 * @model
	 * @generated
	 */
	EList<Step> getInput();

	/**
	 * Returns the value of the '<em><b>For Output</b></em>' reference list.
	 * The list contents are of type {@link system.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Output</em>' reference list.
	 * @see system.SystemPackage#getBooleanCondition_ForOutput()
	 * @model
	 * @generated
	 */
	EList<Step> getForOutput();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link system.WorkPiece}.
	 * It is bidirectional and its opposite is '{@link system.WorkPiece#getInlcudedIn <em>Inlcuded In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see system.SystemPackage#getBooleanCondition_Contains()
	 * @see system.WorkPiece#getInlcudedIn
	 * @model opposite="inlcudedIn" required="true"
	 * @generated
	 */
	EList<WorkPiece> getContains();

} // BooleanCondition
