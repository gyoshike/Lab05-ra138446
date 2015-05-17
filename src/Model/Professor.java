/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Model.ModelPackage#getProfessor()
 * @model
 * @generated
 */
public interface Professor extends Funcionario {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false"
	 * @generated
	 */
	void bloquearExemplar(Exemplar exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false"
	 * @generated
	 */
	void desbloquearExemplar(Exemplar exemplar);

} // Professor
