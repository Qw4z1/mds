/**
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import system.BooleanCondition;
import system.Step;
import system.SystemPackage;
import system.WorkPiece;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.BooleanConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link system.impl.BooleanConditionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link system.impl.BooleanConditionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link system.impl.BooleanConditionImpl#getForOutput <em>For Output</em>}</li>
 *   <li>{@link system.impl.BooleanConditionImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanConditionImpl extends MinimalEObjectImpl.Container implements BooleanCondition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> input;

	/**
	 * The cached value of the '{@link #getForOutput() <em>For Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> forOutput;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.BOOLEAN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.BOOLEAN_CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.BOOLEAN_CONDITION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Step>(Step.class, this, SystemPackage.BOOLEAN_CONDITION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getForOutput() {
		if (forOutput == null) {
			forOutput = new EObjectResolvingEList<Step>(Step.class, this, SystemPackage.BOOLEAN_CONDITION__FOR_OUTPUT);
		}
		return forOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList.ManyInverse<WorkPiece>(WorkPiece.class, this, SystemPackage.BOOLEAN_CONDITION__CONTAINS, SystemPackage.WORK_PIECE__INLCUDED_IN);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.BOOLEAN_CONDITION__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.BOOLEAN_CONDITION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.BOOLEAN_CONDITION__NAME:
				return getName();
			case SystemPackage.BOOLEAN_CONDITION__DESCRIPTION:
				return getDescription();
			case SystemPackage.BOOLEAN_CONDITION__INPUT:
				return getInput();
			case SystemPackage.BOOLEAN_CONDITION__FOR_OUTPUT:
				return getForOutput();
			case SystemPackage.BOOLEAN_CONDITION__CONTAINS:
				return getContains();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.BOOLEAN_CONDITION__NAME:
				setName((String)newValue);
				return;
			case SystemPackage.BOOLEAN_CONDITION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SystemPackage.BOOLEAN_CONDITION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Step>)newValue);
				return;
			case SystemPackage.BOOLEAN_CONDITION__FOR_OUTPUT:
				getForOutput().clear();
				getForOutput().addAll((Collection<? extends Step>)newValue);
				return;
			case SystemPackage.BOOLEAN_CONDITION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends WorkPiece>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.BOOLEAN_CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SystemPackage.BOOLEAN_CONDITION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SystemPackage.BOOLEAN_CONDITION__INPUT:
				getInput().clear();
				return;
			case SystemPackage.BOOLEAN_CONDITION__FOR_OUTPUT:
				getForOutput().clear();
				return;
			case SystemPackage.BOOLEAN_CONDITION__CONTAINS:
				getContains().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.BOOLEAN_CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SystemPackage.BOOLEAN_CONDITION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SystemPackage.BOOLEAN_CONDITION__INPUT:
				return input != null && !input.isEmpty();
			case SystemPackage.BOOLEAN_CONDITION__FOR_OUTPUT:
				return forOutput != null && !forOutput.isEmpty();
			case SystemPackage.BOOLEAN_CONDITION__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //BooleanConditionImpl
