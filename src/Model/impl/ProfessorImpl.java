/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;
import Model.Professor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Professor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProfessorImpl extends FuncionarioImpl implements Professor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROFESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void bloquearExemplar(Exemplar exemplar) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void desbloquearExemplar(Exemplar exemplar) {
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
			case ModelPackage.PROFESSOR___BLOQUEAR_EXEMPLAR__EXEMPLAR:
				bloquearExemplar((Exemplar)arguments.get(0));
				return null;
			case ModelPackage.PROFESSOR___DESBLOQUEAR_EXEMPLAR__EXEMPLAR:
				desbloquearExemplar((Exemplar)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProfessorImpl
