/**
 */
package manufacturingSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Responsible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manufacturingSystem.Responsible#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getResponsible()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='secondEachResponsibleThree'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot secondEachResponsibleThree='\n\t\tlet ms:Integer = Step.allInstances()->select(responsible=self)->size() in ms>0 and ms<4'"
 * @generated
 */
public interface Responsible extends EObject {
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
	 * @see manufacturingSystem.ManufacturingSystemPackage#getResponsible_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link manufacturingSystem.Responsible#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Responsible
