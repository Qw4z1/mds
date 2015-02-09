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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import system.BooleanCondition;
import system.IMS;
import system.Person;
import system.Step;
import system.Storage;
import system.SystemPackage;
import system.WorkPiece;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.IMSImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link system.impl.IMSImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link system.impl.IMSImpl#getWorkPieces <em>Work Pieces</em>}</li>
 *   <li>{@link system.impl.IMSImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link system.impl.IMSImpl#getName <em>Name</em>}</li>
 *   <li>{@link system.impl.IMSImpl#getStorages <em>Storages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IMSImpl extends MinimalEObjectImpl.Container implements IMS {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanCondition> conditions;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The cached value of the '{@link #getWorkPieces() <em>Work Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> workPieces;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The cached value of the '{@link #getStorages() <em>Storages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorages()
	 * @generated
	 * @ordered
	 */
	protected EList<Storage> storages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.IMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<BooleanCondition>(BooleanCondition.class, this, SystemPackage.IMS__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, SystemPackage.IMS__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getWorkPieces() {
		if (workPieces == null) {
			workPieces = new EObjectContainmentEList<WorkPiece>(WorkPiece.class, this, SystemPackage.IMS__WORK_PIECES);
		}
		return workPieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, SystemPackage.IMS__PERSONS);
		}
		return persons;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.IMS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Storage> getStorages() {
		if (storages == null) {
			storages = new EObjectContainmentEList<Storage>(Storage.class, this, SystemPackage.IMS__STORAGES);
		}
		return storages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SystemPackage.IMS__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case SystemPackage.IMS__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case SystemPackage.IMS__WORK_PIECES:
				return ((InternalEList<?>)getWorkPieces()).basicRemove(otherEnd, msgs);
			case SystemPackage.IMS__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case SystemPackage.IMS__STORAGES:
				return ((InternalEList<?>)getStorages()).basicRemove(otherEnd, msgs);
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
			case SystemPackage.IMS__CONDITIONS:
				return getConditions();
			case SystemPackage.IMS__STEPS:
				return getSteps();
			case SystemPackage.IMS__WORK_PIECES:
				return getWorkPieces();
			case SystemPackage.IMS__PERSONS:
				return getPersons();
			case SystemPackage.IMS__NAME:
				return getName();
			case SystemPackage.IMS__STORAGES:
				return getStorages();
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
			case SystemPackage.IMS__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends BooleanCondition>)newValue);
				return;
			case SystemPackage.IMS__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case SystemPackage.IMS__WORK_PIECES:
				getWorkPieces().clear();
				getWorkPieces().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case SystemPackage.IMS__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case SystemPackage.IMS__NAME:
				setName((String)newValue);
				return;
			case SystemPackage.IMS__STORAGES:
				getStorages().clear();
				getStorages().addAll((Collection<? extends Storage>)newValue);
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
			case SystemPackage.IMS__CONDITIONS:
				getConditions().clear();
				return;
			case SystemPackage.IMS__STEPS:
				getSteps().clear();
				return;
			case SystemPackage.IMS__WORK_PIECES:
				getWorkPieces().clear();
				return;
			case SystemPackage.IMS__PERSONS:
				getPersons().clear();
				return;
			case SystemPackage.IMS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SystemPackage.IMS__STORAGES:
				getStorages().clear();
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
			case SystemPackage.IMS__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case SystemPackage.IMS__STEPS:
				return steps != null && !steps.isEmpty();
			case SystemPackage.IMS__WORK_PIECES:
				return workPieces != null && !workPieces.isEmpty();
			case SystemPackage.IMS__PERSONS:
				return persons != null && !persons.isEmpty();
			case SystemPackage.IMS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SystemPackage.IMS__STORAGES:
				return storages != null && !storages.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IMSImpl
