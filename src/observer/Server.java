package observer;

import java.util.ArrayList;

import observer.Subject;

public class Server implements Subject {
	
	private int serverID;
	private static int serverIDTracker;
	
	String attackMode;
	
	ArrayList<Observer> observers = new ArrayList<>();
	
	public Server(String defaultMessage){
		serverID = ++serverIDTracker;
		this.attackMode = defaultMessage;
		System.out.println("I: New Server Created | ID:" + this.serverID + " Mode:" + this.attackMode);
	}
	
	public void updateMode(String newMode) {
		this.attackMode = newMode;
		notifyObservers();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unRegister(Observer deleteObserver) {
		int index = observers.indexOf(deleteObserver);
		observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for (Observer ob: observers) {
			ob.update(this.attackMode);
		}
	}

}
