package nl.hanze.designpatterns;

public class hasCorrectPin implements ATMState {

	public void insertCard() {
		System.out.println("You already put in your card");
	}

	public void ejectCard() {
		System.out.println("Here is your card");
	}

	public void insertPin() {
		System.out.println("You already entered your pin");
	}

	public void requestAmount() {
		System.out.println("What amount do you want");
	}

	public void outOfService() {
		System.out.println("I'm out of service");		
	}

	public String getStateName() {
		return "Insert Card";
	}

}
