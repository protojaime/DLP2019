package ast.expressions;

import ast.types.Type;

public class UnaryNot extends AbstractExpression implements Expression {
	Expression expression;

	public UnaryNot(int row, int column, Expression expression) {
		super(row, column);
		this.expression = expression;
	}

	public UnaryNot(int row, int column, Type t, Expression expression) {
		super(row, column, t);
		this.expression = expression;
	}
}