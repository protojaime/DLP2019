package ast.expressions;

import ast.types.DoubleType;
import semantic.Visitor;

public class ConstantDouble extends AbstractExpression implements Expression {
	Double Value;

	public ConstantDouble(int row, int column, Double v) {
		super(row, column, new DoubleType(row, column));
		Value = v;
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}