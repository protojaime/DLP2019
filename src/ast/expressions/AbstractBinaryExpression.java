package ast.expressions;

import ast.types.Type;

public abstract class AbstractBinaryExpression extends AbstractExpression implements Expression {
	Expression ExpressionA;
	Expression ExpressionB;

	public AbstractBinaryExpression(int row, int column, Expression A, Expression B) {
		super(row, column);
		ExpressionA = A;
		ExpressionB = B;
	}

	public AbstractBinaryExpression(int row, int column, Type t, Expression A, Expression B) {
		super(row, column, t);
		ExpressionA = A;
		ExpressionB = B;
	}

}
