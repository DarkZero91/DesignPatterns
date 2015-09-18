package nl.hanze.designpatterns.observers;

import java.util.ArrayList;
import java.util.List;

import nl.hanze.designpatterns.stocks.IBMStock;
import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.views.View;

public class IBMPrice extends Observer {
	public IBMPrice() {
		views = new ArrayList<View>();
	}
	
	public void update(Stock stock) {
		if(stock instanceof IBMStock) {			
			for(View view : views) {
				view.update(stock);
			}
		}
	}	
}
