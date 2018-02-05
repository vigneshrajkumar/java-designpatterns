package chain_of_responsibity;

public class SubtractOperation implements Chain {
	
	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;

	}

	@Override
	public void calculate(Load request) {
		if (request.getOperator() == "-"){
			int result = request.getOperandOne() - request.getOperandTwo();
			System.out.println( request.getOperandOne() + " - " + request.getOperandTwo() + " = " + result);
		}else {
			System.out.println("Unsupported Operator");
		}
		
	}
}
