package nl.hanze.designpatterns;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nl.hanze.designpatterns.planet.Earth;
import nl.hanze.designpatterns.planet.Planet;
import nl.hanze.designpatterns.planet.PlanetFactory;

public class PlanetFactoryTest {

	@Test
	public void testMakePlanetEarth() {
		Planet planet = makePlanet("earth");
		assertTrue(planet instanceof Earth);
	}
	
	private Planet makePlanet(String name) {
		Planet planet = PlanetFactory.makePlanet(name, true, true, true);
		
		assertTrue(planet.hasGravity());
		assertTrue(planet.hasOxygen());
		assertTrue(planet.hasWater());
		
		return planet;
	}
}
