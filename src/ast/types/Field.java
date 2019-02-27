package ast.types;

public class Field {
	String Name;
	Type type;

	public Field(String name, Type t) {
		Name = name;
		type = t;
	}
}
