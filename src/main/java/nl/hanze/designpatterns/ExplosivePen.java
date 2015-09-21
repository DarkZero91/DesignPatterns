package nl.hanze.designpatterns;

public class ExplosivePen extends Gadget {
	@Override
	public String qComment() {
		return "Bond: The pen is mightier then the sword? \n Q: Thanks to me they were right!";
	}

	@Override
	public String getName() {
		return "Explosive Pen";
	}

}
