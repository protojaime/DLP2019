package ast.expressions;

import ast.types.Type;

public class Logical extends AbstractBinaryExpression implements Expression {
	String LogicSymbol;

	Logical(int row, int column, Expression A, Expression B, String logicSymbol) {
		super(row, column, A, B);
		LogicSymbol = logicSymbol;
	}

	Logical(int row, int column, Type t, Expression A, Expression B, String logicSymbol) {
		super(row, column, t, A, B);
		LogicSymbol = logicSymbol;
	}
}