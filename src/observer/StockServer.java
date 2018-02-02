package observer;

import java.util.ArrayList;

public class StockServer implements Subject{
	
	private ArrayList<Observer> observers;
	
	private double ibmPrice;
	
	StockServer(){
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		System.out.println("Observer: " + newObserver.toString() + " added");
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int indexOfObserver = observers.indexOf(deleteObserver);
		observers.remove(indexOfObserver);
		System.out.println("Observer: " + deleteObserver.toString() + " removed");
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(ibmPrice);
		}
	}
	
	public void setIBMPrice(double price) {
		this.ibmPrice = price;
	}
}
