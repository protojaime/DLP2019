package ast.expressions;

import ast.types.Type;

public class Variable extends AbstractExpression implements Expression {
	String Name;

	public Variable(int row, int column, String n) {
		super(row, column);
		Name = n;
	}

	public Variable(int row, int column, String n, Type t) {
		super(row, column, t);
		Name = n;

	}
}