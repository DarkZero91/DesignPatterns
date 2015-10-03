package nl.hanze.designpatterns;

public abstract class AbstractDataHandler {
	abstract public String readData();
	abstract public String processData();
	abstract public void writeData();
}
