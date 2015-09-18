package nl.hanze.designpatterns;

import java.util.Random;

import nl.hanze.designpatterns.async.GetTheStock;
import nl.hanze.designpatterns.observers.IBMPrice;
import nl.hanze.designpatterns.observers.Observer;
import nl.hanze.designpatterns.stocks.IBMStock;
import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.subjects.StockGrabber;
import nl.hanze.designpatterns.subjects.Subject;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
    {
		// Create Subject and Observer objects.
		Subject stockGrabber = new StockGrabber();
		Observer ibm = new IBMPrice();
		stockGrabber.registerObserver(ibm);
		
		// Instantiate the GetTheStock object.
		Random rand = new Random();
		GetTheStock gts = new GetTheStock();
		gts.setRandomizer(rand);
		gts.setSubject(stockGrabber);
		
		// Add stock objects to update.
		Stock ibmStock = new IBMStock();
		ibmStock.setPrice(10);
		gts.addStock(ibmStock);
		
		// Start the task.
		Thread thread = new Thread(gts);
		thread.start();
    }
}
