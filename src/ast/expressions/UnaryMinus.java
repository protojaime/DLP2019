package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class UnaryMinus extends AbstractExpression implements Expression {
	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	Expression expression;

	public UnaryMinus(int row, int column, Expression expression) {
		super(row, column);
		this.expression = expression;
	}

	public UnaryMinus(int row, int column, Type t, Expression expression) {
		super(row, column, t);
		this.expression = expression;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

}