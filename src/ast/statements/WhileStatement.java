package ast.statements;

import java.util.ArrayList;

import ast.expressions.Expression;
import semantic.Visitor;

public class WhileStatement extends AbstractStatement implements Statement {
	ArrayList<Statement> Body = new ArrayList<Statement>();
	Expression Expression;

	public WhileStatement(int row, int column, Expression A, ArrayList<Statement> body) {
		super(row, column);
		Expression = A;
		Body = body;

	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	public ArrayList<Statement> getBody() {
		return Body;
	}

	public void setBody(ArrayList<Statement> body) {
		Body = body;
	}

	public Expression getExpression() {
		return Expression;
	}

	public void setExpression(Expression expression) {
		Expression = expression;
	}

}
