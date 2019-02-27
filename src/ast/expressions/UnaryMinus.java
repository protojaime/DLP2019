package ast.expressions;

import ast.types.Type;

public class UnaryMinus extends AbstractExpression implements Expression {
	Expression expression;

	public UnaryMinus(int row, int column, Expression expression) {
		super(row, column);
		this.expression = expression;
	}

	public UnaryMinus(int row, int column, Type t, Expression expression) {
		super(row, column, t);
		this.expression = expression;
	}

}