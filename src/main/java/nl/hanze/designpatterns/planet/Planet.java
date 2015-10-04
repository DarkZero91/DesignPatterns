package nl.hanze.designpatterns.planet;

public abstract class Planet {
	protected boolean gravity, oxygen, water;
	
	public boolean hasGravity() { return gravity; }
	public boolean hasOxygen() { return oxygen; }
	public boolean hasWater() {return water; }
}
