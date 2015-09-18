package nl.hanze.designpatterns;


import java.util.Random;

import junit.framework.TestCase;
import nl.hanze.designpatterns.async.GetTheStock;
import nl.hanze.designpatterns.stocks.IBMStock;
import nl.hanze.designpatterns.stocks.Stock;

import org.junit.Test;

public class GetTheStockTest extends TestCase {
	@Test
	public void testStockGeneration() {
		Random rand = new Random(0);
		
		GetTheStock generator = new GetTheStock();
		generator.setRandomizer(rand);
		
		Stock stock = new IBMStock();
		stock.setPrice(10);
		
		generator.updateStock(stock);
		
		assertEquals(10.01, stock.getPrice());
	}
}
