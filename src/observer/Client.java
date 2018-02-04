package observer;

import observer.Observer;
import observer.Subject;

public class Client implements Observer {
	
	private String attackMode;
	
	private Subject subject;
	
	private int clientID;
	
	private static int clientIDTracker;
	
	Client(Subject sub){
		this.subject = sub;
		clientID = ++clientIDTracker;
		subject.register(this);
	}

	@Override
	public void update(String newMode) {
		this.attackMode = newMode;
		System.out.println("I: Client Updated | ID:" + this.clientID + " Mode:" + this.attackMode);
	}

	
}
