package nl.hanze.designpatterns;

import java.util.Random;

import javax.swing.JFrame;

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
public class App extends JFrame
{
	private static final long serialVersionUID = 1L;

	public static void main( String[] args ) { new App(); }
	
	public App() {
		super("StockGrabber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setup();
		
		pack();
		setVisible(true);
	}
	
	public void setup() {
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
