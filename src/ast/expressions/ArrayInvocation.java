package ast.expressions;

import ast.types.Type;

public class ArrayInvocation extends AbstractBinaryExpression implements Expression {

	public ArrayInvocation(int row, int column, Expression A, Expression B) {
		super(row, column, A, B);
	}

	ArrayInvocation(int row, int column, Type t, Expression A, Expression B) {
		super(row, column, t, A, B);
	}

}