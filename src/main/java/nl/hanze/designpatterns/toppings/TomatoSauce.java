package nl.hanze.designpatterns.toppings;

import nl.hanze.designpatterns.pizza.Pizza;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return pizza.getDescription() + ", Tomato Sauce";
	}
	
	public double getPrice() {
		return pizza.getPrice() + .35;
	}

}
