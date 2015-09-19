package nl.hanze.designpatterns;

import nl.hanze.designpatterns.pizza.Pizza;
import nl.hanze.designpatterns.pizza.PlainPizza;
import nl.hanze.designpatterns.toppings.Mozzarella;
import nl.hanze.designpatterns.toppings.TomatoSauce;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pizza pizza = new Mozzarella(new TomatoSauce(new PlainPizza()));

        System.out.println("Size: " + pizza.getSize());
        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Price: " + pizza.getPrice());
    }
}
