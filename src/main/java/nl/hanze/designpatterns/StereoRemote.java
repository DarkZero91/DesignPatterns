package nl.hanze.designpatterns;

public class StereoRemote {
	public static ElectronicDevice getDevice(){
		return new Stereo();
	}
}
