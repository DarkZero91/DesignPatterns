package nl.hanze.designpatterns;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import nl.hanze.designpatterns.async.GetTheStock;
import nl.hanze.designpatterns.observers.IBMPrice;
import nl.hanze.designpatterns.observers.Observer;
import nl.hanze.designpatterns.stocks.IBMStock;
import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.subjects.StockGrabber;
import nl.hanze.designpatterns.subjects.Subject;
import nl.hanze.designpatterns.views.GraphView;
import nl.hanze.designpatterns.views.TextView;

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
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {}
		
		setup();
		
		pack();
		setVisible(true);
	}
	
	public void setup() {
		JTabbedPane tabbedPane = new JTabbedPane();
		this.add(tabbedPane);
		
		// Create Views
		GraphView graph = new GraphView();
		tabbedPane.addTab("Graph", graph);	
		
		TextView textView = new TextView();
		tabbedPane.addTab("Text", textView);	
		
		// Create Subject and Observer objects.
		Subject stockGrabber = new StockGrabber();
		Observer ibm = new IBMPrice();
		ibm.addView(textView);
		ibm.addView(graph);
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
