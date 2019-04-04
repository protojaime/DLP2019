package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

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

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

}