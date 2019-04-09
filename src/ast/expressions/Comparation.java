package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class Comparation extends AbstractBinaryExpression implements Expression {
	String Comparatior;

	public Comparation(int row, int column, Expression A, Expression B, String comparatior) {
		super(row, column, A, B);
		Comparatior = comparatior;
	}

	Comparation(int row, int column, Type t, Expression A, Expression B, String comparatior) {
		super(row, column, t, A, B);
		Comparatior = comparatior;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}