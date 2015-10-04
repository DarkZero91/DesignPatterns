package nl.hanze.designpatterns.planet;

public class Earth extends Planet {
	public Earth(boolean gravity, boolean water, boolean oxygen) {
		this.gravity = gravity;
		this.oxygen = oxygen;
		this.water = water;
	}
}
