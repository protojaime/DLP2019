package ast.expressions;

import ast.types.IntType;
import semantic.Visitor;

public class ConstantInt extends AbstractExpression implements Expression {
	int Value;

	public ConstantInt(int row, int column, int v) {
		super(row, column, new IntType(row, column));
		Value = v;

	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}