package ast.statements;

import java.util.ArrayList;

import ast.expressions.Expression;
import semantic.Visitor;

public class Input extends AbstractStatement implements Statement {

	ArrayList<Expression> exp = new ArrayList<Expression>();

	public ArrayList<Expression> getExp() {
		return exp;
	}

	public void setExp(ArrayList<Expression> exp) {
		this.exp = exp;
	}

	public Input(int row, int column, ArrayList<Expression> A) {
		super(row, column);
		exp = A;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
