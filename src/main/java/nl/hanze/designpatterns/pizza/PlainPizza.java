package nl.hanze.designpatterns.pizza;

public class PlainPizza implements Pizza {
	private PizzaSize size = PizzaSize.MEDIUM;
	
	public String getDescription() {
		return "Thin dough";
	}

	public double getPrice() {
		return 4.0;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public PizzaSize getSize() {
		return size;
	}

}
