package ast.statements;

import ast.expressions.Expression;

public class Return extends AbstractStatement implements Statement {

	Expression Expression;

	public Return(int row, int column, Expression A) {
		super(row, column);
		Expression = A;
	}
}
