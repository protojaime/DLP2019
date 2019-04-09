package ast.expressions;

import ast.Definition.Definition;
import ast.types.Type;
import semantic.Visitor;

public class Variable extends AbstractExpression implements Expression {

	String Name;
	Definition definition;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public boolean equals(Object obj) {

		Variable other = (Variable) obj;
		if (!Name.equals(other.Name)) {
			return false;
		}
		return true;
	}

	public Definition getDefinition() {
		return definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

	public Variable(int row, int column, String n) {
		super(row, column);
		Name = n;
	}

	public Variable(int row, int column, String n, Type t) {
		super(row, column, t);
		Name = n;

	}
}