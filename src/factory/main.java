package factory;

public class main {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		
		Car carOne = factory.getCar("verna");
		carOne.start();
		
		Car carTwo = factory.getCar("city");
		carTwo.start();

	}

}
