package nl.hanze.designpatterns.observers;

import java.util.ArrayList;

import nl.hanze.designpatterns.stocks.MSStock;
import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.views.View;

public class MSPrice extends Observer {
	public MSPrice() {
		views = new ArrayList<View>();
	}
	
	public void update(Stock stock) {
		if(stock instanceof MSStock) {			
			for(View view : views) {
				view.update(stock);
			}
		}
	}	
}
