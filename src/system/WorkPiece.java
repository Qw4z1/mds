/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Piece</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.WorkPiece#getFrom <em>From</em>}</li>
 *   <li>{@link system.WorkPiece#getTo <em>To</em>}</li>
 *   <li>{@link system.WorkPiece#getId <em>Id</em>}</li>
 *   <li>{@link system.WorkPiece#getIsStored <em>Is Stored</em>}</li>
 *   <li>{@link system.WorkPiece#getType <em>Type</em>}</li>
 *   <li>{@link system.WorkPiece#getInlcudedIn <em>Inlcuded In</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getWorkPiece()
 * @model
 * @generated
 */
public interface WorkPiece extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Step)
	 * @see system.SystemPackage#getWorkPiece_From()
	 * @model required="true"
	 * @generated
	 */
	Step getFrom();

	/**
	 * Sets the value of the '{@link system.WorkPiece#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Step value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Step)
	 * @see system.SystemPackage#getWorkPiece_To()
	 * @model required="true"
	 * @generated
	 */
	Step getTo();

	/**
	 * Sets the value of the '{@link system.WorkPiece#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Step value);

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
	 * @see system.SystemPackage#getWorkPiece_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link system.WorkPiece#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Stored</b></em>' reference list.
	 * The list contents are of type {@link system.Storage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Stored</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Stored</em>' reference list.
	 * @see system.SystemPackage#getWorkPiece_IsStored()
	 * @model
	 * @generated
	 */
	EList<Storage> getIsStored();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see system.SystemPackage#getWorkPiece_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link system.WorkPiece#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Inlcuded In</b></em>' reference list.
	 * The list contents are of type {@link system.BooleanCondition}.
	 * It is bidirectional and its opposite is '{@link system.BooleanCondition#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inlcuded In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inlcuded In</em>' reference list.
	 * @see system.SystemPackage#getWorkPiece_InlcudedIn()
	 * @see system.BooleanCondition#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	EList<BooleanCondition> getInlcudedIn();

} // WorkPiece
