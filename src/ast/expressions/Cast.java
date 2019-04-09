package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class Cast extends AbstractExpression implements Expression {
	Type ImplementedType;
	Expression ex;

	public Cast(int row, int column, Expression e, Type s) {
		super(row, column);
		ex = e;
		ImplementedType = s;
	}

	public Type getImplementedType() {
		return ImplementedType;
	}

	public void setImplementedType(Type implementedType) {
		ImplementedType = implementedType;
	}

	public Expression getEx() {
		return ex;
	}

	public void setEx(Expression ex) {
		this.ex = ex;
	}

	public Cast(int row, int column, Type t, Expression e, Type s) {
		super(row, column, t);
		ex = e;
		ImplementedType = s;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
