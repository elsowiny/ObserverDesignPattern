/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elsowiny_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elsow
 */
public class SubjectStock {
    //Each stock keeps a track of it's observers
    //To be notified if the stock price changes
    private List<StockTrader> observers = new ArrayList<StockTrader>();
    private int stockPrice;
    public String stockName;
    
    public String getStockName() {
    	return this.stockName;
    }
    
    
    public int getStockPrice(){
        return stockPrice;
    }
    
    
    // ALL STOCKS that inherit this class, will have all their observers(traders)
    //notified when the price is changed
    
    public void setStockPrice(int stockPrice){
        this.stockPrice = stockPrice;
        notifyAllObservers();
    }
    public void attatch(StockTrader observer){
       observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for (StockTrader observer : observers){
        observer.update();
        }
    }
    
    public String getObservers() {
    	String traders = "";
    	String stock = getStockName();
    	String lastStockTrader = observers.get(observers.size() -1 ).getName();
    	String number_of_traders = String.valueOf(observers.size());
    	
    	for(int i = 0; i < observers.size()- 1; i++) {
    		traders += observers.get(i).getName() + ",";
    	}
    	return traders +" and " + lastStockTrader +
    			" are registered with the stock " + stock + "."
    					+ " Whenever the price of "+ stock + " changes, "
    					+ " all these " + number_of_traders +
    					" traders are notified and the " + stock + 
    					" price is updated for each trader automatically. "
    					;
    }
}
