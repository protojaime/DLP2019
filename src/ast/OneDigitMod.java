package ast;

import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class OneDigitMod extends AbstractASTNode implements Statement, Expression {

	String Symbol;

	public Variable getVariable() {
		return variable;
	}

	public String getSymbol() {
		return Symbol;
	}

	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	Variable variable;
	Type t;
	boolean Lvalue;

	public OneDigitMod(int row, int column, Variable var, String s) {
		super(row, column);
		variable = var;
		Symbol = s;
	}

	@Override
	public Type getType() {
		return t;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public boolean getLvalue() {
		return Lvalue;
	}

	@Override
	public void setLvalue(boolean lvalue) {
		Lvalue = lvalue;
	}

	@Override
	public void setType(Type t) {
		this.t = t;

	}
}
