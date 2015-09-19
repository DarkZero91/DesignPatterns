package nl.hanze.designpatterns.pizza;

public interface Pizza {
	public String getDescription();
	public double getPrice();
	
	public void setSize(PizzaSize size);
	public PizzaSize getSize();
}
