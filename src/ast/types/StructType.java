package ast.types;

import java.util.ArrayList;

import ast.ErrorHandler;
import semantic.Visitor;

public class StructType extends AbstractType {
	public StructType(int row, int column) {
		super(row, column);
	}

	public StructType(int row, int column, ArrayList<Field> f) {
		super(row, column);
		Fieldlist = f;
	}

	ArrayList<Field> Fieldlist = new ArrayList<Field>();

	public ArrayList<Field> getFieldlist() {
		return Fieldlist;
	}

	public Field getField(String name) {
		if (!this.Fieldlist.contains(new Field(0, 0, name))) {
			return null;
		} else {
			return this.Fieldlist.get(this.Fieldlist.indexOf(new Field(0, 0, name)));
		}

	}

	public void FieldlistAdd(Field f) {
		if (this.Fieldlist.contains(f)) {
			new ErrorType(f.getLine(), f.getColumn(), "same field exist within this struct", ErrorHandler.getEH());
		} else {
			this.Fieldlist.add(f);
		}
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public Type Dot(String s) {
		if (this.getFieldlist().contains(new Field(0, 0, s)))
			return this;
		return null;
	}

	public void setFieldlist(ArrayList<Field> fieldlist) {
		Fieldlist = fieldlist;
	}

}
