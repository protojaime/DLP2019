package ast.types;

import semantic.Visitor;

public class ArrayType extends AbstractType implements Type {
	public ArrayType(int row, int column) {
		super(row, column);

	}

	private int size;
	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public int offsetSize() {
		return type.offsetSize() * size;
	}

	public ArrayType(int row, int column, int size, Type type) {
		super(row, column);
		this.size = size;
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Type SquareBraquets(Type t) {
		if (t instanceof IntType) {
			return this.type;
		} else {
			return null;
		}
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}
}
