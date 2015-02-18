/**
 */
package manufacturingSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manufacturingSystem.StoragePoint#getStores <em>Stores</em>}</li>
 * </ul>
 * </p>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getStoragePoint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='fourNoStartStorage fiveNoEndStorage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot fourNoStartStorage='\n\t\tManufacturingSystem.allInstances()->collect(start)->includes(self) implies ManufacturingSystemElement.allInstances() -> collect(transition) -> excludes(self)' fiveNoEndStorage='\n\t\tManufacturingSystem.allInstances()->collect(end)->includes(self) implies self.transition->isEmpty()'"
 * @generated
 */
public interface StoragePoint extends ManufacturingSystemElement {
	/**
	 * Returns the value of the '<em><b>Stores</b></em>' reference list.
	 * The list contents are of type {@link manufacturingSystem.WorkPieceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stores</em>' reference list.
	 * @see manufacturingSystem.ManufacturingSystemPackage#getStoragePoint_Stores()
	 * @model
	 * @generated
	 */
	EList<WorkPieceType> getStores();

} // StoragePoint
