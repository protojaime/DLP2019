package ast.expressions;

import ast.types.Type;

public class FieldAccess extends AbstractBinaryExpression implements Expression {
	FieldAccess(int row, int column, Expression A, Expression B) {
		super(row, column, A, B);
	}

	FieldAccess(int row, int column, Type t, Expression A, Expression B) {
		super(row, column, t, A, B);
	}
}