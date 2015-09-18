package nl.hanze.designpatterns.observers;

import java.util.ArrayList;

import nl.hanze.designpatterns.stocks.AppleStock;
import nl.hanze.designpatterns.stocks.Stock;
import nl.hanze.designpatterns.views.View;

public class ApplePrice extends Observer {
	public ApplePrice() {
		views = new ArrayList<View>();
	}
	
	@Override
	public void update(Stock stock) {
		if(stock instanceof AppleStock) {			
			for(View view : views) {
				view.update(stock);
			}
		}
	}
}
