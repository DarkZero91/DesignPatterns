package nl.hanze.designpatterns;

public class outOfService implements ATMState {

	public void insertCard() {
		System.out.println("Machine is out of service");
	}

	public void ejectCard() {
		System.out.println("Machine is out of service");
	}

	public void insertPin() {
		System.out.println("Machine is out of service");
	}

	public void requestAmount() {
		System.out.println("Machine is out of service");
	}
	
	public void outOfService() {
		System.out.println("I'm out of service");		
	}

}
