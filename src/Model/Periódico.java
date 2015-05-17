/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Peri�dico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Peri�dico#getPublicacao <em>Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPeri�dico()
 * @model
 * @generated
 */
public interface Peri�dico extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Publicacao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicacao</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicacao</em>' reference.
	 * @see #setPublicacao(Publicacao)
	 * @see Model.ModelPackage#getPeri�dico_Publicacao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicacao getPublicacao();

	/**
	 * Sets the value of the '{@link Model.Peri�dico#getPublicacao <em>Publicacao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicacao</em>' reference.
	 * @see #getPublicacao()
	 * @generated
	 */
	void setPublicacao(Publicacao value);

} // Peri�dico
