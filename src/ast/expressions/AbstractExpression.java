package ast.expressions;

import ast.AbstractASTNode;
import ast.types.Type;

public class AbstractExpression extends AbstractASTNode implements Expression {
	Type type;

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
