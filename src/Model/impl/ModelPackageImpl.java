/**
 */
package Model.impl;

import Model.Aluno;
import Model.Biblioteca;
import Model.Bibliotecaria;
import Model.Emprestimo;
import Model.Exemplar;
import Model.Funcionario;
import Model.Livro;
import Model.Manual;
import Model.ModelFactory;
import Model.ModelPackage;
import Model.Periódico;
import Model.Professor;
import Model.Publicacao;
import Model.Terminal;
import Model.Tese;
import Model.Usuario;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usuarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exemplarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicacaoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emprestimoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periódicoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alunoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bibliotecariaEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsuario() {
		return usuarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Titulo() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Nome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Sobrenome() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_DataNascimento() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Email() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cpf() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Telefone() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Endereco_1() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Endereco_2() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cep() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Cidade() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Estado() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Pais() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Registro() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Instituto() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsuario_Tipo() {
		return (EAttribute)usuarioEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__Reservar__Exemplar() {
		return usuarioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__FazerEmprestimo__Exemplar_Date_String() {
		return usuarioEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__CancelarReserva__Exemplar() {
		return usuarioEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsuario__Devolver__Exemplar_Date() {
		return usuarioEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExemplar() {
		return exemplarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Bloqueado() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Emprestado() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Reservado() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExemplar_Registro() {
		return (EAttribute)exemplarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiblioteca() {
		return bibliotecaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicacao() {
		return publicacaoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Autor() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Data_publicacao() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicacao_Titulo() {
		return (EAttribute)publicacaoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmprestimo() {
		return emprestimoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmprestimo_Exemplar() {
		return (EReference)emprestimoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmprestimo_Usuario() {
		return (EReference)emprestimoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmprestimo_Data_devolucao() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmprestimo_Dias_atrasados() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmprestimo_Multa() {
		return (EAttribute)emprestimoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivro() {
		return livroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriódico() {
		return periódicoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriódico_Publicacao() {
		return (EReference)periódicoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTese() {
		return teseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManual() {
		return manualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAluno() {
		return alunoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_Suspenso() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAluno_Dias_suspenso() {
		return (EAttribute)alunoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfessor() {
		return professorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__BloquearExemplar__Exemplar() {
		return professorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfessor__DesbloquearExemplar__Exemplar() {
		return professorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncionario() {
		return funcionarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBibliotecaria() {
		return bibliotecariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotecaria__IncluirExemplar__Exemplar() {
		return bibliotecariaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotecaria__ExcluirExemplar__Exemplar() {
		return bibliotecariaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBibliotecaria__AtualizarExemplar__Exemplar_String() {
		return bibliotecariaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		usuarioEClass = createEClass(USUARIO);
		createEAttribute(usuarioEClass, USUARIO__TITULO);
		createEAttribute(usuarioEClass, USUARIO__NOME);
		createEAttribute(usuarioEClass, USUARIO__SOBRENOME);
		createEAttribute(usuarioEClass, USUARIO__DATA_NASCIMENTO);
		createEAttribute(usuarioEClass, USUARIO__EMAIL);
		createEAttribute(usuarioEClass, USUARIO__CPF);
		createEAttribute(usuarioEClass, USUARIO__TELEFONE);
		createEAttribute(usuarioEClass, USUARIO__ENDERECO_1);
		createEAttribute(usuarioEClass, USUARIO__ENDERECO_2);
		createEAttribute(usuarioEClass, USUARIO__CEP);
		createEAttribute(usuarioEClass, USUARIO__CIDADE);
		createEAttribute(usuarioEClass, USUARIO__ESTADO);
		createEAttribute(usuarioEClass, USUARIO__PAIS);
		createEAttribute(usuarioEClass, USUARIO__REGISTRO);
		createEAttribute(usuarioEClass, USUARIO__INSTITUTO);
		createEAttribute(usuarioEClass, USUARIO__TIPO);
		createEOperation(usuarioEClass, USUARIO___RESERVAR__EXEMPLAR);
		createEOperation(usuarioEClass, USUARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING);
		createEOperation(usuarioEClass, USUARIO___CANCELAR_RESERVA__EXEMPLAR);
		createEOperation(usuarioEClass, USUARIO___DEVOLVER__EXEMPLAR_DATE);

		exemplarEClass = createEClass(EXEMPLAR);
		createEAttribute(exemplarEClass, EXEMPLAR__BLOQUEADO);
		createEAttribute(exemplarEClass, EXEMPLAR__EMPRESTADO);
		createEAttribute(exemplarEClass, EXEMPLAR__RESERVADO);
		createEAttribute(exemplarEClass, EXEMPLAR__REGISTRO);

		terminalEClass = createEClass(TERMINAL);

		bibliotecaEClass = createEClass(BIBLIOTECA);

		publicacaoEClass = createEClass(PUBLICACAO);
		createEAttribute(publicacaoEClass, PUBLICACAO__AUTOR);
		createEAttribute(publicacaoEClass, PUBLICACAO__DATA_PUBLICACAO);
		createEAttribute(publicacaoEClass, PUBLICACAO__TITULO);

		emprestimoEClass = createEClass(EMPRESTIMO);
		createEReference(emprestimoEClass, EMPRESTIMO__EXEMPLAR);
		createEReference(emprestimoEClass, EMPRESTIMO__USUARIO);
		createEAttribute(emprestimoEClass, EMPRESTIMO__DATA_DEVOLUCAO);
		createEAttribute(emprestimoEClass, EMPRESTIMO__DIAS_ATRASADOS);
		createEAttribute(emprestimoEClass, EMPRESTIMO__MULTA);

		livroEClass = createEClass(LIVRO);

		periódicoEClass = createEClass(PERIÓDICO);
		createEReference(periódicoEClass, PERIÓDICO__PUBLICACAO);

		teseEClass = createEClass(TESE);

		manualEClass = createEClass(MANUAL);

		alunoEClass = createEClass(ALUNO);
		createEAttribute(alunoEClass, ALUNO__SUSPENSO);
		createEAttribute(alunoEClass, ALUNO__DIAS_SUSPENSO);

		professorEClass = createEClass(PROFESSOR);
		createEOperation(professorEClass, PROFESSOR___BLOQUEAR_EXEMPLAR__EXEMPLAR);
		createEOperation(professorEClass, PROFESSOR___DESBLOQUEAR_EXEMPLAR__EXEMPLAR);

		funcionarioEClass = createEClass(FUNCIONARIO);

		bibliotecariaEClass = createEClass(BIBLIOTECARIA);
		createEOperation(bibliotecariaEClass, BIBLIOTECARIA___INCLUIR_EXEMPLAR__EXEMPLAR);
		createEOperation(bibliotecariaEClass, BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR);
		createEOperation(bibliotecariaEClass, BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		livroEClass.getESuperTypes().add(this.getPublicacao());
		periódicoEClass.getESuperTypes().add(this.getPublicacao());
		teseEClass.getESuperTypes().add(this.getPublicacao());
		manualEClass.getESuperTypes().add(this.getPublicacao());
		alunoEClass.getESuperTypes().add(this.getUsuario());
		professorEClass.getESuperTypes().add(this.getFuncionario());
		funcionarioEClass.getESuperTypes().add(this.getUsuario());
		bibliotecariaEClass.getESuperTypes().add(this.getFuncionario());

		// Initialize classes, features, and operations; add parameters
		initEClass(usuarioEClass, Usuario.class, "Usuario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsuario_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Nome(), ecorePackage.getEString(), "nome", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Sobrenome(), ecorePackage.getEString(), "sobrenome", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_DataNascimento(), ecorePackage.getEDate(), "dataNascimento", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Email(), ecorePackage.getEString(), "email", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cpf(), ecorePackage.getEString(), "cpf", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Telefone(), ecorePackage.getEString(), "telefone", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Endereco_1(), ecorePackage.getEString(), "endereco_1", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Endereco_2(), ecorePackage.getEString(), "endereco_2", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cep(), ecorePackage.getEString(), "cep", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Cidade(), ecorePackage.getEString(), "cidade", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Estado(), ecorePackage.getEString(), "estado", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Pais(), ecorePackage.getEString(), "pais", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Registro(), ecorePackage.getEInt(), "registro", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Instituto(), ecorePackage.getEString(), "instituto", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsuario_Tipo(), ecorePackage.getEString(), "tipo", null, 1, 1, Usuario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getUsuario__Reservar__Exemplar(), null, "reservar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUsuario__FazerEmprestimo__Exemplar_Date_String(), null, "fazerEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "dataEmprestimo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tipo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUsuario__CancelarReserva__Exemplar(), null, "cancelarReserva", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getUsuario__Devolver__Exemplar_Date(), null, "devolver", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "data_devolucao", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(exemplarEClass, Exemplar.class, "Exemplar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExemplar_Bloqueado(), ecorePackage.getEBoolean(), "bloqueado", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Emprestado(), ecorePackage.getEBoolean(), "emprestado", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Reservado(), ecorePackage.getEBoolean(), "reservado", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExemplar_Registro(), ecorePackage.getEInt(), "registro", null, 1, 1, Exemplar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bibliotecaEClass, Biblioteca.class, "Biblioteca", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(publicacaoEClass, Publicacao.class, "Publicacao", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublicacao_Autor(), ecorePackage.getEString(), "autor", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicacao_Data_publicacao(), ecorePackage.getEDate(), "data_publicacao", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPublicacao_Titulo(), ecorePackage.getEString(), "titulo", null, 1, 1, Publicacao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emprestimoEClass, Emprestimo.class, "Emprestimo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmprestimo_Exemplar(), this.getExemplar(), null, "exemplar", null, 1, 1, Emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmprestimo_Usuario(), this.getUsuario(), null, "usuario", null, 1, 1, Emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmprestimo_Data_devolucao(), ecorePackage.getEDate(), "data_devolucao", null, 1, 1, Emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmprestimo_Dias_atrasados(), ecorePackage.getEInt(), "dias_atrasados", null, 1, 1, Emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmprestimo_Multa(), ecorePackage.getEFloat(), "multa", null, 1, 1, Emprestimo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(livroEClass, Livro.class, "Livro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(periódicoEClass, Periódico.class, "Periódico", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriódico_Publicacao(), this.getPublicacao(), null, "publicacao", null, 1, 1, Periódico.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(teseEClass, Tese.class, "Tese", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualEClass, Manual.class, "Manual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alunoEClass, Aluno.class, "Aluno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAluno_Suspenso(), ecorePackage.getEBoolean(), "suspenso", null, 1, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAluno_Dias_suspenso(), ecorePackage.getEInt(), "dias_suspenso", null, 1, 1, Aluno.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(professorEClass, Professor.class, "Professor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getProfessor__BloquearExemplar__Exemplar(), null, "bloquearExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProfessor__DesbloquearExemplar__Exemplar(), null, "desbloquearExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(funcionarioEClass, Funcionario.class, "Funcionario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bibliotecariaEClass, Bibliotecaria.class, "Bibliotecaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBibliotecaria__IncluirExemplar__Exemplar(), null, "incluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBibliotecaria__ExcluirExemplar__Exemplar(), null, "excluirExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBibliotecaria__AtualizarExemplar__Exemplar_String(), null, "atualizarExemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getExemplar(), "exemplar", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "dado", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
