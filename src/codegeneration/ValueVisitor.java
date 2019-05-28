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
import ast.types.ArrayType;

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
	public Object Visit(ArrayInvocation d, Object o) {
		d.Accept(av, o);
		this.cg.load(d.getType().getSuffix());
		return null;
	}

	@Override
	public Object Visit(FuncionInvocation funcionInvocation, Object o) {

		for (Expression def : funcionInvocation.getExpressions()) {
			def.Accept(this, o);
		}
		this.cg.call((funcionInvocation.getVariable().getName()));

		return null;
	}

	@Override
	public Object Visit(Arithmetic d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		this.cg.getOperation(d.getOperator(), d.getType().getSuffix());

		return null;
	}

	@Override
	public Object Visit(Cast d, Object o) {
		d.getEx().Accept(this, o);
		this.cg.convert(d.getEx().getType(), d.getImplementedType());

		return null;
	}

	@Override
	public Object Visit(Comparation d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		this.cg.getOperation(d.getOperator(), d.getType().getSuffix());
		return null;
	}

	@Override
	public Object Visit(FieldAccess d, Object o) {
		d.Accept(av, o);
		this.cg.load(d.getType().getSuffix());
		return null;
	}

	@Override
	public Object Visit(Logical d, Object o) {
		d.getExpressionA().Accept(this, o);
		d.getExpressionB().Accept(this, o);
		this.cg.getOperation(d.getOperator(), d.getType().getSuffix());

		return null;
	}

	@Override
	public Object Visit(UnaryMinus d, Object o) {
		String s = d.getExpression().getType().getSuffix();
		this.cg.push(s, "0");
		d.getExpression().Accept(this, o);
		this.cg.getOperation("-", s);
		return null;
	}

	@Override
	public Object Visit(UnaryNot d, Object o) {
		d.getExpression().Accept(this, o);
		this.cg.getOperation("!", d.getExpression().getType().getSuffix());
		return null;
	}

	@Override
	public Object Visit(Variable d, Object o) {
		d.Accept(this.av, o);
		if (d.getType() instanceof ArrayType) {
			for (int i = 0; i < ((ArrayType) d.getType()).getSize(); i++) {
				// teoricamente se podrian imprimir arrays de otras cosas si cambias
				// TypeCheckingV
				this.cg.load(((ArrayType) d.getType()).getType().getSuffix());
			}

		} else
			this.cg.load(d.getType().getSuffix());
		return null;
	}

	@Override
	public Object Visit(ConstantChar d, Object o) {
		this.cg.push("b", Integer.toString((int) (d.getValue().toCharArray()[0])));
		return null;
	}

	@Override
	public Object Visit(ConstantInt d, Object o) {
		this.cg.push("i", Integer.toString(d.getValue()));
		return null;
	}

	@Override
	public Object Visit(ConstantDouble d, Object o) {
		this.cg.push("f", Double.toString(d.getValue()));
		return null;
	}
}
