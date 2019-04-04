package ast.expressions;

import ast.ASTNode;
import ast.types.Type;

public interface Expression extends ASTNode {
	public boolean getLvalue();

	public void setLvalue(boolean lvalue);

	public Type getType();

	public void setType(Type t);

}
