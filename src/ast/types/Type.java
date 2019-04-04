package ast.types;

import java.util.List;

import ast.ASTNode;

public interface Type extends ASTNode {

	public boolean isLogical();

	/*
	 * metodo usado para Arithmetic
	 */
	public Type Arithmetic(Type t);

	public Type Logical();

	public Type Logical(Type t);

	public Type Comparation(Type t);

	public Type canBeCast(Type t);

	/*
	 * metodo usado para saver si el tipo es simple: no es muy necesario porque lo
	 * divivi en el sintactico
	 */
	public boolean isBuildInType();

	public Type Dot(String s);

	public Type SquareBraquets(Type t);

	public Type promotesTo(Type t);

	public Type Parenthesis(List<Type> lt);

	/*
	 * returns the offset size of the type, not to be confused with arraysize in
	 * type
	 */
	public int size();

	/*
	 * metodo usado para UnaryMinus
	 */
	public Type Arithmetic();
}
