package nl.hanze.designpatterns.toppings;

import nl.hanze.designpatterns.pizza.Pizza;

abstract class ToppingDecorator implements Pizza {
	protected Pizza pizza;
	
	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}	
	
	public String getDescription() {
		return pizza.getDescription();
	}
	
	public double getPrice() {
		return pizza.getPrice();
	}
}
