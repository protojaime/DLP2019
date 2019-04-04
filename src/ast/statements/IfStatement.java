package ast.statements;

import java.util.ArrayList;

import ast.expressions.Expression;
import semantic.Visitor;

public class IfStatement extends AbstractStatement implements Statement {
	ArrayList<Statement> Body = new ArrayList<Statement>();
	ArrayList<Statement> ElseBody = new ArrayList<Statement>();
	Expression Expression;

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	public IfStatement(int row, int column, Expression A, ArrayList<Statement> body, ArrayList<Statement> bodye) {
		super(row, column);
		Expression = A;
		Body = body;
		ElseBody = bodye;
	}

	public ArrayList<Statement> getBody() {
		return Body;
	}

	public void setBody(ArrayList<Statement> body) {
		Body = body;
	}

	public ArrayList<Statement> getElseBody() {
		return ElseBody;
	}

	public void setElseBody(ArrayList<Statement> elseBody) {
		ElseBody = elseBody;
	}

	public Expression getExpression() {
		return Expression;
	}

	public void setExpression(Expression expression) {
		Expression = expression;
	}

}
