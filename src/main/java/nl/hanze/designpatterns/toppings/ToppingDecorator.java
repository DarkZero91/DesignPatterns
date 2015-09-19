package nl.hanze.designpatterns.toppings;

import nl.hanze.designpatterns.pizza.Pizza;
import nl.hanze.designpatterns.pizza.PizzaSize;

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
	
	public void setSize(PizzaSize size) {
		pizza.setSize(size);		
	}

	public PizzaSize getSize() {
		return pizza.getSize();
	}
}
