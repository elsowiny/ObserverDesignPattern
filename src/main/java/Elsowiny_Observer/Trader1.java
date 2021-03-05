package Elsowiny_Observer;

import java.util.ArrayList;
import java.util.List;

public class Trader1 extends StockTrader {
	
	

	@Override
	public void update() {
		String name = this.getName();
		System.out.println("I'm " + name
						+ " & I just got notified of a stock change");
	}
	
	  

}
