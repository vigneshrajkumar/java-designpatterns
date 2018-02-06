package factory;

public class City implements Car {

	@Override
	public void start() {
		System.out.println("City: Starting");
	}

}
