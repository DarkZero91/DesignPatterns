package nl.hanze.designpatterns;

public class ATM {
	ATMState state;
	
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
}
