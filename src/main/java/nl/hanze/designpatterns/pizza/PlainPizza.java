package nl.hanze.designpatterns.pizza;

public class PlainPizza implements Pizza {
	public String getDescription() {
		return "Thin dough";
	}

	public double getPrice() {
		return 4.0;
	}

}
