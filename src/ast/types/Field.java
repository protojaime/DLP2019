package ast.types;

import ast.AbstractASTNode;
import semantic.Visitor;

public class Field extends AbstractASTNode {
	@Override
	public String toString() {
		return "Field [Name=" + Name + ", type=" + type + "]";
	}

	String Name;
	Type type;

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

	public Field(int row, int column, String name) {
		super(row, column);
		Name = name;
	}

	public Field(int row, int column, String name, Type t) {
		super(row, column);
		Name = name;
		type = t;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
