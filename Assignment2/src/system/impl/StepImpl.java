/**
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import system.BooleanCondition;
import system.Person;
import system.Step;
import system.SystemPackage;
import system.WorkPiece;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.StepImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link system.impl.StepImpl#getInput <em>Input</em>}</li>
 *   <li>{@link system.impl.StepImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link system.impl.StepImpl#getOverseenBy <em>Overseen By</em>}</li>
 *   <li>{@link system.impl.StepImpl#getInputCondition <em>Input Condition</em>}</li>
 *   <li>{@link system.impl.StepImpl#getAppliesOutputCondition <em>Applies Output Condition</em>}</li>
 *   <li>{@link system.impl.StepImpl#getId <em>Id</em>}</li>
 *   <li>{@link system.impl.StepImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkPiece> output;

	/**
	 * The cached value of the '{@link #getOverseenBy() <em>Overseen By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverseenBy()
	 * @generated
	 * @ordered
	 */
	protected Person overseenBy;

	/**
	 * The cached value of the '{@link #getInputCondition() <em>Input Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanCondition> inputCondition;

	/**
	 * The cached value of the '{@link #getAppliesOutputCondition() <em>Applies Output Condition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesOutputCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanCondition> appliesOutputCondition;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SystemPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.STEP__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<WorkPiece>(WorkPiece.class, this, SystemPackage.STEP__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkPiece> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<WorkPiece>(WorkPiece.class, this, SystemPackage.STEP__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getOverseenBy() {
		if (overseenBy != null && overseenBy.eIsProxy()) {
			InternalEObject oldOverseenBy = (InternalEObject)overseenBy;
			overseenBy = (Person)eResolveProxy(oldOverseenBy);
			if (overseenBy != oldOverseenBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SystemPackage.STEP__OVERSEEN_BY, oldOverseenBy, overseenBy));
			}
		}
		return overseenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetOverseenBy() {
		return overseenBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverseenBy(Person newOverseenBy) {
		Person oldOverseenBy = overseenBy;
		overseenBy = newOverseenBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.STEP__OVERSEEN_BY, oldOverseenBy, overseenBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanCondition> getInputCondition() {
		if (inputCondition == null) {
			inputCondition = new EObjectResolvingEList<BooleanCondition>(BooleanCondition.class, this, SystemPackage.STEP__INPUT_CONDITION);
		}
		return inputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanCondition> getAppliesOutputCondition() {
		if (appliesOutputCondition == null) {
			appliesOutputCondition = new EObjectResolvingEList<BooleanCondition>(BooleanCondition.class, this, SystemPackage.STEP__APPLIES_OUTPUT_CONDITION);
		}
		return appliesOutputCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SystemPackage.STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectResolvingEList<Step>(Step.class, this, SystemPackage.STEP__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.STEP__SPEED:
				return getSpeed();
			case SystemPackage.STEP__INPUT:
				return getInput();
			case SystemPackage.STEP__OUTPUT:
				return getOutput();
			case SystemPackage.STEP__OVERSEEN_BY:
				if (resolve) return getOverseenBy();
				return basicGetOverseenBy();
			case SystemPackage.STEP__INPUT_CONDITION:
				return getInputCondition();
			case SystemPackage.STEP__APPLIES_OUTPUT_CONDITION:
				return getAppliesOutputCondition();
			case SystemPackage.STEP__ID:
				return getId();
			case SystemPackage.STEP__STEP:
				return getStep();
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
			case SystemPackage.STEP__SPEED:
				setSpeed((Double)newValue);
				return;
			case SystemPackage.STEP__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case SystemPackage.STEP__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends WorkPiece>)newValue);
				return;
			case SystemPackage.STEP__OVERSEEN_BY:
				setOverseenBy((Person)newValue);
				return;
			case SystemPackage.STEP__INPUT_CONDITION:
				getInputCondition().clear();
				getInputCondition().addAll((Collection<? extends BooleanCondition>)newValue);
				return;
			case SystemPackage.STEP__APPLIES_OUTPUT_CONDITION:
				getAppliesOutputCondition().clear();
				getAppliesOutputCondition().addAll((Collection<? extends BooleanCondition>)newValue);
				return;
			case SystemPackage.STEP__ID:
				setId((String)newValue);
				return;
			case SystemPackage.STEP__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
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
			case SystemPackage.STEP__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case SystemPackage.STEP__INPUT:
				getInput().clear();
				return;
			case SystemPackage.STEP__OUTPUT:
				getOutput().clear();
				return;
			case SystemPackage.STEP__OVERSEEN_BY:
				setOverseenBy((Person)null);
				return;
			case SystemPackage.STEP__INPUT_CONDITION:
				getInputCondition().clear();
				return;
			case SystemPackage.STEP__APPLIES_OUTPUT_CONDITION:
				getAppliesOutputCondition().clear();
				return;
			case SystemPackage.STEP__ID:
				setId(ID_EDEFAULT);
				return;
			case SystemPackage.STEP__STEP:
				getStep().clear();
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
			case SystemPackage.STEP__SPEED:
				return speed != SPEED_EDEFAULT;
			case SystemPackage.STEP__INPUT:
				return input != null && !input.isEmpty();
			case SystemPackage.STEP__OUTPUT:
				return output != null && !output.isEmpty();
			case SystemPackage.STEP__OVERSEEN_BY:
				return overseenBy != null;
			case SystemPackage.STEP__INPUT_CONDITION:
				return inputCondition != null && !inputCondition.isEmpty();
			case SystemPackage.STEP__APPLIES_OUTPUT_CONDITION:
				return appliesOutputCondition != null && !appliesOutputCondition.isEmpty();
			case SystemPackage.STEP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SystemPackage.STEP__STEP:
				return step != null && !step.isEmpty();
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
		result.append(" (speed: ");
		result.append(speed);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //StepImpl
