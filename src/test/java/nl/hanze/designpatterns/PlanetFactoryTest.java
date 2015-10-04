package nl.hanze.designpatterns;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.hanze.designpatterns.planet.Earth;
import nl.hanze.designpatterns.planet.Mars;
import nl.hanze.designpatterns.planet.Planet;
import nl.hanze.designpatterns.planet.PlanetFactory;
import nl.hanze.designpatterns.planet.Pluto;

public class PlanetFactoryTest {

	@Test
	public void testMakePlanetEarth() {
		Planet planet = makePlanet("earth");
		assertTrue(planet instanceof Earth);
	}
	
	@Test
	public void testMakePlanetMars() {
		Planet planet = makePlanet("mars");
		assertTrue(planet instanceof Mars);
	}
	
	@Test
	public void testMakePlanetPluto() {
		Planet planet = makePlanet("pluto");
		assertTrue(planet instanceof Pluto);
	}
	
	private Planet makePlanet(String name) {
		Planet planet = PlanetFactory.makePlanet(name, true, true, true);
		
		assertTrue(planet.hasGravity());
		assertTrue(planet.hasOxygen());
		assertTrue(planet.hasWater());
		
		return planet;
	}
}
