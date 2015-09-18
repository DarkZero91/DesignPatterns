package nl.hanze.designpatterns;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import nl.hanze.designpatterns.async.GetTheStock;
import nl.hanze.designpatterns.observers.IBMPrice;
import nl.hanze.designpatterns.observers.MSPrice;
import nl.hanze.designpatterns.observers.Observer;
import nl.hanze.designpatterns.stocks.IBMStock;
import nl.hanze.designpatterns.stocks.MSStock;
import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.subjects.StockGrabber;
import nl.hanze.designpatterns.subjects.Subject;
import nl.hanze.designpatterns.views.GraphView;
import nl.hanze.designpatterns.views.TextView;
import nl.hanze.designpatterns.views.View;

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
		GraphView graphView = new GraphView();
		tabbedPane.addTab("Graph", graphView);	
		
		TextView textView = new TextView();
		tabbedPane.addTab("Text", textView);
		
		// Create Subject and Observer objects.
		Subject stockGrabber = new StockGrabber();
		View[] views = {graphView, textView};
				
		initObserver(new IBMPrice(), stockGrabber, views);
		initObserver(new MSPrice(), stockGrabber, views);
		
		// Create the stocks.
		Stock ibmStock = new IBMStock();
		ibmStock.setPrice(10);
		
		Stock msStock = new MSStock();
		msStock.setPrice(15);
		
		// Instantiate the GetTheStock objects.
		Random rand = new Random();	
		createStockTask(stockGrabber, ibmStock, rand);
		createStockTask(stockGrabber, msStock, rand);
	}
	
	private void initObserver(Observer observer, Subject subject, View[] views) {
		for(View view : views) {observer.addView(view); } 
		subject.registerObserver(observer);
	}
	
	private void createStockTask(Subject subject, Stock stock, Random rand) {
		GetTheStock gts = new GetTheStock();
		gts.setRandomizer(rand);
		gts.setSubject(subject);
		gts.addStock(stock);
		
		// Start the task.
		Thread thread = new Thread(gts);
		thread.start();
	}
}
