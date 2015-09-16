package nl.hanze.designpatterns;

import java.util.ArrayList;
import java.util.List;

import nl.hanze.designpatterns.stocks.Stock;

public class StockGrabber implements Subject {
	private List<Observer> observers;
	
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observers);		
	}

	public void notifyObservers(Stock stock) {
		for(Observer observer : observers) {
			observer.update(stock);
		}
	}
	
}
