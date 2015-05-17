/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliotecaria</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Model.ModelPackage#getBibliotecaria()
 * @model
 * @generated
 */
public interface Bibliotecaria extends Funcionario {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false"
	 * @generated
	 */
	void incluirExemplar(Exemplar exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false"
	 * @generated
	 */
	void excluirExemplar(Exemplar exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false" dadoRequired="true" dadoOrdered="false"
	 * @generated
	 */
	void atualizarExemplar(Exemplar exemplar, String dado);

} // Bibliotecaria
