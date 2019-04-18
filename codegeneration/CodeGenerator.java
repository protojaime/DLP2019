import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {
	HashMap<String, String> Operations = new HashMap<String, String>();
	HashMap<String, String> LogicOperations = new HashMap<String, String>();
	
	CodeGenerator(){
		Operations.put("<", "gt");
		Operations.put(">", "lt");
		Operations.put("<=", "ge");
		Operations.put(">=", "le");
		Operations.put("==", "eq");
		Operations.put("!=", "ne"); 
		LogicOperations.put("&&", "and");
		LogicOperations.put("||", "or");
		LogicOperations.put("!", "not");
	}
	
	public void getLogicOperation(String OP) {
		stream.println("\t"+LogicOperations.get(OP) +"\t");
	}
	public void getOperation(String OP,String suffix) {
		stream.println("\t"+Operations.get(OP) + suffix +"\t");
	}
	
	public void pushbp() {
		stream.println("\tpush\tbp");
	}

	public void pusha(int num) {
		stream.println("\tpusha\t" + num);
	}

	public void push(String suffix, String value) {
		stream.println("\tpush" + suffix +"\t" + value);
	}

	public void pop(String suffix) {
		stream.println("\tpop" + suffix);
	}

	public void call(String name) {
		stream.println("\tcall\t" + name);
	}

	public void add() {
		stream.println("\tadd");
	}

	public void store(String suffix) {
		stream.println("\tstore" + suffix);
	}

	public void load(String suffix) {
		stream.println("\tload" + suffix);
	}
	public void dup(String suffix) {
		stream.println("\tdup" + suffix);
	}
	
	
	
	public void jumpIfZero(String label) {
		stream.println("\tjz\t" + label);
	}

	public void jumpIfNoZero(String label) {
		stream.println("\tjnz\t" + label);
	}
	public void jump(String label) {
		stream.println("\tjmp\t" + label);
	}

	public void out(String suffix) {
		stream.println("\tout" + suffix);
	}

	public void in(String suffix) {
		stream.println("\tin" + suffix);
	}
}
