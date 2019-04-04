package semantic;

import ast.ErrorHandler;
import ast.FuncionInvocation;
import ast.Program;
import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayInvocation;
import ast.expressions.Cast;
import ast.expressions.Comparation;
import ast.expressions.ConstantChar;
import ast.expressions.ConstantDouble;
import ast.expressions.ConstantInt;
import ast.expressions.Expression;
import ast.expressions.FieldAccess;
import ast.expressions.Logical;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.expressions.Variable;
import ast.statements.Asigment;
import ast.statements.IfStatement;
import ast.statements.Input;
import ast.statements.Print;
import ast.statements.Return;
import ast.statements.WhileStatement;
import ast.types.ArrayType;
import ast.types.CharType;
import ast.types.DoubleType;
import ast.types.ErrorType;
import ast.types.Field;
import ast.types.FuncionType;
import ast.types.IntType;
import ast.types.StructType;
import ast.types.VoidType;

public class EvalVisitor extends AbstractVisitor implements Visitor {

	@Override
	public Object Visit(Arithmetic d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ArrayInvocation d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Cast d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Comparation d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(FieldAccess d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Logical d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(UnaryMinus d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(UnaryNot d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Variable d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ConstantInt d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ConstantChar d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ConstantDouble d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(FuncionDefinition d, Object o) {

		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(VarDefinition d, Object o) {

		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Asigment d, Object o) {

		super.Visit(d, o);
		if (!d.ExpressionA.getLvalue()) {
			new ErrorType(d.getLine(), d.getColumn(), "no se puede aplicar una asignación a esta expresion",
					ErrorHandler.getEH());
		}
		return null;
	}

	@Override
	public Object Visit(IfStatement d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(WhileStatement d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Input d, Object o) {
		super.Visit(d, o);
		for (Expression def : d.getExp()) {

			if (!def.getLvalue()) {
				new ErrorType(def.getLine(), def.getColumn(), "valor no valido como input introducido",
						ErrorHandler.getEH());
			}
		}

		return null;
	}

	@Override
	public Object Visit(Print d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Return d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ArrayType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(CharType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(DoubleType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ErrorType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(IntType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Field d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(VoidType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(StructType d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Program d, Object o) {
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(FuncionInvocation funcionInvocation, Object o) {
		funcionInvocation.setLvalue(false);
		super.Visit(funcionInvocation, o);

		return null;
	}

	@Override
	public Object Visit(FuncionType funcionType, Object o) {
		super.Visit(funcionType, o);

		return null;
	}

}
