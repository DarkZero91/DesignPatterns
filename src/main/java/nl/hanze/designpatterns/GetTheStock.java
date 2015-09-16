package nl.hanze.designpatterns;

import java.text.DecimalFormat;
import java.util.Random;

public class GetTheStock {
	private Random rand;
	private double price;
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setRandomizer(Random rand) {
		this.rand = rand;
	}
	
	public double getPrice() {
		double randNum = (rand.nextDouble() * (.06)) - .03;
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.valueOf(df.format((price + randNum)).replace(",", "."));
	}
}
