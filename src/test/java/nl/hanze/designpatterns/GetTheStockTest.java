package nl.hanze.designpatterns;


import java.util.Random;

import junit.framework.TestCase;

import org.junit.Test;

public class GetTheStockTest extends TestCase {
	@Test
	public void testStockGeneration() {
		Random rand = new Random(0);
		
		GetTheStock generator = new GetTheStock();
		generator.setRandomizer(rand);
		generator.setPrice(10);
		double price = generator.getPrice();
		
		assertEquals(10.01, price);
	}
}
