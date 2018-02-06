package factory;

public class CarFactory {
	public Car getCar(String carModel) {
		
		switch (carModel){
		case "verna":
			return new Verna();
		case "city":
			return new City();
		}
		
		return null;
	}
}
