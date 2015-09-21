package nl.hanze.designpatterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mi6GagdetFactory mi6GadgetFactory = new Mi6GagdetFactory();
        
        Gadget g1 = mi6GadgetFactory.getGadget("lethal");
        System.out.println(g1.getName() + " dialog: \n" + g1.qComment());
        
        Gadget g2 = mi6GadgetFactory.getGadget("non lethal");
        System.out.println(g2.getName() + " dialog: \n" + g2.qComment());
    }
}
