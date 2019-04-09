package ast.types;

import semantic.Visitor;

public class VoidType extends AbstractType implements Type {
	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	public VoidType(int row, int column) {
		super(row, column);
	}

}
