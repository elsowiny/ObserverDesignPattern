package Elsowiny_Observer;

public interface Subject {

	public void attatch(StockTrader observer);
	  
	public void notifyAllObservers();
	    
	public String getObservers();
	
	public void removeObserver(StockTrader observer);

}
