/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Peri�dico;
import Model.Publicacao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peri�dico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.Peri�dicoImpl#getPublicacao <em>Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Peri�dicoImpl extends PublicacaoImpl implements Peri�dico {
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
	protected Peri�dicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERI�DICO;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PERI�DICO__PUBLICACAO, oldPublicacao, publicacao));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERI�DICO__PUBLICACAO, oldPublicacao, publicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERI�DICO__PUBLICACAO:
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
			case ModelPackage.PERI�DICO__PUBLICACAO:
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
			case ModelPackage.PERI�DICO__PUBLICACAO:
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
			case ModelPackage.PERI�DICO__PUBLICACAO:
				return publicacao != null;
		}
		return super.eIsSet(featureID);
	}

} //Peri�dicoImpl
