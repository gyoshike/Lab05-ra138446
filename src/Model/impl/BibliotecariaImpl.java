/**
 */
package Model.impl;

import Model.Bibliotecaria;
import Model.Exemplar;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bibliotecaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BibliotecariaImpl extends FuncionarioImpl implements Bibliotecaria {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecariaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BIBLIOTECARIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void incluirExemplar(Exemplar exemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excluirExemplar(Exemplar exemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void atualizarExemplar(Exemplar exemplar, String dado) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BIBLIOTECARIA___INCLUIR_EXEMPLAR__EXEMPLAR:
				incluirExemplar((Exemplar)arguments.get(0));
				return null;
			case ModelPackage.BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR:
				excluirExemplar((Exemplar)arguments.get(0));
				return null;
			case ModelPackage.BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR_STRING:
				atualizarExemplar((Exemplar)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BibliotecariaImpl
