package strategy;

public class MultiplyStrategy implements Strategy {

	@Override
	public void operate(int operandOne, int operandTwo) {
		System.out.println("Multiplication:" + (operandOne * operandTwo));
	}

}
