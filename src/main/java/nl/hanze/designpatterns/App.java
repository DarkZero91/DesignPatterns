package nl.hanze.designpatterns;

import nl.hanze.designpatterns.planet.Planet;
import nl.hanze.designpatterns.planet.PlanetFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args.length < 4) {
    		System.out.println("Not enough parameters were supplied.");
    		System.out.println("Please supply the following parameters:");
    		System.out.println("name hasGravity hasWater hasOxygen");
    		System.exit(1);
    	}
    	
    	String name = args[0];
    	boolean gravity = Boolean.valueOf(args[1]);
    	boolean water = Boolean.valueOf(args[2]);
    	boolean oxygen = Boolean.valueOf(args[3]);
    	
    	new App(name, gravity, water, oxygen);
    }
    
    public App(String name, boolean gravity, boolean water, boolean oxygen) {
    	Planet planet = PlanetFactory.makePlanet(name, gravity, water, oxygen);
    	printPlanet(planet, name);
    }
    
    public void printPlanet(Planet planet, String name) {
    	System.out.print("Planet " + name);
    	
    	if(planet.hasGravity()) { System.out.print(" has gravity,"); }
    	else { System.out.print(" has no gravity,"); }
    	
    	if(planet.hasWater()) { System.out.print(" has water"); }
    	else { System.out.print(" has no water"); }
    	
    	if(planet.hasOxygen()) { System.out.println(" and has oxygen."); }
    	else { System.out.println(" and has no gravity."); }
    }
}
