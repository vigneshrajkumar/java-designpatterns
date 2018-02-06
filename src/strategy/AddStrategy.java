package strategy;

public class AddStrategy implements Strategy {

	@Override
	public void operate(int operandOne, int operandTwo) {
		System.out.println("Addition:" + (operandOne + operandTwo));
	}

}
