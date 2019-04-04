package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class ArrayInvocation extends AbstractBinaryExpression implements Expression {

	public ArrayInvocation(int row, int column, Expression A, Expression B) {
		super(row, column, A, B);
	}

	ArrayInvocation(int row, int column, Type t, Expression A, Expression B) {
		super(row, column, t, A, B);
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}