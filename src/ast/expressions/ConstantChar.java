package ast.expressions;

import ast.types.CharType;

public class ConstantChar extends AbstractExpression implements Expression {
	String Value;

	public ConstantChar(int row, int column, String v) {
		super(row, column, new CharType());
		Value = v;

	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

}