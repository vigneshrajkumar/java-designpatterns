package strategy;

public class SubStrategy implements Strategy {

	@Override
	public void operate(int operandOne, int operandTwo) {
		System.out.println("Subtraction:" + (operandOne - operandTwo));
	}
}
