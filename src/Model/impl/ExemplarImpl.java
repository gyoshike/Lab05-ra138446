/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ExemplarImpl#isBloqueado <em>Bloqueado</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#isEmprestado <em>Emprestado</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#isReservado <em>Reservado</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getRegistro <em>Registro</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The default value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOQUEADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected boolean bloqueado = BLOQUEADO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmprestado() <em>Emprestado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmprestado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPRESTADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmprestado() <em>Emprestado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmprestado()
	 * @generated
	 * @ordered
	 */
	protected boolean emprestado = EMPRESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #isReservado() <em>Reservado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReservado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReservado() <em>Reservado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReservado()
	 * @generated
	 * @ordered
	 */
	protected boolean reservado = RESERVADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistro() <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistro() <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected int registro = REGISTRO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBloqueado() {
		return bloqueado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloqueado(boolean newBloqueado) {
		boolean oldBloqueado = bloqueado;
		bloqueado = newBloqueado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__BLOQUEADO, oldBloqueado, bloqueado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmprestado() {
		return emprestado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmprestado(boolean newEmprestado) {
		boolean oldEmprestado = emprestado;
		emprestado = newEmprestado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__EMPRESTADO, oldEmprestado, emprestado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReservado() {
		return reservado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservado(boolean newReservado) {
		boolean oldReservado = reservado;
		reservado = newReservado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__RESERVADO, oldReservado, reservado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistro() {
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistro(int newRegistro) {
		int oldRegistro = registro;
		registro = newRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__REGISTRO, oldRegistro, registro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				return isBloqueado();
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				return isEmprestado();
			case ModelPackage.EXEMPLAR__RESERVADO:
				return isReservado();
			case ModelPackage.EXEMPLAR__REGISTRO:
				return getRegistro();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				setBloqueado((Boolean)newValue);
				return;
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				setEmprestado((Boolean)newValue);
				return;
			case ModelPackage.EXEMPLAR__RESERVADO:
				setReservado((Boolean)newValue);
				return;
			case ModelPackage.EXEMPLAR__REGISTRO:
				setRegistro((Integer)newValue);
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
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				setBloqueado(BLOQUEADO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				setEmprestado(EMPRESTADO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__RESERVADO:
				setReservado(RESERVADO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__REGISTRO:
				setRegistro(REGISTRO_EDEFAULT);
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
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				return bloqueado != BLOQUEADO_EDEFAULT;
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				return emprestado != EMPRESTADO_EDEFAULT;
			case ModelPackage.EXEMPLAR__RESERVADO:
				return reservado != RESERVADO_EDEFAULT;
			case ModelPackage.EXEMPLAR__REGISTRO:
				return registro != REGISTRO_EDEFAULT;
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
		result.append(" (bloqueado: ");
		result.append(bloqueado);
		result.append(", emprestado: ");
		result.append(emprestado);
		result.append(", reservado: ");
		result.append(reservado);
		result.append(", registro: ");
		result.append(registro);
		result.append(')');
		return result.toString();
	}

} //ExemplarImpl
