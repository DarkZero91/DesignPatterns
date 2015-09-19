package nl.hanze.designpatterns.toppings;

import nl.hanze.designpatterns.pizza.Pizza;

public class PizzaPriceDecorator extends ToppingDecorator {

	public PizzaPriceDecorator(Pizza pizza) {
		super(pizza);
	}

	public double getPrice() {
		switch(pizza.getSize()) {
			case SMALL:
				return pizza.getPrice() * .5;
			case MEDIUM:
				return pizza.getPrice();
			case LARGE:
				return pizza.getPrice() * 1.5;
			default:
				return pizza.getPrice();
		}
	}
}
