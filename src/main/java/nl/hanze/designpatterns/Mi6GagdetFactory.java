package nl.hanze.designpatterns;

public class Mi6GagdetFactory {
	
	public Gadget getGadget(String gadgetType){
		if(gadgetType.equals("lethal"))
			return new ExplosivePen();
		else
			return new XRayEyeGlasses();
	}
}
