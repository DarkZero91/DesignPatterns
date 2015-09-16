package nl.hanze.designpatterns;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	private ArrayList<Observer> observers;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observers);		
	}

	public void notifyObservers(String name, double price) {
		for(Observer observer : observers) {
			observer.update(name, price);
		}
	}
	
}
