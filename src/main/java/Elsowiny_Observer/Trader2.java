package Elsowiny_Observer;

public class Trader2 extends StockTrader{

	@Override
	public void update() {
		String name = this.getName();
		System.out.println("I'm " + name
						+ " & I just got notified of a stock change");
		
	}

}
