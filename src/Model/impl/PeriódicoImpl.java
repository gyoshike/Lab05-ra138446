/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Periódico;
import Model.Publicacao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periódico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PeriódicoImpl#getPublicacao <em>Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriódicoImpl extends PublicacaoImpl implements Periódico {
	/**
	 * The cached value of the '{@link #getPublicacao() <em>Publicacao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicacao()
	 * @generated
	 * @ordered
	 */
	protected Publicacao publicacao;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriódicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERIÓDICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao getPublicacao() {
		if (publicacao != null && publicacao.eIsProxy()) {
			InternalEObject oldPublicacao = (InternalEObject)publicacao;
			publicacao = (Publicacao)eResolveProxy(oldPublicacao);
			if (publicacao != oldPublicacao) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PERIÓDICO__PUBLICACAO, oldPublicacao, publicacao));
			}
		}
		return publicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao basicGetPublicacao() {
		return publicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicacao(Publicacao newPublicacao) {
		Publicacao oldPublicacao = publicacao;
		publicacao = newPublicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIÓDICO__PUBLICACAO, oldPublicacao, publicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERIÓDICO__PUBLICACAO:
				if (resolve) return getPublicacao();
				return basicGetPublicacao();
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
			case ModelPackage.PERIÓDICO__PUBLICACAO:
				setPublicacao((Publicacao)newValue);
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
			case ModelPackage.PERIÓDICO__PUBLICACAO:
				setPublicacao((Publicacao)null);
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
			case ModelPackage.PERIÓDICO__PUBLICACAO:
				return publicacao != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriódicoImpl
