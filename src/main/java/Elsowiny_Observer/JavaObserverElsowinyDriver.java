/*
 */

package Elsowiny_Observer;
import java.io.*;


/**
 *
 * @author elsow
 */
public class JavaObserverElsowinyDriver {

    public static void main(String args[]){
    //Create our stocks
   //
    SubjectStock AAPL = new AAPL();
    SubjectStock GOOG = new GOOG();
    SubjectStock MSFT = new MFST();
    //Set their stock prices
    AAPL.setStockPrice(23);
    GOOG.setStockPrice(12);
    MSFT.setStockPrice(9);
    
    //Get our traders
    StockTrader trader1 = new Trader1();
    trader1.setName("Trader1");
    StockTrader trader2 = new Trader2();
    trader2.setName("Trader2");
    StockTrader trader3 = new Trader3();
    trader3.setName("Trader3");
    StockTrader trader4 = new Trader4();
    trader4.setName("Trader4");
    StockTrader trader5 = new Trader5();
    trader5.setName("Trader5");
    StockTrader trader6 = new Trader6();
    trader6.setName("Trader6");
    
    //They pick their stocks
    trader1.addStock(AAPL);
    trader1.addStock(GOOG);
    trader1.addStock(MSFT);
    
    trader2.addStock(MSFT);
    trader2.addStock(AAPL); 
    
    trader3.addStock(MSFT);
    trader3.addStock(AAPL);
    trader3.addStock(GOOG);
    
    trader4.addStock(MSFT);
    
    trader5.addStock(AAPL);
    
    trader6.addStock(AAPL);
    
    //A stock Changes price and when doing so, it calls its own method to notify all it's observers to which they all update accordingly
    AAPL.setStockPrice(12);
    AAPL.setStockPrice(9);
    AAPL.getReport();
    GOOG.getReport();
    
    //Access our observers and their names
    System.out.println(AAPL.getObservers());
    System.out.println(GOOG.getObservers());
    
    
    }
    
}
