package ast.expressions;

import ast.types.IntType;

public class ConstantInt extends AbstractExpression implements Expression {
	int Value;

	public ConstantInt(int row, int column, int v) {
		super(row, column, new IntType());
		Value = v;

	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}
}