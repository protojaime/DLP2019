package ast.types;

import semantic.Visitor;

public class CharType extends AbstractType implements Type {

	public CharType(int row, int column) {
		super(row, column);
	}

	@Override
	public boolean isBuildInType() {
		return true;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public Type canBeCast(Type t) {
		if (t.isBuildInType()) {
			return this;
		}
		return null;
	}

}
