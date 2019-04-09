package ast;

import java.util.ArrayList;

import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class FuncionInvocation extends AbstractASTNode implements Statement, Expression {
	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	public ArrayList<Expression> getExpressions() {
		return Expressions;
	}

	public void setExpressions(ArrayList<Expression> expressions) {
		Expressions = expressions;
	}

	Variable variable;
	Type t;
	boolean Lvalue;

	ArrayList<Expression> Expressions = new ArrayList<Expression>();

	public FuncionInvocation(int row, int column, ArrayList<Expression> expressions, Variable var) {
		super(row, column);
		Expressions = expressions;
		variable = var;
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
