package nl.hanze.designpatterns;

public interface ElectronicDevice {
	public void on();
	public void off();
	public void volumeUp();
	public void volumeDown();
	public void setVolume(int volume);
	public void setCD(String state);
}
