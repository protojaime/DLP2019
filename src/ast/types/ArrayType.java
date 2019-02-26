package ast.types;

public class ArrayType implements Type {
	private int size;
	private Type type;

	public ArrayType(int size, Type type) {
		this.size = size;
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
