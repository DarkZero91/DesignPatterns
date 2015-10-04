package nl.hanze.designpatterns;

public class ATMProxy implements GetATMData {
	GetATMData realATM = new ATM();
	public String getATMstate() {
		return realATM.getATMstate();
	}

	public int getCashInMachine() {
		return realATM.getCashInMachine();
	}
}
