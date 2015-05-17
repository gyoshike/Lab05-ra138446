/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Publicacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Publicacao#getAutor <em>Autor</em>}</li>
 *   <li>{@link Model.Publicacao#getData_publicacao <em>Data publicacao</em>}</li>
 *   <li>{@link Model.Publicacao#getTitulo <em>Titulo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPublicacao()
 * @model
 * @generated
 */
public interface Publicacao extends EObject {
	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see Model.ModelPackage#getPublicacao_Autor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Data publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data publicacao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data publicacao</em>' attribute.
	 * @see #setData_publicacao(Date)
	 * @see Model.ModelPackage#getPublicacao_Data_publicacao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getData_publicacao();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getData_publicacao <em>Data publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data publicacao</em>' attribute.
	 * @see #getData_publicacao()
	 * @generated
	 */
	void setData_publicacao(Date value);

	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see Model.ModelPackage#getPublicacao_Titulo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link Model.Publicacao#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

} // Publicacao
