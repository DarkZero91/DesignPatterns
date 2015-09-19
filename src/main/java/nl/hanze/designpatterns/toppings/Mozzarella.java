package nl.hanze.designpatterns.toppings;

import nl.hanze.designpatterns.pizza.Pizza;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return pizza.getDescription() + ", mozzarella";
	}

	public double getPrice() {
		return pizza.getPrice() + .50;
	}
	
}
