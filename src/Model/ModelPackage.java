/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.UsuarioImpl
	 * @see Model.impl.ModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NOME = 1;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__SOBRENOME = 2;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__DATA_NASCIMENTO = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 5;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TELEFONE = 6;

	/**
	 * The feature id for the '<em><b>Endereco 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO_1 = 7;

	/**
	 * The feature id for the '<em><b>Endereco 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ENDERECO_2 = 8;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CEP = 9;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CIDADE = 10;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ESTADO = 11;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PAIS = 12;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__REGISTRO = 13;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__INSTITUTO = 14;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TIPO = 15;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 16;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___RESERVAR__EXEMPLAR = 0;

	/**
	 * The operation id for the '<em>Fazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING = 1;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___CANCELAR_RESERVA__EXEMPLAR = 2;

	/**
	 * The operation id for the '<em>Devolver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___DEVOLVER__EXEMPLAR_DATE = 3;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExemplarImpl
	 * @see Model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 1;

	/**
	 * The feature id for the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__BLOQUEADO = 0;

	/**
	 * The feature id for the '<em><b>Emprestado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__EMPRESTADO = 1;

	/**
	 * The feature id for the '<em><b>Reservado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__RESERVADO = 2;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__REGISTRO = 3;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TerminalImpl
	 * @see Model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 2;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecaImpl
	 * @see Model.impl.ModelPackageImpl#getBiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 3;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PublicacaoImpl
	 * @see Model.impl.ModelPackageImpl#getPublicacao()
	 * @generated
	 */
	int PUBLICACAO = 4;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__AUTOR = 0;

	/**
	 * The feature id for the '<em><b>Data publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__DATA_PUBLICACAO = 1;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__TITULO = 2;

	/**
	 * The number of structural features of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EmprestimoImpl
	 * @see Model.impl.ModelPackageImpl#getEmprestimo()
	 * @generated
	 */
	int EMPRESTIMO = 5;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__EXEMPLAR = 0;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Data devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DATA_DEVOLUCAO = 2;

	/**
	 * The feature id for the '<em><b>Dias atrasados</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DIAS_ATRASADOS = 3;

	/**
	 * The feature id for the '<em><b>Multa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__MULTA = 4;

	/**
	 * The number of structural features of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.LivroImpl
	 * @see Model.impl.ModelPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 6;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__TITULO = PUBLICACAO__TITULO;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.PeriódicoImpl <em>Periódico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PeriódicoImpl
	 * @see Model.impl.ModelPackageImpl#getPeriódico()
	 * @generated
	 */
	int PERIÓDICO = 7;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__TITULO = PUBLICACAO__TITULO;

	/**
	 * The feature id for the '<em><b>Publicacao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO__PUBLICACAO = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Periódico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Periódico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIÓDICO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TeseImpl
	 * @see Model.impl.ModelPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 8;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__TITULO = PUBLICACAO__TITULO;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ManualImpl
	 * @see Model.impl.ModelPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 9;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__AUTOR = PUBLICACAO__AUTOR;

	/**
	 * The feature id for the '<em><b>Data publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__DATA_PUBLICACAO = PUBLICACAO__DATA_PUBLICACAO;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TITULO = PUBLICACAO__TITULO;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AlunoImpl
	 * @see Model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 10;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TITULO = USUARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__SOBRENOME = USUARIO__SOBRENOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO_1 = USUARIO__ENDERECO_1;

	/**
	 * The feature id for the '<em><b>Endereco 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ENDERECO_2 = USUARIO__ENDERECO_2;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__REGISTRO = USUARIO__REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__INSTITUTO = USUARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TIPO = USUARIO__TIPO;

	/**
	 * The feature id for the '<em><b>Suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__SUSPENSO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dias suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__DIAS_SUSPENSO = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___RESERVAR__EXEMPLAR = USUARIO___RESERVAR__EXEMPLAR;

	/**
	 * The operation id for the '<em>Fazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING = USUARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___CANCELAR_RESERVA__EXEMPLAR = USUARIO___CANCELAR_RESERVA__EXEMPLAR;

	/**
	 * The operation id for the '<em>Devolver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___DEVOLVER__EXEMPLAR_DATE = USUARIO___DEVOLVER__EXEMPLAR_DATE;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.FuncionarioImpl
	 * @see Model.impl.ModelPackageImpl#getFuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 12;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TITULO = USUARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__NOME = USUARIO__NOME;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__SOBRENOME = USUARIO__SOBRENOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__DATA_NASCIMENTO = USUARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TELEFONE = USUARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECO_1 = USUARIO__ENDERECO_1;

	/**
	 * The feature id for the '<em><b>Endereco 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ENDERECO_2 = USUARIO__ENDERECO_2;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CIDADE = USUARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ESTADO = USUARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__PAIS = USUARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__REGISTRO = USUARIO__REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__INSTITUTO = USUARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TIPO = USUARIO__TIPO;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___RESERVAR__EXEMPLAR = USUARIO___RESERVAR__EXEMPLAR;

	/**
	 * The operation id for the '<em>Fazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING = USUARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___CANCELAR_RESERVA__EXEMPLAR = USUARIO___CANCELAR_RESERVA__EXEMPLAR;

	/**
	 * The operation id for the '<em>Devolver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___DEVOLVER__EXEMPLAR_DATE = USUARIO___DEVOLVER__EXEMPLAR_DATE;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ProfessorImpl
	 * @see Model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 11;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TITULO = FUNCIONARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NOME = FUNCIONARIO__NOME;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__SOBRENOME = FUNCIONARIO__SOBRENOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__DATA_NASCIMENTO = FUNCIONARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = FUNCIONARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CPF = FUNCIONARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TELEFONE = FUNCIONARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO_1 = FUNCIONARIO__ENDERECO_1;

	/**
	 * The feature id for the '<em><b>Endereco 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ENDERECO_2 = FUNCIONARIO__ENDERECO_2;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CEP = FUNCIONARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CIDADE = FUNCIONARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ESTADO = FUNCIONARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PAIS = FUNCIONARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__REGISTRO = FUNCIONARIO__REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUTO = FUNCIONARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TIPO = FUNCIONARIO__TIPO;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = FUNCIONARIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___RESERVAR__EXEMPLAR = FUNCIONARIO___RESERVAR__EXEMPLAR;

	/**
	 * The operation id for the '<em>Fazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING = FUNCIONARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___CANCELAR_RESERVA__EXEMPLAR = FUNCIONARIO___CANCELAR_RESERVA__EXEMPLAR;

	/**
	 * The operation id for the '<em>Devolver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DEVOLVER__EXEMPLAR_DATE = FUNCIONARIO___DEVOLVER__EXEMPLAR_DATE;

	/**
	 * The operation id for the '<em>Bloquear Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR_EXEMPLAR__EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desbloquear Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___DESBLOQUEAR_EXEMPLAR__EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = FUNCIONARIO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecariaImpl <em>Bibliotecaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecariaImpl
	 * @see Model.impl.ModelPackageImpl#getBibliotecaria()
	 * @generated
	 */
	int BIBLIOTECARIA = 13;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__TITULO = FUNCIONARIO__TITULO;

	/**
	 * The feature id for the '<em><b>Nome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__NOME = FUNCIONARIO__NOME;

	/**
	 * The feature id for the '<em><b>Sobrenome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__SOBRENOME = FUNCIONARIO__SOBRENOME;

	/**
	 * The feature id for the '<em><b>Data Nascimento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__DATA_NASCIMENTO = FUNCIONARIO__DATA_NASCIMENTO;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__EMAIL = FUNCIONARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CPF = FUNCIONARIO__CPF;

	/**
	 * The feature id for the '<em><b>Telefone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__TELEFONE = FUNCIONARIO__TELEFONE;

	/**
	 * The feature id for the '<em><b>Endereco 1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__ENDERECO_1 = FUNCIONARIO__ENDERECO_1;

	/**
	 * The feature id for the '<em><b>Endereco 2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__ENDERECO_2 = FUNCIONARIO__ENDERECO_2;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CEP = FUNCIONARIO__CEP;

	/**
	 * The feature id for the '<em><b>Cidade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CIDADE = FUNCIONARIO__CIDADE;

	/**
	 * The feature id for the '<em><b>Estado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__ESTADO = FUNCIONARIO__ESTADO;

	/**
	 * The feature id for the '<em><b>Pais</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__PAIS = FUNCIONARIO__PAIS;

	/**
	 * The feature id for the '<em><b>Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__REGISTRO = FUNCIONARIO__REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__INSTITUTO = FUNCIONARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__TIPO = FUNCIONARIO__TIPO;

	/**
	 * The number of structural features of the '<em>Bibliotecaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA_FEATURE_COUNT = FUNCIONARIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___RESERVAR__EXEMPLAR = FUNCIONARIO___RESERVAR__EXEMPLAR;

	/**
	 * The operation id for the '<em>Fazer Emprestimo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING = FUNCIONARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING;

	/**
	 * The operation id for the '<em>Cancelar Reserva</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___CANCELAR_RESERVA__EXEMPLAR = FUNCIONARIO___CANCELAR_RESERVA__EXEMPLAR;

	/**
	 * The operation id for the '<em>Devolver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___DEVOLVER__EXEMPLAR_DATE = FUNCIONARIO___DEVOLVER__EXEMPLAR_DATE;

	/**
	 * The operation id for the '<em>Incluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___INCLUIR_EXEMPLAR__EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizar Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR_STRING = FUNCIONARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bibliotecaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA_OPERATION_COUNT = FUNCIONARIO_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link Model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see Model.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see Model.Usuario#getTitulo()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getNome <em>Nome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome</em>'.
	 * @see Model.Usuario#getNome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Nome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getSobrenome <em>Sobrenome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sobrenome</em>'.
	 * @see Model.Usuario#getSobrenome()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Sobrenome();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getDataNascimento <em>Data Nascimento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Nascimento</em>'.
	 * @see Model.Usuario#getDataNascimento()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_DataNascimento();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Model.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Model.Usuario#getCpf()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTelefone <em>Telefone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telefone</em>'.
	 * @see Model.Usuario#getTelefone()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Telefone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEndereco_1 <em>Endereco 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco 1</em>'.
	 * @see Model.Usuario#getEndereco_1()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Endereco_1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEndereco_2 <em>Endereco 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endereco 2</em>'.
	 * @see Model.Usuario#getEndereco_2()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Endereco_2();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see Model.Usuario#getCep()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cep();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCidade <em>Cidade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidade</em>'.
	 * @see Model.Usuario#getCidade()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cidade();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEstado <em>Estado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estado</em>'.
	 * @see Model.Usuario#getEstado()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Estado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getPais <em>Pais</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pais</em>'.
	 * @see Model.Usuario#getPais()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Pais();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getRegistro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registro</em>'.
	 * @see Model.Usuario#getRegistro()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Registro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getInstituto <em>Instituto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto</em>'.
	 * @see Model.Usuario#getInstituto()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Instituto();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Model.Usuario#getTipo()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Tipo();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#reservar(Model.Exemplar) <em>Reservar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reservar</em>' operation.
	 * @see Model.Usuario#reservar(Model.Exemplar)
	 * @generated
	 */
	EOperation getUsuario__Reservar__Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#fazerEmprestimo(Model.Exemplar, java.util.Date, java.lang.String) <em>Fazer Emprestimo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fazer Emprestimo</em>' operation.
	 * @see Model.Usuario#fazerEmprestimo(Model.Exemplar, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getUsuario__FazerEmprestimo__Exemplar_Date_String();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#cancelarReserva(Model.Exemplar) <em>Cancelar Reserva</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancelar Reserva</em>' operation.
	 * @see Model.Usuario#cancelarReserva(Model.Exemplar)
	 * @generated
	 */
	EOperation getUsuario__CancelarReserva__Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#devolver(Model.Exemplar, java.util.Date) <em>Devolver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Devolver</em>' operation.
	 * @see Model.Usuario#devolver(Model.Exemplar, java.util.Date)
	 * @generated
	 */
	EOperation getUsuario__Devolver__Exemplar_Date();

	/**
	 * Returns the meta object for class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloqueado</em>'.
	 * @see Model.Exemplar#isBloqueado()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Bloqueado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isEmprestado <em>Emprestado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emprestado</em>'.
	 * @see Model.Exemplar#isEmprestado()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Emprestado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isReservado <em>Reservado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservado</em>'.
	 * @see Model.Exemplar#isReservado()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Reservado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getRegistro <em>Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registro</em>'.
	 * @see Model.Exemplar#getRegistro()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Registro();

	/**
	 * Returns the meta object for class '{@link Model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see Model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for class '{@link Model.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biblioteca</em>'.
	 * @see Model.Biblioteca
	 * @generated
	 */
	EClass getBiblioteca();

	/**
	 * Returns the meta object for class '{@link Model.Publicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicacao</em>'.
	 * @see Model.Publicacao
	 * @generated
	 */
	EClass getPublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autor</em>'.
	 * @see Model.Publicacao#getAutor()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Autor();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getData_publicacao <em>Data publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data publicacao</em>'.
	 * @see Model.Publicacao#getData_publicacao()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Data_publicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see Model.Publicacao#getTitulo()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Titulo();

	/**
	 * Returns the meta object for class '{@link Model.Emprestimo <em>Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emprestimo</em>'.
	 * @see Model.Emprestimo
	 * @generated
	 */
	EClass getEmprestimo();

	/**
	 * Returns the meta object for the reference '{@link Model.Emprestimo#getExemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar</em>'.
	 * @see Model.Emprestimo#getExemplar()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EReference getEmprestimo_Exemplar();

	/**
	 * Returns the meta object for the reference '{@link Model.Emprestimo#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see Model.Emprestimo#getUsuario()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EReference getEmprestimo_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getData_devolucao <em>Data devolucao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data devolucao</em>'.
	 * @see Model.Emprestimo#getData_devolucao()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_Data_devolucao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getDias_atrasados <em>Dias atrasados</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dias atrasados</em>'.
	 * @see Model.Emprestimo#getDias_atrasados()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_Dias_atrasados();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getMulta <em>Multa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multa</em>'.
	 * @see Model.Emprestimo#getMulta()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_Multa();

	/**
	 * Returns the meta object for class '{@link Model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see Model.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for class '{@link Model.Periódico <em>Periódico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periódico</em>'.
	 * @see Model.Periódico
	 * @generated
	 */
	EClass getPeriódico();

	/**
	 * Returns the meta object for the reference '{@link Model.Periódico#getPublicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publicacao</em>'.
	 * @see Model.Periódico#getPublicacao()
	 * @see #getPeriódico()
	 * @generated
	 */
	EReference getPeriódico_Publicacao();

	/**
	 * Returns the meta object for class '{@link Model.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tese</em>'.
	 * @see Model.Tese
	 * @generated
	 */
	EClass getTese();

	/**
	 * Returns the meta object for class '{@link Model.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see Model.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#isSuspenso <em>Suspenso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspenso</em>'.
	 * @see Model.Aluno#isSuspenso()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_Suspenso();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#getDias_suspenso <em>Dias suspenso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dias suspenso</em>'.
	 * @see Model.Aluno#getDias_suspenso()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_Dias_suspenso();

	/**
	 * Returns the meta object for class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the '{@link Model.Professor#bloquearExemplar(Model.Exemplar) <em>Bloquear Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloquear Exemplar</em>' operation.
	 * @see Model.Professor#bloquearExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getProfessor__BloquearExemplar__Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Professor#desbloquearExemplar(Model.Exemplar) <em>Desbloquear Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desbloquear Exemplar</em>' operation.
	 * @see Model.Professor#desbloquearExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getProfessor__DesbloquearExemplar__Exemplar();

	/**
	 * Returns the meta object for class '{@link Model.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionario</em>'.
	 * @see Model.Funcionario
	 * @generated
	 */
	EClass getFuncionario();

	/**
	 * Returns the meta object for class '{@link Model.Bibliotecaria <em>Bibliotecaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotecaria</em>'.
	 * @see Model.Bibliotecaria
	 * @generated
	 */
	EClass getBibliotecaria();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecaria#incluirExemplar(Model.Exemplar) <em>Incluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incluir Exemplar</em>' operation.
	 * @see Model.Bibliotecaria#incluirExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getBibliotecaria__IncluirExemplar__Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecaria#excluirExemplar(Model.Exemplar) <em>Excluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluir Exemplar</em>' operation.
	 * @see Model.Bibliotecaria#excluirExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getBibliotecaria__ExcluirExemplar__Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecaria#atualizarExemplar(Model.Exemplar, java.lang.String) <em>Atualizar Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizar Exemplar</em>' operation.
	 * @see Model.Bibliotecaria#atualizarExemplar(Model.Exemplar, java.lang.String)
	 * @generated
	 */
	EOperation getBibliotecaria__AtualizarExemplar__Exemplar_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.UsuarioImpl
		 * @see Model.impl.ModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TITULO = eINSTANCE.getUsuario_Titulo();

		/**
		 * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NOME = eINSTANCE.getUsuario_Nome();

		/**
		 * The meta object literal for the '<em><b>Sobrenome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__SOBRENOME = eINSTANCE.getUsuario_Sobrenome();

		/**
		 * The meta object literal for the '<em><b>Data Nascimento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__DATA_NASCIMENTO = eINSTANCE.getUsuario_DataNascimento();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getUsuario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Telefone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TELEFONE = eINSTANCE.getUsuario_Telefone();

		/**
		 * The meta object literal for the '<em><b>Endereco 1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO_1 = eINSTANCE.getUsuario_Endereco_1();

		/**
		 * The meta object literal for the '<em><b>Endereco 2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ENDERECO_2 = eINSTANCE.getUsuario_Endereco_2();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CEP = eINSTANCE.getUsuario_Cep();

		/**
		 * The meta object literal for the '<em><b>Cidade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CIDADE = eINSTANCE.getUsuario_Cidade();

		/**
		 * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ESTADO = eINSTANCE.getUsuario_Estado();

		/**
		 * The meta object literal for the '<em><b>Pais</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PAIS = eINSTANCE.getUsuario_Pais();

		/**
		 * The meta object literal for the '<em><b>Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__REGISTRO = eINSTANCE.getUsuario_Registro();

		/**
		 * The meta object literal for the '<em><b>Instituto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__INSTITUTO = eINSTANCE.getUsuario_Instituto();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TIPO = eINSTANCE.getUsuario_Tipo();

		/**
		 * The meta object literal for the '<em><b>Reservar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___RESERVAR__EXEMPLAR = eINSTANCE.getUsuario__Reservar__Exemplar();

		/**
		 * The meta object literal for the '<em><b>Fazer Emprestimo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING = eINSTANCE.getUsuario__FazerEmprestimo__Exemplar_Date_String();

		/**
		 * The meta object literal for the '<em><b>Cancelar Reserva</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___CANCELAR_RESERVA__EXEMPLAR = eINSTANCE.getUsuario__CancelarReserva__Exemplar();

		/**
		 * The meta object literal for the '<em><b>Devolver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___DEVOLVER__EXEMPLAR_DATE = eINSTANCE.getUsuario__Devolver__Exemplar_Date();

		/**
		 * The meta object literal for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExemplarImpl
		 * @see Model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Bloqueado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__BLOQUEADO = eINSTANCE.getExemplar_Bloqueado();

		/**
		 * The meta object literal for the '<em><b>Emprestado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__EMPRESTADO = eINSTANCE.getExemplar_Emprestado();

		/**
		 * The meta object literal for the '<em><b>Reservado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__RESERVADO = eINSTANCE.getExemplar_Reservado();

		/**
		 * The meta object literal for the '<em><b>Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__REGISTRO = eINSTANCE.getExemplar_Registro();

		/**
		 * The meta object literal for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TerminalImpl
		 * @see Model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecaImpl
		 * @see Model.impl.ModelPackageImpl#getBiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getBiblioteca();

		/**
		 * The meta object literal for the '{@link Model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PublicacaoImpl
		 * @see Model.impl.ModelPackageImpl#getPublicacao()
		 * @generated
		 */
		EClass PUBLICACAO = eINSTANCE.getPublicacao();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__AUTOR = eINSTANCE.getPublicacao_Autor();

		/**
		 * The meta object literal for the '<em><b>Data publicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__DATA_PUBLICACAO = eINSTANCE.getPublicacao_Data_publicacao();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__TITULO = eINSTANCE.getPublicacao_Titulo();

		/**
		 * The meta object literal for the '{@link Model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EmprestimoImpl
		 * @see Model.impl.ModelPackageImpl#getEmprestimo()
		 * @generated
		 */
		EClass EMPRESTIMO = eINSTANCE.getEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Exemplar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESTIMO__EXEMPLAR = eINSTANCE.getEmprestimo_Exemplar();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESTIMO__USUARIO = eINSTANCE.getEmprestimo_Usuario();

		/**
		 * The meta object literal for the '<em><b>Data devolucao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DATA_DEVOLUCAO = eINSTANCE.getEmprestimo_Data_devolucao();

		/**
		 * The meta object literal for the '<em><b>Dias atrasados</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DIAS_ATRASADOS = eINSTANCE.getEmprestimo_Dias_atrasados();

		/**
		 * The meta object literal for the '<em><b>Multa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__MULTA = eINSTANCE.getEmprestimo_Multa();

		/**
		 * The meta object literal for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.LivroImpl
		 * @see Model.impl.ModelPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '{@link Model.impl.PeriódicoImpl <em>Periódico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PeriódicoImpl
		 * @see Model.impl.ModelPackageImpl#getPeriódico()
		 * @generated
		 */
		EClass PERIÓDICO = eINSTANCE.getPeriódico();

		/**
		 * The meta object literal for the '<em><b>Publicacao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIÓDICO__PUBLICACAO = eINSTANCE.getPeriódico_Publicacao();

		/**
		 * The meta object literal for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TeseImpl
		 * @see Model.impl.ModelPackageImpl#getTese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.getTese();

		/**
		 * The meta object literal for the '{@link Model.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ManualImpl
		 * @see Model.impl.ModelPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AlunoImpl
		 * @see Model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '<em><b>Suspenso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__SUSPENSO = eINSTANCE.getAluno_Suspenso();

		/**
		 * The meta object literal for the '<em><b>Dias suspenso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__DIAS_SUSPENSO = eINSTANCE.getAluno_Dias_suspenso();

		/**
		 * The meta object literal for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ProfessorImpl
		 * @see Model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Bloquear Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEAR_EXEMPLAR__EXEMPLAR = eINSTANCE.getProfessor__BloquearExemplar__Exemplar();

		/**
		 * The meta object literal for the '<em><b>Desbloquear Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___DESBLOQUEAR_EXEMPLAR__EXEMPLAR = eINSTANCE.getProfessor__DesbloquearExemplar__Exemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FuncionarioImpl
		 * @see Model.impl.ModelPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecariaImpl <em>Bibliotecaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecariaImpl
		 * @see Model.impl.ModelPackageImpl#getBibliotecaria()
		 * @generated
		 */
		EClass BIBLIOTECARIA = eINSTANCE.getBibliotecaria();

		/**
		 * The meta object literal for the '<em><b>Incluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIA___INCLUIR_EXEMPLAR__EXEMPLAR = eINSTANCE.getBibliotecaria__IncluirExemplar__Exemplar();

		/**
		 * The meta object literal for the '<em><b>Excluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR = eINSTANCE.getBibliotecaria__ExcluirExemplar__Exemplar();

		/**
		 * The meta object literal for the '<em><b>Atualizar Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR_STRING = eINSTANCE.getBibliotecaria__AtualizarExemplar__Exemplar_String();

	}

} //ModelPackage
