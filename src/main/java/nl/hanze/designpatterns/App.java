package nl.hanze.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ElectronicDevice newDevice = StereoRemote.getDevice();
        
        //TurnStereoOn onCommand = new TurnStereoOn(newDevice);
        TurnStereoOnWithCDVolume11 onCommand = new TurnStereoOnWithCDVolume11(newDevice);
        
        DeviceButton onPressed = new DeviceButton(onCommand);
        
        onPressed.press();
    }
}
