package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class Arithmetic extends AbstractBinaryExpression implements Expression {

	public Arithmetic(int row, int column, Expression A, Expression B, String operator) {
		super(row, column, A, B, operator);

	}

	Arithmetic(int row, int column, Type t, Expression A, Expression B, String operator) {
		super(row, column, t, A, B, operator);

	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}