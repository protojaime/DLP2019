package ast.statements;

import ast.expressions.Expression;
import semantic.Visitor;

public class Return extends AbstractStatement implements Statement {

	public Expression Expression;

	public Return(int row, int column, Expression A) {
		super(row, column);
		Expression = A;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
