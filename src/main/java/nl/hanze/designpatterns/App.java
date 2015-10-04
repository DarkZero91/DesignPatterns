package nl.hanze.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ATMProxy proxyatm = new ATMProxy();
    	Client gson = new Client(proxyatm);
    	gson.whatsTheATMState();
    	gson.maxAmountOfCashCanIWithdraw();
    }
}
