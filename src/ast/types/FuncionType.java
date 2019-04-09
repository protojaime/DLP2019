package ast.types;

import java.util.ArrayList;
import java.util.List;

import ast.Definition.VarDefinition;
import semantic.Visitor;

public class FuncionType extends AbstractType implements Type {

	public FuncionType(int row, int column, ArrayList<VarDefinition> V, Type t) {
		super(row, column);
		ReturnType = t;
		Vars = V;
	}

	@Override
	public Object Accept(Visitor v, Object o) {
		return v.Visit(this, o);
	}

	ArrayList<VarDefinition> Vars = new ArrayList<VarDefinition>();
	Type ReturnType;

	public ArrayList<VarDefinition> getVars() {
		return Vars;
	}

	public void setVars(ArrayList<VarDefinition> vars) {
		Vars = vars;
	}

	public Type getReturnType() {
		return ReturnType;
	}

	public void setReturnType(Type returnType) {
		ReturnType = returnType;
	}

	@Override
	public Type Parenthesis(List<Type> t) {
		if (this.getVars().size() != t.size()) {

			return null;

		} else {

			for (int i = 0; i < t.size(); i++) {
				Type T = t.get(i).promotesTo(this.getVars().get(i).getType());
				if (T == null) {
					return null;
				}
			}

		}
		return this.getReturnType();
	}

}
