package ast.types;

public class ArrayType extends AbstractType implements Type {
	private int size;
	private Type type;

	public ArrayType() {
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

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
