package ast.Definition;

import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition implements Definition, Statement {

	int offset;

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public VarDefinition(int row, int column, String n, Type t) {
		super(row, column, n, t);
	}

	public VarDefinition(int row, int column, String n) {
		super(row, column, n);
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
