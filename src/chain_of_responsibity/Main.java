package chain_of_responsibity;

public class Main {

	public static void main(String[] args) {
		
		Chain ch1 = new AddOperation();
		Chain ch2 = new SubtractOperation();
		
		ch1.setNextChain(ch2);
		
		Load loadOne = new Load(5,5,"+");
		
		ch1.calculate(loadOne);
		

	}

}
