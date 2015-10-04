package nl.hanze.designpatterns;

public class TurnStereoOnWithCDVolume11 implements Command {
	ElectronicDevice stereo;
	
	public TurnStereoOnWithCDVolume11(ElectronicDevice Stereo){
		this.stereo = Stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCD("on");
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.setVolume(11);
		stereo.setCD("off");
		stereo.setVolume(0);
	}
}
