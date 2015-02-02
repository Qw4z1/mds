/**
 */
package system;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link system.IMS#getConditions <em>Conditions</em>}</li>
 *   <li>{@link system.IMS#getSteps <em>Steps</em>}</li>
 *   <li>{@link system.IMS#getWorkPieces <em>Work Pieces</em>}</li>
 *   <li>{@link system.IMS#getPersons <em>Persons</em>}</li>
 *   <li>{@link system.IMS#getName <em>Name</em>}</li>
 *   <li>{@link system.IMS#getStorages <em>Storages</em>}</li>
 * </ul>
 * </p>
 *
 * @see system.SystemPackage#getIMS()
 * @model
 * @generated
 */
public interface IMS extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link system.BooleanCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see system.SystemPackage#getIMS_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<BooleanCondition> getConditions();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link system.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see system.SystemPackage#getIMS_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Work Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link system.WorkPiece}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Pieces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Pieces</em>' containment reference list.
	 * @see system.SystemPackage#getIMS_WorkPieces()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkPiece> getWorkPieces();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link system.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see system.SystemPackage#getIMS_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see system.SystemPackage#getIMS_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link system.IMS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Storages</b></em>' containment reference list.
	 * The list contents are of type {@link system.Storage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storages</em>' containment reference list.
	 * @see system.SystemPackage#getIMS_Storages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Storage> getStorages();

} // IMS
