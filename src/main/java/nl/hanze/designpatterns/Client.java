package nl.hanze.designpatterns;

public class Client {
	ATMProxy proxyatm;
	
	public Client(ATMProxy proxyatm){
		this.proxyatm = proxyatm;
	}
	public void whatsTheATMState(){
		System.out.println(proxyatm.getATMstate());
	}
	
	public void maxAmountOfCashCanIWithdraw(){
		System.out.println(proxyatm.getCashInMachine());
	}
}
