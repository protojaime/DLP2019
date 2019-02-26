package ast.statements;

import ast.expressions.Expression;

public class Print extends AbstractStatement implements Statement {

	Expression Expression;

	public Print(int row, int column, Expression A) {
		super(row, column);
		Expression = A;
	}
}
