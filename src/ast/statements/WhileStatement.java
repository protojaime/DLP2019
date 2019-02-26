package ast.statements;

import java.util.ArrayList;

import ast.expressions.Expression;

public class WhileStatement extends AbstractStatement implements Statement {
	ArrayList<Statement> Body = new ArrayList<Statement>();
	Expression Expression;

	public WhileStatement(int row, int column, Expression A, ArrayList<Statement> body) {
		super(row, column);
		Expression = A;
		Body = body;

	}

}
