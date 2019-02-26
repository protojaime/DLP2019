package ast.expressions;

import ast.AbstractASTNode;

public class Variable extends AbstractASTNode implements Expression {

	public Variable(int row, int column) {
		super(row, column);
	}
}