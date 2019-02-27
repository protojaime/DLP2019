package ast.expressions;

import ast.types.Type;

public class Cast extends AbstractExpression implements Expression {
	Type ImplementedType;
	Expression ex;

	public Cast(int row, int column, Expression e, Type s) {
		super(row, column);
		ImplementedType = s;
	}

	public Cast(int row, int column, Type t, Expression e, Type s) {
		super(row, column, t);
		ImplementedType = s;
	}

}
