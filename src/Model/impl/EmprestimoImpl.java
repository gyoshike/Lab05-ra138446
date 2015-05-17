/**
 */
package Model.impl;

import Model.Emprestimo;
import Model.Exemplar;
import Model.ModelPackage;
import Model.Usuario;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.EmprestimoImpl#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getData_devolucao <em>Data devolucao</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getDias_atrasados <em>Dias atrasados</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getMulta <em>Multa</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmprestimoImpl extends MinimalEObjectImpl.Container implements Emprestimo {
	/**
	 * The cached value of the '{@link #getExemplar() <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemplar()
	 * @generated
	 * @ordered
	 */
	protected Exemplar exemplar;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected Usuario usuario;

	/**
	 * The default value of the '{@link #getData_devolucao() <em>Data devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_devolucao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_DEVOLUCAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_devolucao() <em>Data devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_devolucao()
	 * @generated
	 * @ordered
	 */
	protected Date data_devolucao = DATA_DEVOLUCAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDias_atrasados() <em>Dias atrasados</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDias_atrasados()
	 * @generated
	 * @ordered
	 */
	protected static final int DIAS_ATRASADOS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDias_atrasados() <em>Dias atrasados</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDias_atrasados()
	 * @generated
	 * @ordered
	 */
	protected int dias_atrasados = DIAS_ATRASADOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulta() <em>Multa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulta()
	 * @generated
	 * @ordered
	 */
	protected static final float MULTA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMulta() <em>Multa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulta()
	 * @generated
	 * @ordered
	 */
	protected float multa = MULTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar getExemplar() {
		if (exemplar != null && exemplar.eIsProxy()) {
			InternalEObject oldExemplar = (InternalEObject)exemplar;
			exemplar = (Exemplar)eResolveProxy(oldExemplar);
			if (exemplar != oldExemplar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__EXEMPLAR, oldExemplar, exemplar));
			}
		}
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar basicGetExemplar() {
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExemplar(Exemplar newExemplar) {
		Exemplar oldExemplar = exemplar;
		exemplar = newExemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__EXEMPLAR, oldExemplar, exemplar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario getUsuario() {
		if (usuario != null && usuario.eIsProxy()) {
			InternalEObject oldUsuario = (InternalEObject)usuario;
			usuario = (Usuario)eResolveProxy(oldUsuario);
			if (usuario != oldUsuario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__USUARIO, oldUsuario, usuario));
			}
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario basicGetUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(Usuario newUsuario) {
		Usuario oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getData_devolucao() {
		return data_devolucao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_devolucao(Date newData_devolucao) {
		Date oldData_devolucao = data_devolucao;
		data_devolucao = newData_devolucao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO, oldData_devolucao, data_devolucao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDias_atrasados() {
		return dias_atrasados;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDias_atrasados(int newDias_atrasados) {
		int oldDias_atrasados = dias_atrasados;
		dias_atrasados = newDias_atrasados;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DIAS_ATRASADOS, oldDias_atrasados, dias_atrasados));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMulta() {
		return multa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulta(float newMulta) {
		float oldMulta = multa;
		multa = newMulta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__MULTA, oldMulta, multa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				if (resolve) return getExemplar();
				return basicGetExemplar();
			case ModelPackage.EMPRESTIMO__USUARIO:
				if (resolve) return getUsuario();
				return basicGetUsuario();
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				return getData_devolucao();
			case ModelPackage.EMPRESTIMO__DIAS_ATRASADOS:
				return getDias_atrasados();
			case ModelPackage.EMPRESTIMO__MULTA:
				return getMulta();
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
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				setExemplar((Exemplar)newValue);
				return;
			case ModelPackage.EMPRESTIMO__USUARIO:
				setUsuario((Usuario)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				setData_devolucao((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DIAS_ATRASADOS:
				setDias_atrasados((Integer)newValue);
				return;
			case ModelPackage.EMPRESTIMO__MULTA:
				setMulta((Float)newValue);
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
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				setExemplar((Exemplar)null);
				return;
			case ModelPackage.EMPRESTIMO__USUARIO:
				setUsuario((Usuario)null);
				return;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				setData_devolucao(DATA_DEVOLUCAO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__DIAS_ATRASADOS:
				setDias_atrasados(DIAS_ATRASADOS_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__MULTA:
				setMulta(MULTA_EDEFAULT);
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
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				return exemplar != null;
			case ModelPackage.EMPRESTIMO__USUARIO:
				return usuario != null;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				return DATA_DEVOLUCAO_EDEFAULT == null ? data_devolucao != null : !DATA_DEVOLUCAO_EDEFAULT.equals(data_devolucao);
			case ModelPackage.EMPRESTIMO__DIAS_ATRASADOS:
				return dias_atrasados != DIAS_ATRASADOS_EDEFAULT;
			case ModelPackage.EMPRESTIMO__MULTA:
				return multa != MULTA_EDEFAULT;
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
		result.append(" (data_devolucao: ");
		result.append(data_devolucao);
		result.append(", dias_atrasados: ");
		result.append(dias_atrasados);
		result.append(", multa: ");
		result.append(multa);
		result.append(')');
		return result.toString();
	}

} //EmprestimoImpl
