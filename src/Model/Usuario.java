/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Usuario#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link Model.Usuario#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.Usuario#getSobrenome <em>Sobrenome</em>}</li>
 *   <li>{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link Model.Usuario#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.Usuario#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.Usuario#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link Model.Usuario#getEndereco_1 <em>Endereco 1</em>}</li>
 *   <li>{@link Model.Usuario#getEndereco_2 <em>Endereco 2</em>}</li>
 *   <li>{@link Model.Usuario#getCep <em>Cep</em>}</li>
 *   <li>{@link Model.Usuario#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.Usuario#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.Usuario#getPais <em>Pais</em>}</li>
 *   <li>{@link Model.Usuario#getRegistro <em>Registro</em>}</li>
 *   <li>{@link Model.Usuario#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.Usuario#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getUsuario()
 * @model
 * @generated
 */
public interface Usuario extends EObject {
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
	 * @see Model.ModelPackage#getUsuario_Titulo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome</em>' attribute.
	 * @see #setNome(String)
	 * @see Model.ModelPackage#getUsuario_Nome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getNome <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome</em>' attribute.
	 * @see #getNome()
	 * @generated
	 */
	void setNome(String value);

	/**
	 * Returns the value of the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sobrenome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sobrenome</em>' attribute.
	 * @see #setSobrenome(String)
	 * @see Model.ModelPackage#getUsuario_Sobrenome()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSobrenome();

	/**
	 * Sets the value of the '{@link Model.Usuario#getSobrenome <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sobrenome</em>' attribute.
	 * @see #getSobrenome()
	 * @generated
	 */
	void setSobrenome(String value);

	/**
	 * Returns the value of the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Nascimento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Nascimento</em>' attribute.
	 * @see #setDataNascimento(Date)
	 * @see Model.ModelPackage#getUsuario_DataNascimento()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataNascimento();

	/**
	 * Sets the value of the '{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Nascimento</em>' attribute.
	 * @see #getDataNascimento()
	 * @generated
	 */
	void setDataNascimento(Date value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Model.ModelPackage#getUsuario_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(String)
	 * @see Model.ModelPackage#getUsuario_Cpf()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telefone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telefone</em>' attribute.
	 * @see #setTelefone(String)
	 * @see Model.ModelPackage#getUsuario_Telefone()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTelefone();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTelefone <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefone</em>' attribute.
	 * @see #getTelefone()
	 * @generated
	 */
	void setTelefone(String value);

	/**
	 * Returns the value of the '<em><b>Endereco 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco 1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco 1</em>' attribute.
	 * @see #setEndereco_1(String)
	 * @see Model.ModelPackage#getUsuario_Endereco_1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndereco_1();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEndereco_1 <em>Endereco 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco 1</em>' attribute.
	 * @see #getEndereco_1()
	 * @generated
	 */
	void setEndereco_1(String value);

	/**
	 * Returns the value of the '<em><b>Endereco 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endereco 2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endereco 2</em>' attribute.
	 * @see #setEndereco_2(String)
	 * @see Model.ModelPackage#getUsuario_Endereco_2()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEndereco_2();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEndereco_2 <em>Endereco 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endereco 2</em>' attribute.
	 * @see #getEndereco_2()
	 * @generated
	 */
	void setEndereco_2(String value);

	/**
	 * Returns the value of the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cep</em>' attribute.
	 * @see #setCep(String)
	 * @see Model.ModelPackage#getUsuario_Cep()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCep();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCep <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cep</em>' attribute.
	 * @see #getCep()
	 * @generated
	 */
	void setCep(String value);

	/**
	 * Returns the value of the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cidade</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidade</em>' attribute.
	 * @see #setCidade(String)
	 * @see Model.ModelPackage#getUsuario_Cidade()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCidade();

	/**
	 * Sets the value of the '{@link Model.Usuario#getCidade <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidade</em>' attribute.
	 * @see #getCidade()
	 * @generated
	 */
	void setCidade(String value);

	/**
	 * Returns the value of the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estado</em>' attribute.
	 * @see #setEstado(String)
	 * @see Model.ModelPackage#getUsuario_Estado()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEstado();

	/**
	 * Sets the value of the '{@link Model.Usuario#getEstado <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estado</em>' attribute.
	 * @see #getEstado()
	 * @generated
	 */
	void setEstado(String value);

	/**
	 * Returns the value of the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pais</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pais</em>' attribute.
	 * @see #setPais(String)
	 * @see Model.ModelPackage#getUsuario_Pais()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPais();

	/**
	 * Sets the value of the '{@link Model.Usuario#getPais <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pais</em>' attribute.
	 * @see #getPais()
	 * @generated
	 */
	void setPais(String value);

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
	 * @see Model.ModelPackage#getUsuario_Registro()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRegistro();

	/**
	 * Sets the value of the '{@link Model.Usuario#getRegistro <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registro</em>' attribute.
	 * @see #getRegistro()
	 * @generated
	 */
	void setRegistro(int value);

	/**
	 * Returns the value of the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituto</em>' attribute.
	 * @see #setInstituto(String)
	 * @see Model.ModelPackage#getUsuario_Instituto()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getInstituto();

	/**
	 * Sets the value of the '{@link Model.Usuario#getInstituto <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto</em>' attribute.
	 * @see #getInstituto()
	 * @generated
	 */
	void setInstituto(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see #setTipo(String)
	 * @see Model.ModelPackage#getUsuario_Tipo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTipo();

	/**
	 * Sets the value of the '{@link Model.Usuario#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false"
	 * @generated
	 */
	void reservar(Exemplar exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false" dataEmprestimoRequired="true" dataEmprestimoOrdered="false" tipoRequired="true" tipoOrdered="false"
	 * @generated
	 */
	void fazerEmprestimo(Exemplar exemplar, Date dataEmprestimo, String tipo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false"
	 * @generated
	 */
	void cancelarReserva(Exemplar exemplar);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exemplarRequired="true" exemplarOrdered="false" data_devolucaoRequired="true" data_devolucaoOrdered="false"
	 * @generated
	 */
	void devolver(Exemplar exemplar, Date data_devolucao);

} // Usuario
