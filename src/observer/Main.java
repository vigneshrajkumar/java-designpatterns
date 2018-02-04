package observer;

public class Main {

	public static void main(String[] args) {
		
		Server s1 = new Server("Flank!");
		
		Client c1 = new Client(s1);
		Client c2 = new Client(s1);
		Client c3 = new Client(s1);
		
		
		
		s1.updateMode("Hide!");
		
		
		s1.updateMode("Stay Put!!");
		
		s1.updateMode("Attack!!");
				

	}

}
