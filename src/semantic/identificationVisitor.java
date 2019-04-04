package semantic;

import ast.ErrorHandler;
import ast.Definition.Definition;
import ast.Definition.FuncionDefinition;
import ast.Definition.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class identificationVisitor extends AbstractVisitor implements Visitor {

	@Override
	public Object Visit(FuncionDefinition functionDefinition, Object p) {

		if (!SymbolTable.getSymboltableinstance().insert(functionDefinition))
			new ErrorType(functionDefinition.getLine(), functionDefinition.getColumn(),
					"Funcion ya definida: " + functionDefinition.getName(), ErrorHandler.getEH());
		SymbolTable.getSymboltableinstance().set();
		super.Visit(functionDefinition, p);

		SymbolTable.getSymboltableinstance().reset();
		return null;
	}

	@Override
	public Object Visit(VarDefinition varDefinition, Object p) {

		if (!SymbolTable.getSymboltableinstance().insert(varDefinition))
			new ErrorType(varDefinition.getLine(), varDefinition.getColumn(),
					"Variable ya definida: " + varDefinition.getName(), ErrorHandler.getEH());
		else
			varDefinition.setScope(SymbolTable.getSymboltableinstance().getScope());

		super.Visit(varDefinition, p);
		return null;
	}

	@Override
	public Object Visit(Variable variable, Object p) {

		Definition def = SymbolTable.getSymboltableinstance().find(variable.getName());
		if (def != null) {
			variable.setDefinition(def);
			variable.setType(def.getType());
		} else {
			// is la variable es nula creamos una nueva definicion de variable de tipo error
			// y la asignamos
			new ErrorType(variable.getLine(), variable.getColumn(), "simbolo no definido: " + variable.getName(),
					ErrorHandler.getEH());
		}
		super.Visit(variable, p);
		return null;
	}

}
