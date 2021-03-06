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
public abstract class StockTrader implements Observer{
	protected List<SubjectStock> portfolio = new ArrayList<SubjectStock>();
	// When instantiated, each Trader object will have a portfolio of stocks
    //protected SubjectStock subject;
    
    private String traderName;
    
	public String getName() {
		
		return this.traderName;
	}
	public void setName(String name) {
		this.traderName = name;
	}
	
	public void addStock(SubjectStock stock) {
		getPortfolio().add(stock);
		stock.attatch(this);
	}
	
	public List<SubjectStock> getPortfolio(){
		return this.portfolio;
	}
	
}
