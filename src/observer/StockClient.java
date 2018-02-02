package observer;

public class StockClient implements Observer{
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockObserver;
	
	private double ibmPrice;
	
	public StockClient(Subject stockGrabber) {
		
		this.stockObserver = stockGrabber;
		this.observerID = ++observerIDTracker;
		stockGrabber.register(this);
		
		System.out.println("New Observer " + this.observerID);
	}

	@Override
	public void update(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		System.out.println("Observer:"+ observerID +" IBM Price updated to " + ibmPrice);	
	}
	
	public void printPrices() {
		System.out.println("IBM Price" + this.ibmPrice);
	}
	
	public String toString() {
		return "ID:" + this.observerID;
	}

}
