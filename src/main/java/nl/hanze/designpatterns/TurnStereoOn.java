package nl.hanze.designpatterns;

public class TurnStereoOn implements Command {
	ElectronicDevice theDevice;
	
	public TurnStereoOn(ElectronicDevice newDevice){
		theDevice = newDevice;
	}
	
	public void execute() {
		theDevice.on();
	}

	public void undo() {
		theDevice.off();
	}

}
