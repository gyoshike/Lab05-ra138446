/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;
import Model.Usuario;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.UsuarioImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getSobrenome <em>Sobrenome</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getDataNascimento <em>Data Nascimento</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTelefone <em>Telefone</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEndereco_1 <em>Endereco 1</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEndereco_2 <em>Endereco 2</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCep <em>Cep</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getPais <em>Pais</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getRegistro <em>Registro</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNome()
	 * @generated
	 * @ordered
	 */
	protected String nome = NOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSobrenome() <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSobrenome()
	 * @generated
	 * @ordered
	 */
	protected static final String SOBRENOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSobrenome() <em>Sobrenome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSobrenome()
	 * @generated
	 * @ordered
	 */
	protected String sobrenome = SOBRENOME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_NASCIMENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataNascimento() <em>Data Nascimento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataNascimento()
	 * @generated
	 * @ordered
	 */
	protected Date dataNascimento = DATA_NASCIMENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefone() <em>Telefone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefone()
	 * @generated
	 * @ordered
	 */
	protected String telefone = TELEFONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco_1() <em>Endereco 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco_1()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO_1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco_1() <em>Endereco 1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco_1()
	 * @generated
	 * @ordered
	 */
	protected String endereco_1 = ENDERECO_1_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndereco_2() <em>Endereco 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco_2()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDERECO_2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndereco_2() <em>Endereco 2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndereco_2()
	 * @generated
	 * @ordered
	 */
	protected String endereco_2 = ENDERECO_2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected static final String CEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected String cep = CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidade()
	 * @generated
	 * @ordered
	 */
	protected String cidade = CIDADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected static final String PAIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPais() <em>Pais</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPais()
	 * @generated
	 * @ordered
	 */
	protected String pais = PAIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistro() <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRegistro() <em>Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistro()
	 * @generated
	 * @ordered
	 */
	protected int registro = REGISTRO_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected String instituto = INSTITUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected String tipo = TIPO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNome(String newNome) {
		String oldNome = nome;
		nome = newNome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NOME, oldNome, nome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSobrenome(String newSobrenome) {
		String oldSobrenome = sobrenome;
		sobrenome = newSobrenome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__SOBRENOME, oldSobrenome, sobrenome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataNascimento(Date newDataNascimento) {
		Date oldDataNascimento = dataNascimento;
		dataNascimento = newDataNascimento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__DATA_NASCIMENTO, oldDataNascimento, dataNascimento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelefone(String newTelefone) {
		String oldTelefone = telefone;
		telefone = newTelefone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TELEFONE, oldTelefone, telefone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco_1() {
		return endereco_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco_1(String newEndereco_1) {
		String oldEndereco_1 = endereco_1;
		endereco_1 = newEndereco_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO_1, oldEndereco_1, endereco_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndereco_2() {
		return endereco_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndereco_2(String newEndereco_2) {
		String oldEndereco_2 = endereco_2;
		endereco_2 = newEndereco_2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ENDERECO_2, oldEndereco_2, endereco_2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCep(String newCep) {
		String oldCep = cep;
		cep = newCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CEP, oldCep, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidade(String newCidade) {
		String oldCidade = cidade;
		cidade = newCidade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CIDADE, oldCidade, cidade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPais(String newPais) {
		String oldPais = pais;
		pais = newPais;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PAIS, oldPais, pais));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRegistro() {
		return registro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistro(int newRegistro) {
		int oldRegistro = registro;
		registro = newRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__REGISTRO, oldRegistro, registro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstituto() {
		return instituto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituto(String newInstituto) {
		String oldInstituto = instituto;
		instituto = newInstituto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(String newTipo) {
		String oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reservar(Exemplar exemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fazerEmprestimo(Exemplar exemplar, Date dataEmprestimo, String tipo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelarReserva(Exemplar exemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void devolver(Exemplar exemplar, Date data_devolucao) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USUARIO__TITULO:
				return getTitulo();
			case ModelPackage.USUARIO__NOME:
				return getNome();
			case ModelPackage.USUARIO__SOBRENOME:
				return getSobrenome();
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				return getDataNascimento();
			case ModelPackage.USUARIO__EMAIL:
				return getEmail();
			case ModelPackage.USUARIO__CPF:
				return getCpf();
			case ModelPackage.USUARIO__TELEFONE:
				return getTelefone();
			case ModelPackage.USUARIO__ENDERECO_1:
				return getEndereco_1();
			case ModelPackage.USUARIO__ENDERECO_2:
				return getEndereco_2();
			case ModelPackage.USUARIO__CEP:
				return getCep();
			case ModelPackage.USUARIO__CIDADE:
				return getCidade();
			case ModelPackage.USUARIO__ESTADO:
				return getEstado();
			case ModelPackage.USUARIO__PAIS:
				return getPais();
			case ModelPackage.USUARIO__REGISTRO:
				return getRegistro();
			case ModelPackage.USUARIO__INSTITUTO:
				return getInstituto();
			case ModelPackage.USUARIO__TIPO:
				return getTipo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.USUARIO__TITULO:
				setTitulo((String)newValue);
				return;
			case ModelPackage.USUARIO__NOME:
				setNome((String)newValue);
				return;
			case ModelPackage.USUARIO__SOBRENOME:
				setSobrenome((String)newValue);
				return;
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				setDataNascimento((Date)newValue);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf((String)newValue);
				return;
			case ModelPackage.USUARIO__TELEFONE:
				setTelefone((String)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO_1:
				setEndereco_1((String)newValue);
				return;
			case ModelPackage.USUARIO__ENDERECO_2:
				setEndereco_2((String)newValue);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep((String)newValue);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade((String)newValue);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado((String)newValue);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais((String)newValue);
				return;
			case ModelPackage.USUARIO__REGISTRO:
				setRegistro((Integer)newValue);
				return;
			case ModelPackage.USUARIO__INSTITUTO:
				setInstituto((String)newValue);
				return;
			case ModelPackage.USUARIO__TIPO:
				setTipo((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.USUARIO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__NOME:
				setNome(NOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__SOBRENOME:
				setSobrenome(SOBRENOME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				setDataNascimento(DATA_NASCIMENTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.USUARIO__TELEFONE:
				setTelefone(TELEFONE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO_1:
				setEndereco_1(ENDERECO_1_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ENDERECO_2:
				setEndereco_2(ENDERECO_2_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep(CEP_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CIDADE:
				setCidade(CIDADE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PAIS:
				setPais(PAIS_EDEFAULT);
				return;
			case ModelPackage.USUARIO__REGISTRO:
				setRegistro(REGISTRO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__INSTITUTO:
				setInstituto(INSTITUTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.USUARIO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case ModelPackage.USUARIO__NOME:
				return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
			case ModelPackage.USUARIO__SOBRENOME:
				return SOBRENOME_EDEFAULT == null ? sobrenome != null : !SOBRENOME_EDEFAULT.equals(sobrenome);
			case ModelPackage.USUARIO__DATA_NASCIMENTO:
				return DATA_NASCIMENTO_EDEFAULT == null ? dataNascimento != null : !DATA_NASCIMENTO_EDEFAULT.equals(dataNascimento);
			case ModelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.USUARIO__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelPackage.USUARIO__TELEFONE:
				return TELEFONE_EDEFAULT == null ? telefone != null : !TELEFONE_EDEFAULT.equals(telefone);
			case ModelPackage.USUARIO__ENDERECO_1:
				return ENDERECO_1_EDEFAULT == null ? endereco_1 != null : !ENDERECO_1_EDEFAULT.equals(endereco_1);
			case ModelPackage.USUARIO__ENDERECO_2:
				return ENDERECO_2_EDEFAULT == null ? endereco_2 != null : !ENDERECO_2_EDEFAULT.equals(endereco_2);
			case ModelPackage.USUARIO__CEP:
				return CEP_EDEFAULT == null ? cep != null : !CEP_EDEFAULT.equals(cep);
			case ModelPackage.USUARIO__CIDADE:
				return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
			case ModelPackage.USUARIO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case ModelPackage.USUARIO__PAIS:
				return PAIS_EDEFAULT == null ? pais != null : !PAIS_EDEFAULT.equals(pais);
			case ModelPackage.USUARIO__REGISTRO:
				return registro != REGISTRO_EDEFAULT;
			case ModelPackage.USUARIO__INSTITUTO:
				return INSTITUTO_EDEFAULT == null ? instituto != null : !INSTITUTO_EDEFAULT.equals(instituto);
			case ModelPackage.USUARIO__TIPO:
				return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.USUARIO___RESERVAR__EXEMPLAR:
				reservar((Exemplar)arguments.get(0));
				return null;
			case ModelPackage.USUARIO___FAZER_EMPRESTIMO__EXEMPLAR_DATE_STRING:
				fazerEmprestimo((Exemplar)arguments.get(0), (Date)arguments.get(1), (String)arguments.get(2));
				return null;
			case ModelPackage.USUARIO___CANCELAR_RESERVA__EXEMPLAR:
				cancelarReserva((Exemplar)arguments.get(0));
				return null;
			case ModelPackage.USUARIO___DEVOLVER__EXEMPLAR_DATE:
				devolver((Exemplar)arguments.get(0), (Date)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(", nome: ");
		result.append(nome);
		result.append(", sobrenome: ");
		result.append(sobrenome);
		result.append(", dataNascimento: ");
		result.append(dataNascimento);
		result.append(", email: ");
		result.append(email);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", telefone: ");
		result.append(telefone);
		result.append(", endereco_1: ");
		result.append(endereco_1);
		result.append(", endereco_2: ");
		result.append(endereco_2);
		result.append(", cep: ");
		result.append(cep);
		result.append(", cidade: ");
		result.append(cidade);
		result.append(", estado: ");
		result.append(estado);
		result.append(", pais: ");
		result.append(pais);
		result.append(", registro: ");
		result.append(registro);
		result.append(", instituto: ");
		result.append(instituto);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl
