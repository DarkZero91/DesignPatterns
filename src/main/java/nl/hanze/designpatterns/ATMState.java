package nl.hanze.designpatterns;

public interface ATMState {
	public void insertCard();
	public void ejectCard();
	public void insertPin();
	public void requestAmount();
	public void outOfService();
	public String getStateName();
}
