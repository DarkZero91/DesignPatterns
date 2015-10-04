package nl.hanze.designpatterns;

public class hasCard implements ATMState {

	public void insertCard() {
		System.out.println("You already put in your card");
	}

	public void ejectCard() {
		System.out.println("Here is your card");
	}

	public void insertPin() {
		System.out.println("Your pin has been entered");
	}

	public void requestAmount() {
		System.out.println("Please enter your pin first");
	}

	public void outOfService() {
		System.out.println("I'm out of service");		
	}

	public String getStateName() {
		return "Has Card";
	}

}
