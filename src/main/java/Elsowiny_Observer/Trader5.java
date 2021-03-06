package Elsowiny_Observer;

public class Trader5 extends StockTrader {

	@Override
	public void update(SubjectStock subjectStock) {
		String name = this.getName();
		System.out.println("I'm " + name
						+ " & I just got notified of a stock change from " + subjectStock.getStockName());
		
		
	}

}
