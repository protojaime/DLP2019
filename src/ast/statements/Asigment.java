package ast.statements;

import ast.expressions.Expression;

public class Asigment extends AbstractStatement implements Statement {
	Expression ExpressionA;
	Expression ExpressionB;

	public Asigment(int row, int column, Expression A, Expression B) {
		super(row, column);
		ExpressionA = A;
		ExpressionB = B;

	}

}
