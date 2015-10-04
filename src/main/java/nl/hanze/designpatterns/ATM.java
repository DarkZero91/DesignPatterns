package nl.hanze.designpatterns;

public class ATM implements GetATMData{
	final ATMState defaultstate = new Idle();
	ATMState state;
	int cash = 500000;
	
	public ATM(){
		setATMstate(defaultstate);
	}
	
	public void setATMstate(ATMState state){
		this.state = state;
	}
	
	public void insertCard(){
		state.insertCard();
	}
	
	public void ejectCard(){
		state.ejectCard();
	}
	
	public void insertPin(){
		state.insertPin();
	}
	
	public void requestAmount(){
		state.requestAmount();
	}
	
	public void outOfService(){
		state.outOfService();
	}
	
	public String getATMstate() {
		return state.getStateName();
	}

	public int getCashInMachine() {
		return cash;
	}
}
