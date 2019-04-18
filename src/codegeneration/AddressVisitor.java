package codegeneration;

import ast.expressions.ArrayInvocation;
import ast.expressions.FieldAccess;
import ast.expressions.Variable;

public class AddressVisitor extends abstractCodeGeneratorVisitor {
	ValueVisitor vv;

	AddressVisitor(CodeGenerator c, ValueVisitor v) {
		super(c);
		vv = v;

	}

	@Override
	public Object Visit(Variable d, Object o) {

		return null;
	}

	@Override
	public Object Visit(ArrayInvocation d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}

	@Override
	public Object Visit(FieldAccess d, Object o) {
		d.setLvalue(true);
		super.Visit(d, o);

		return null;
	}
}
