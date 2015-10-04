package nl.hanze.designpatterns;

public class Idle implements ATMState {

	public void insertCard() {
		System.out.println("Thank you for using me.");
	}

	public void ejectCard() {
		System.out.println("Here is your card");
	}

	public void insertPin() {
		System.out.println("Please insert your card first");
	}

	public void requestAmount() {
		System.out.println("Please insert your card first");
	}

	public void outOfService() {
		System.out.println("I'm out of service");		
	}
	
	public String getStateName() {
		return "Idle";
	}

}
