package ast.statements;

import ast.expressions.Expression;
import semantic.Visitor;

public class Asigment extends AbstractStatement implements Statement {
	public Expression ExpressionA;
	public Expression ExpressionB;

	public String Symbol = null;

	public Expression getExpressionA() {
		return ExpressionA;
	}

	public void setExpressionA(Expression expressionA) {
		ExpressionA = expressionA;
	}

	public Expression getExpressionB() {
		return ExpressionB;
	}

	public void setExpressionB(Expression expressionB) {
		ExpressionB = expressionB;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public Asigment(int row, int column, Expression A, Expression B) {
		super(row, column);
		ExpressionA = A;
		ExpressionB = B;
	}

	public Asigment(int row, int column, Expression A, Expression B, String o) {
		super(row, column);
		ExpressionA = A;
		ExpressionB = B;
		Symbol = o;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

}
