package ast.expressions;

import ast.types.Type;
import semantic.Visitor;

public class Logical extends AbstractBinaryExpression implements Expression {
	String LogicSymbol;

	public Logical(int row, int column, Expression A, Expression B, String logicSymbol) {
		super(row, column, A, B);
		LogicSymbol = logicSymbol;
	}

	Logical(int row, int column, Type t, Expression A, Expression B, String logicSymbol) {
		super(row, column, t, A, B);
		LogicSymbol = logicSymbol;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

}