package nl.hanze.designpatterns.planet;

public class PlanetFactory {
	private PlanetFactory() {}
	
	public static Planet makePlanet(String name, boolean gravity, 
			boolean water, boolean oxygen) {
		if(name.equals("earth")) { return new Earth(gravity, water, oxygen); }
		if(name.equals("mars")) { return new Mars(gravity, water, oxygen); }
		return null;
	}
}
