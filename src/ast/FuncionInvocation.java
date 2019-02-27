package ast;

import java.util.ArrayList;

import ast.expressions.Expression;
import ast.expressions.Variable;
import ast.statements.Statement;
import ast.types.Type;

public class FuncionInvocation extends AbstractASTNode implements Statement, Expression {
	Variable variable;
	Type t;
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

}
