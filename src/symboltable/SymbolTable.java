package symboltable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ast.Definition.Definition;

public class SymbolTable {

	private int scope = 0;
	private List<Map<String, Definition>> table = new ArrayList<Map<String, Definition>>();

	private static SymbolTable SymbolTableInstance;

	public SymbolTable() {
		table.add(new HashMap<String, Definition>());
	}

	public int getScope() {
		return scope;
	}

	public void setScope(int scope) {
		this.scope = scope;
	}

	public List<Map<String, Definition>> getTable() {
		return table;
	}

	public void setTable(List<Map<String, Definition>> table) {
		this.table = table;
	}

	public static SymbolTable getSymboltableinstance() {
		if (SymbolTableInstance == null) {
			SymbolTableInstance = new SymbolTable();
		}
		return SymbolTableInstance;
	}

	public void set() {
		table.add(new HashMap<String, Definition>());
		scope++;
	}

	public void reset() {
		table.remove(table.size() - 1);
		scope--;
	}

	public boolean insert(Definition definition) {
		definition.setScope(this.scope);
		Map<String, Definition> currentContext = table.get(table.size() - 1);
		if (currentContext.containsKey(definition.getName()))
			return false;
		else {
			currentContext.put(definition.getName(), definition);
			return true;
		}
	}

	public Definition find(String id) {
		Iterator<Map<String, Definition>> iterator = table.iterator();
		while (iterator.hasNext()) {
			Map<String, Definition> context = iterator.next();
			if (context.containsKey(id))
				return context.get(id);
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		Map<String, Definition> currentContext = table.get(table.size() - 1);
		if (currentContext.containsKey(id))
			return currentContext.get(id);
		return null;
	}

}
