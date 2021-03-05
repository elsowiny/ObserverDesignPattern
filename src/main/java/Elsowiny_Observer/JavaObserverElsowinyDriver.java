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
    SubjectStock AAPL = new AAPL();
    SubjectStock GOOG = new GOOG();
    SubjectStock MSFT = new MFST();
    AAPL.setStockPrice(23);
    GOOG.setStockPrice(12);
    MSFT.setStockPrice(9);
    
    StockTrader trader1 = new Trader1();
    trader1.setName("Trader1");
    StockTrader trader2 = new Trader2();
    trader2.setName("Trader2");
    
    trader1.addStock(AAPL);
    trader1.addStock(GOOG);
    trader1.addStock(MSFT);
    
    trader2.addStock(MSFT);
    trader2.addStock(AAPL); 
    
    AAPL.setStockPrice(12);
    
    System.out.println(AAPL.getObservers());

    
    }
    
}
