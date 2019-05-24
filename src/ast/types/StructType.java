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
	public int offsetSize() {
		int of = 0;
		for (Field f : this.Fieldlist) {
			of += f.getType().offsetSize();
		}
		return of;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	@Override
	public Type Dot(String s) {
		int i = this.getFieldlist().indexOf(new Field(0, 0, s));
		if (i != -1) {
			return this.getFieldlist().get(i).type;
		}
		return null;
	}

	public void setFieldlist(ArrayList<Field> fieldlist) {
		Fieldlist = fieldlist;
	}

	public int getFieldOffset(String name) {
		int position = this.Fieldlist.indexOf(new Field(0, 0, name));
		int offset = 0;
		for (int i = 0; i < position; i++) {
			offset += this.Fieldlist.get(i).getType().offsetSize();
		}
		return offset;
	}

}
