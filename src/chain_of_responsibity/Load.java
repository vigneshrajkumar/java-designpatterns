package chain_of_responsibity;

public class Load {
	
	private int operandOne;
	private int operandTwo;
	private String operator;	
	
	public Load(int operandOne, int operandTwo, String operator) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operator = operator;
	}

	public int getOperandOne() {
		return operandOne;
	}
	
	public int getOperandTwo() {
		return operandTwo;
	}
	
	public String getOperator() {
		return operator;
	}

	
	
}
