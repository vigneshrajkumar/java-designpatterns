package strategy;

public class Main {
	public static void main(String []args) {
		Context c1 = new Context(5, 5);
		
		c1.execute(new AddStrategy());
		c1.execute(new MultiplyStrategy());
		c1.execute(new SubStrategy());
	}

}
