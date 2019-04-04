package ast.statements;

import ast.expressions.Expression;
import semantic.Visitor;

public class Asigment extends AbstractStatement implements Statement {
	public Expression ExpressionA;
	public Expression ExpressionB;

	public Asigment(int row, int column, Expression A, Expression B) {
		super(row, column);
		ExpressionA = A;
		ExpressionB = B;

	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

}
