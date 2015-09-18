package nl.hanze.designpatterns.subjects;

import nl.hanze.designpatterns.observers.Observer;
import nl.hanze.designpatterns.stocks.Stock;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(Stock stock);
}
