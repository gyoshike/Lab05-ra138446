/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aluno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Aluno#isSuspenso <em>Suspenso</em>}</li>
 *   <li>{@link Model.Aluno#getDias_suspenso <em>Dias suspenso</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getAluno()
 * @model
 * @generated
 */
public interface Aluno extends Usuario {
	/**
	 * Returns the value of the '<em><b>Suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspenso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspenso</em>' attribute.
	 * @see #setSuspenso(boolean)
	 * @see Model.ModelPackage#getAluno_Suspenso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isSuspenso();

	/**
	 * Sets the value of the '{@link Model.Aluno#isSuspenso <em>Suspenso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspenso</em>' attribute.
	 * @see #isSuspenso()
	 * @generated
	 */
	void setSuspenso(boolean value);

	/**
	 * Returns the value of the '<em><b>Dias suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dias suspenso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dias suspenso</em>' attribute.
	 * @see #setDias_suspenso(int)
	 * @see Model.ModelPackage#getAluno_Dias_suspenso()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getDias_suspenso();

	/**
	 * Sets the value of the '{@link Model.Aluno#getDias_suspenso <em>Dias suspenso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dias suspenso</em>' attribute.
	 * @see #getDias_suspenso()
	 * @generated
	 */
	void setDias_suspenso(int value);

} // Aluno
