package nl.hanze.designpatterns.observers;

import java.util.List;

import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.views.View;

public abstract class Observer {
	protected List<View> views;
	
	public abstract void update(Stock stock);
	
	public void addView(View view) {
		views.add(view);
	}
}
