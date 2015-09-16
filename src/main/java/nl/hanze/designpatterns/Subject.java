package nl.hanze.designpatterns;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String name, double value);
}
