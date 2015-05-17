/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}</li>
 *   <li>{@link Model.Exemplar#isEmprestado <em>Emprestado</em>}</li>
 *   <li>{@link Model.Exemplar#isReservado <em>Reservado</em>}</li>
 *   <li>{@link Model.Exemplar#getRegistro <em>Registro</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloqueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloqueado</em>' attribute.
	 * @see #setBloqueado(boolean)
	 * @see Model.ModelPackage#getExemplar_Bloqueado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isBloqueado();

	/**
	 * Sets the value of the '{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloqueado</em>' attribute.
	 * @see #isBloqueado()
	 * @generated
	 */
	void setBloqueado(boolean value);

	/**
	 * Returns the value of the '<em><b>Emprestado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emprestado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emprestado</em>' attribute.
	 * @see #setEmprestado(boolean)
	 * @see Model.ModelPackage#getExemplar_Emprestado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isEmprestado();

	/**
	 * Sets the value of the '{@link Model.Exemplar#isEmprestado <em>Emprestado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emprestado</em>' attribute.
	 * @see #isEmprestado()
	 * @generated
	 */
	void setEmprestado(boolean value);

	/**
	 * Returns the value of the '<em><b>Reservado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservado</em>' attribute.
	 * @see #setReservado(boolean)
	 * @see Model.ModelPackage#getExemplar_Reservado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isReservado();

	/**
	 * Sets the value of the '{@link Model.Exemplar#isReservado <em>Reservado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservado</em>' attribute.
	 * @see #isReservado()
	 * @generated
	 */
	void setReservado(boolean value);

	/**
	 * Returns the value of the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registro</em>' attribute.
	 * @see #setRegistro(int)
	 * @see Model.ModelPackage#getExemplar_Registro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRegistro();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getRegistro <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registro</em>' attribute.
	 * @see #getRegistro()
	 * @generated
	 */
	void setRegistro(int value);

} // Exemplar
