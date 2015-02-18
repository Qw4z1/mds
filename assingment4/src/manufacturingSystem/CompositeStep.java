/**
 */
package manufacturingSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link manufacturingSystem.CompositeStep#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see manufacturingSystem.ManufacturingSystemPackage#getCompositeStep()
 * @model
 * @generated
 */
public interface CompositeStep extends Step {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(ManufacturingSystem)
	 * @see manufacturingSystem.ManufacturingSystemPackage#getCompositeStep_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ManufacturingSystem getContains();

	/**
	 * Sets the value of the '{@link manufacturingSystem.CompositeStep#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(ManufacturingSystem value);

} // CompositeStep
