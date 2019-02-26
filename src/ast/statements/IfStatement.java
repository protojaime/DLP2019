package ast.statements;

import java.util.ArrayList;

import ast.expressions.Expression;

public class IfStatement extends AbstractStatement implements Statement {
	ArrayList<Statement> Body = new ArrayList<Statement>();
	ArrayList<Statement> ElseBody = new ArrayList<Statement>();
	Expression Expression;

	public IfStatement(int row, int column, Expression A, ArrayList<Statement> body, ArrayList<Statement> bodye) {
		super(row, column);
		Expression = A;
		Body = body;
		ElseBody = bodye;
	}

}
