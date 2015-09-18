package nl.hanze.designpatterns;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nl.hanze.designpatterns.stocks.Stock;

public class GetTheStock implements Runnable {
	private List<Stock> stocks;
	private Subject subject;
	private Random rand;
	
	public GetTheStock() {
		stocks = new ArrayList<Stock>();
	}
	
	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void setRandomizer(Random rand) {
		this.rand = rand;
	}
	
	public void updateStock(Stock stock) {
		double randNum = (rand.nextDouble() * (.06)) - .03;
		DecimalFormat df = new DecimalFormat("#.##");
		
		double price = Double.valueOf(df.format((stock.getPrice() + randNum)).replace(",", "."));
		stock.setPrice(price);
	}
	
	public void run() {
		for(Stock stock : stocks) {
			updateStock(stock);
			subject.notifyObservers(stock);
			
			try { Thread.sleep(2000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
