package nl.hanze.designpatterns;

import java.text.DecimalFormat;
import java.util.Random;

public class GetTheStock implements Runnable {
	private String stock;
	private double price;
	private Subject subject;
	private Random rand;
	
	public void setStockName(String stock) {
		this.stock = stock;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void setRandomizer(Random rand) {
		this.rand = rand;
	}
	
	public double updatePrice() {
		double randNum = (rand.nextDouble() * (.06)) - .03;
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.valueOf(df.format((price + randNum)).replace(",", "."));
	}
	
	public void run() {
		price = updatePrice();
		subject.notifyObservers(stock, price);
	}
}
