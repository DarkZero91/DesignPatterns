package nl.hanze.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ATM atm = new ATM();
    	ATMState state = new hasAmount();
    	atm.setATMstate(state);
    	atm.insertCard();
    	atm.ejectCard();
    	atm.insertPin();
    	atm.requestAmount();
    	atm.outOfService();
    }
}
