
/*
 * A Subject can have any number of Observers.
 * When a Subject changes a data; that change is notified and the data is updated
 * with all the observers 
 * 
 * This interaction is called: Publish-Subscribe interaction.
 * */


package observer;

import java.util.LinkedList;

public class Main {
	public static void main(String []args) {
		System.out.println("Observer Pattern -===");
		
		
		StockServer server = new StockServer();
		server.setIBMPrice(199.6);
		
		StockClient client1 = new StockClient(server);

		server.setIBMPrice(133.6);
		server.notifyObservers();
		
	}
}
