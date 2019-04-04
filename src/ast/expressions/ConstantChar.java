package ast.expressions;

import ast.types.CharType;
import semantic.Visitor;

public class ConstantChar extends AbstractExpression implements Expression {
	String Value;

	public ConstantChar(int row, int column, String v) {
		super(row, column, new CharType(row, column));
		Value = v;

	}

	public ConstantChar(int row, int column, char lexemeToChar) {
		super(row, column, new CharType(row, column));
		Value = "" + lexemeToChar;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}