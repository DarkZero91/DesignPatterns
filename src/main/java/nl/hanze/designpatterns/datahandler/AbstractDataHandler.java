package nl.hanze.designpatterns.datahandler;

public abstract class AbstractDataHandler {
	protected String data;
	
	abstract public String readData();
	abstract public String processData();
	abstract public void writeData();
}
