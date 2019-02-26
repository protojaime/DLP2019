package ast.statements;

import ast.AbstractASTNode;

public abstract class AbstractStatement extends AbstractASTNode {

	public AbstractStatement(int row, int column) {
		super(row, column);
	}

}
