package nl.hanze.designpatterns.stocks;

public abstract class Stock {
	protected String name;
	protected double price;
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
