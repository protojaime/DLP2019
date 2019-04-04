package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {
	Type type;
	boolean Lvalue;

	public boolean getLvalue() {
		return Lvalue;
	}

	public void setLvalue(boolean lvalue) {
		Lvalue = lvalue;
	}

	public AbstractExpression(int row, int column) {
		super(row, column);
	}

	public AbstractExpression(int row, int column, Type t) {
		super(row, column);
		type = t;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
