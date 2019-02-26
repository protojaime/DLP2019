package ast.statements;

import ast.expressions.Expression;

public class Input extends AbstractStatement implements Statement {

	Expression Expression;

	public Input(int row, int column, Expression A) {
		super(row, column);
		Expression = A;
	}
}
