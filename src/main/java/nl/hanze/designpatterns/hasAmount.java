package nl.hanze.designpatterns;

public class hasAmount implements ATMState {

	public void insertCard() {
		System.out.println("You already have put your card in me!");
	}

	public void ejectCard() {
		System.out.println("Here is your card back");
	}

	public void insertPin() {
		System.out.println("You already have put in your pin, please request your amount of money you wish to withdraw");
	}

	public void requestAmount() {
		System.out.println("Here is your money");
	}

	public void outOfService() {
		System.out.println("I'm out of service");		
	}

	public String getStateName() {
		return "Has Amount";
	}

}
