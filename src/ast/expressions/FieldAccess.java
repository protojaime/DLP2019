package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class FieldAccess extends AbstractExpression implements Expression {
	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	String name;
	Expression expression;

	public FieldAccess(int row, int column, Expression A, String n) {
		super(row, column);
		name = n;
		expression = A;

	}

	FieldAccess(int row, int column, Expression A, Expression B, String n, Type t) {
		super(row, column);
		name = n;
		expression = A;
		this.type = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}