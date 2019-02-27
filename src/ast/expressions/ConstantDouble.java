package ast.expressions;

import ast.types.DoubleType;

public class ConstantDouble extends AbstractExpression implements Expression {
	Double Value;

	public ConstantDouble(int row, int column, Double v) {
		super(row, column, new DoubleType());
		Value = v;
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}
}