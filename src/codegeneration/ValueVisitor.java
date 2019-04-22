package codegeneration;

import ast.FuncionInvocation;
import ast.expressions.Arithmetic;
import ast.expressions.ArrayInvocation;
import ast.expressions.Cast;
import ast.expressions.Comparation;
import ast.expressions.ConstantChar;
import ast.expressions.ConstantDouble;
import ast.expressions.ConstantInt;
import ast.expressions.Expression;
import ast.expressions.FieldAccess;
import ast.expressions.Logical;
import ast.expressions.UnaryMinus;
import ast.expressions.UnaryNot;
import ast.expressions.Variable;

public class ValueVisitor extends abstractCodeGeneratorVisitor {

	public AddressVisitor getAv() {
		return av;
	}

	public void setAv(AddressVisitor av) {
		this.av = av;
	}

	AddressVisitor av;

	ValueVisitor(CodeGenerator c) {
		super(c);
	}

	@Override
	public Object Visit(FuncionInvocation funcionInvocation, Object o) {
		funcionInvocation.getVariable().Accept(this, o);
		for (Expression def : funcionInvocation.getExpressions()) {
			def.Accept(this, o);
		}

		return null;
	}

	@Override
	public Object Visit(Arithmetic d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ArrayInvocation d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Cast d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Comparation d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(FieldAccess d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Logical d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(UnaryMinus d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(UnaryNot d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(Variable d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ConstantInt d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ConstantChar d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(ConstantDouble d, Object o) {
		d.setLvalue(false);
		super.Visit(d, o);

		return null;
	}
}
