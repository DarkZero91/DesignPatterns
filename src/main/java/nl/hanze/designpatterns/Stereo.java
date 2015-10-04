package nl.hanze.designpatterns;

public class Stereo implements ElectronicDevice {
	private int volume = 0;
	
	public void on() {
		System.out.println("Stereo is ON");
	}

	public void off() {
		System.out.println("Stereo is OFF");
	}

	public void volumeUp() {
		volume++;
		System.out.println("Stereo volume is at " + volume);
	}

	public void volumeDown() {
		volume--;
		System.out.println("Stereo volume is at " + volume);
	}

	public void setVolume(int volume) {
		this.volume = volume; 
		System.out.println("Stereo volume is at " + volume);
	}

	public void setCD(String state) {
		System.out.println("The CD player is " + state);
	}
}
