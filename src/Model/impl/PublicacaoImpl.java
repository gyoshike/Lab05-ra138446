/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Publicacao;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PublicacaoImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.impl.PublicacaoImpl#getData_publicacao <em>Data publicacao</em>}</li>
 *   <li>{@link Model.impl.PublicacaoImpl#getTitulo <em>Titulo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicacaoImpl extends MinimalEObjectImpl.Container implements Publicacao {
	/**
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_publicacao() <em>Data publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_publicacao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_PUBLICACAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_publicacao() <em>Data publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_publicacao()
	 * @generated
	 * @ordered
	 */
	protected Date data_publicacao = DATA_PUBLICACAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicacaoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PUBLICACAO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getData_publicacao() {
		return data_publicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_publicacao(Date newData_publicacao) {
		Date oldData_publicacao = data_publicacao;
		data_publicacao = newData_publicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__DATA_PUBLICACAO, oldData_publicacao, data_publicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PUBLICACAO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PUBLICACAO__AUTOR:
				return getAutor();
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				return getData_publicacao();
			case ModelPackage.PUBLICACAO__TITULO:
				return getTitulo();
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
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor((String)newValue);
				return;
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				setData_publicacao((Date)newValue);
				return;
			case ModelPackage.PUBLICACAO__TITULO:
				setTitulo((String)newValue);
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
			case ModelPackage.PUBLICACAO__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				setData_publicacao(DATA_PUBLICACAO_EDEFAULT);
				return;
			case ModelPackage.PUBLICACAO__TITULO:
				setTitulo(TITULO_EDEFAULT);
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
			case ModelPackage.PUBLICACAO__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case ModelPackage.PUBLICACAO__DATA_PUBLICACAO:
				return DATA_PUBLICACAO_EDEFAULT == null ? data_publicacao != null : !DATA_PUBLICACAO_EDEFAULT.equals(data_publicacao);
			case ModelPackage.PUBLICACAO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
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
		result.append(" (autor: ");
		result.append(autor);
		result.append(", data_publicacao: ");
		result.append(data_publicacao);
		result.append(", titulo: ");
		result.append(titulo);
		result.append(')');
		return result.toString();
	}

} //PublicacaoImpl
