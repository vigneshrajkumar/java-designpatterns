package strategy;

public class Context {
	
	int operandOne, operandTwo;
	
	public Context(int operandOne, int operandTwo){
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
	}
	
	public void execute(Strategy strat) {
		strat.operate(operandOne, operandTwo);
	}
}
