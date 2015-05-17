/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Emprestimo#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link Model.Emprestimo#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link Model.Emprestimo#getData_devolucao <em>Data devolucao</em>}</li>
 *   <li>{@link Model.Emprestimo#getDias_atrasados <em>Dias atrasados</em>}</li>
 *   <li>{@link Model.Emprestimo#getMulta <em>Multa</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getEmprestimo()
 * @model
 * @generated
 */
public interface Emprestimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exemplar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplar</em>' reference.
	 * @see #setExemplar(Exemplar)
	 * @see Model.ModelPackage#getEmprestimo_Exemplar()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exemplar getExemplar();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getExemplar <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemplar</em>' reference.
	 * @see #getExemplar()
	 * @generated
	 */
	void setExemplar(Exemplar value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference.
	 * @see #setUsuario(Usuario)
	 * @see Model.ModelPackage#getEmprestimo_Usuario()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

	/**
	 * Returns the value of the '<em><b>Data devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data devolucao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data devolucao</em>' attribute.
	 * @see #setData_devolucao(Date)
	 * @see Model.ModelPackage#getEmprestimo_Data_devolucao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getData_devolucao();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getData_devolucao <em>Data devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data devolucao</em>' attribute.
	 * @see #getData_devolucao()
	 * @generated
	 */
	void setData_devolucao(Date value);

	/**
	 * Returns the value of the '<em><b>Dias atrasados</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dias atrasados</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dias atrasados</em>' attribute.
	 * @see #setDias_atrasados(int)
	 * @see Model.ModelPackage#getEmprestimo_Dias_atrasados()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getDias_atrasados();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDias_atrasados <em>Dias atrasados</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dias atrasados</em>' attribute.
	 * @see #getDias_atrasados()
	 * @generated
	 */
	void setDias_atrasados(int value);

	/**
	 * Returns the value of the '<em><b>Multa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multa</em>' attribute.
	 * @see #setMulta(float)
	 * @see Model.ModelPackage#getEmprestimo_Multa()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	float getMulta();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getMulta <em>Multa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multa</em>' attribute.
	 * @see #getMulta()
	 * @generated
	 */
	void setMulta(float value);

} // Emprestimo
