package semantic;

import java.util.ArrayList;
import java.util.List;

import ast.ErrorHandler;
import ast.FuncionInvocation;
import ast.Definition.FuncionDefinition;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayInvocation;
import ast.expressions.Cast;
import ast.expressions.Comparation;
import ast.expressions.Expression;
import ast.expressions.FieldAccess;
import ast.expressions.Logical;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.statements.Asigment;
import ast.statements.IfStatement;
import ast.statements.Print;
import ast.statements.Return;
import ast.statements.WhileStatement;
import ast.types.ArrayType;
import ast.types.CharType;
import ast.types.ErrorType;
import ast.types.FuncionType;
import ast.types.StructType;
import ast.types.Type;
import ast.types.VoidType;

public class TypeCheckingVisitor extends AbstractVisitor implements Visitor {

	@Override
	public Object Visit(FieldAccess d, Object o) {
		super.Visit(d, o);
		Type t = d.getExpression().getType().Dot(d.getName());
		if (t == null) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(), "this field doesn't exist", ErrorHandler.getEH()));
		}
		d.setType(t);
		return null;
	}

	@Override
	public Object Visit(Asigment d, Object o) {
		super.Visit(d, o);
		Type t = d.getExpressionA().getType().promotesTo(d.getExpressionB().getType());
		if (t == null) {

			new ErrorType(d.getLine(), d.getColumn(),
					"the types of the variable to be asigned and of the asigment expression are not compatible",
					ErrorHandler.getEH());

			return null;
		}
		if ((t instanceof ArrayType && !(((ArrayType) t).getType() instanceof CharType)) || t instanceof StructType) {

			new ErrorType(d.getLine(), d.getColumn(), "assigment of this type is not supported", ErrorHandler.getEH());
		}
		if ((t instanceof ArrayType && ((ArrayType) d.getExpressionA().getType())
				.getSize() > ((ArrayType) d.getExpressionB().getType()).getSize())) {

			new ErrorType(d.getLine(), d.getColumn(),
					"the array you are trying to asign is smaller that the one you are trying to asign it into",
					ErrorHandler.getEH());
		}
		return null;
	}

	@Override
	public Object Visit(IfStatement d, Object o) {
		super.Visit(d, o);
		if (!d.getExpression().getType().isLogical()) {
			d.getExpression().setType(new ErrorType(d.getExpression().getLine(), d.getExpression().getColumn(),
					"the expression is not a valid logic expression", ErrorHandler.getEH()));
		}
		return null;
	}

	@Override
	public Object Visit(WhileStatement d, Object o) {
		super.Visit(d, o);
		if (!d.getExpression().getType().isLogical()) {
			d.getExpression().setType(new ErrorType(d.getExpression().getLine(), d.getExpression().getColumn(),
					"the expression is not a valid logic expression", ErrorHandler.getEH()));
		}
		return null;
	}

	@Override
	public Object Visit(Cast d, Object o) {
		super.Visit(d, o);

		Type t = d.getEx().getType().canBeCast(d.getImplementedType());
		Type t2 = d.getEx().getType().canBeCast(d.getEx().getType());
		if (t == null) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(), "you cannot cast this type", ErrorHandler.getEH()));
			return null;
		} else if (t2 == null) {
			d.setType(
					new ErrorType(d.getLine(), d.getColumn(), "you cannot cast into this type", ErrorHandler.getEH()));
			return null;
		}
		d.setType(d.getImplementedType());
		return null;
	}

	@Override
	public Object Visit(ArrayInvocation d, Object o) {
		super.Visit(d, o);
		if (!(d.getExpressionA().getType() instanceof ArrayType)) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(),
					"the array dimension of the variable you tried to access does not exist", ErrorHandler.getEH()));
			return null;
		} else {

			Type t = d.getExpressionA().getType().SquareBraquets(d.getExpressionB().getType());
			if (t == null) {
				ErrorType e = new ErrorType(d.getLine(), d.getColumn(),
						"the type of the expression introduced in the brackets is not Integer", ErrorHandler.getEH());
				d.setType(e);
				return null;
			}

			d.setType(t);
			return null;
		}
	}

	@Override
	public Object Visit(Comparation d, Object o) {
		super.Visit(d, o);

		Type t = d.getExpressionA().getType().Comparation(d.getExpressionB().getType());
		if (t == null) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(), "you cannot compare these two types",
					ErrorHandler.getEH()));
		}
		d.setType(t);
		return null;
	}

	@Override
	public Object Visit(Logical d, Object o) {
		super.Visit(d, o);
		Type t = d.getExpressionA().getType().Logical(d.getExpressionB().getType());
		if (t == null) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(),
					"you cannot have a logical operation between these two expressions", ErrorHandler.getEH()));
			return null;
		}
		d.setType(t);
		return null;
	}

	@Override
	public Object Visit(UnaryMinus d, Object o) {
		super.Visit(d, o);
		Type t = d.getExpression().getType().Arithmetic();
		if (t == null) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(),
					"cannot apply this operant to a non arithmetic expression", ErrorHandler.getEH()));
			return null;
		}
		d.setType(t);
		return null;
	}

	@Override
	public Object Visit(UnaryNot d, Object o) {
		super.Visit(d, o);
		Type t = d.getExpression().getType().Logical();
		if (t == null) {
			d.setType(new ErrorType(d.getLine(), d.getColumn(), "cannot apply this operant to a non logical expression",
					ErrorHandler.getEH()));
			return null;
		}
		d.setType(t);
		return null;
	}

	@Override
	public Object Visit(Arithmetic d, Object o) {
		super.Visit(d, o);
		Type t = d.getExpressionA().getType().Arithmetic();
		Type t2 = d.getExpressionB().getType().Arithmetic(t);
		if (t2 != null) {
			d.setType(t2);
		} else {

			d.setType(new ErrorType(d.getLine(), d.getColumn(),
					"cannot make an arithmetic operation with this expression ("
							+ d.getExpressionA().getType().toString() + "," + d.getExpressionB().getType().toString()
							+ ")",
					ErrorHandler.getEH()));
		}

		return null;
	}

	/**
	 * @Override public Object Visit(Variable d, Object o) { super.Visit(d, o); Type
	 *           t = d.getDefinition().getType(); return null; }
	 */
	@Override
	public Object Visit(FuncionInvocation d, Object o) {
		super.Visit(d, o);
		List<Type> t = new ArrayList<Type>();
		for (Expression e : d.getExpressions()) {
			t.add(e.getType());
		}
		Type t2 = d.getVariable().getType().Parenthesis(t);
		if (t2 == null) {
			new ErrorType(d.getLine(), d.getColumn(),
					"The number and/or type of parameters isn't the same as in the funcion's definition",
					ErrorHandler.getEH());
			return null;
		}
		d.setType(t2);
		return null;
	}

	@Override
	public Object Visit(FuncionDefinition d, Object o) {

		super.Visit(d, (((FuncionType) d.getType())).getReturnType());
		return null;
	}

	@Override
	public Object Visit(Print d, Object o) {
		super.Visit(d, o);
		for (Expression e : d.getExp()) {
			if (e.getType().isBuildInType()
					|| (e.getType() instanceof ArrayType && ((ArrayType) e.getType()).getType() instanceof CharType)) {
				return null;
			} else {

				Type t = new ErrorType(d.getLine(), d.getColumn(),
						"the type of the expression you are tying to print is not valid", ErrorHandler.getEH());
				e.setType(t);
				return null;
			}
		}
		return null;
	}

	@Override
	public Object Visit(Return d, Object o) {
		super.Visit(d, o);
		Type t = (Type) o;
		if (t instanceof VoidType) {
			new ErrorType(d.getLine(), d.getColumn(), "void funcions do not have return statements",
					ErrorHandler.getEH());
			return null;
		}
		if (!t.getClass().equals(d.Expression.getType().getClass())) {
			new ErrorType(d.getLine(), d.getColumn(),
					"the type of the return expression is not the same as the return type of the funcion",
					ErrorHandler.getEH());
		}
		return null;
	}
}
