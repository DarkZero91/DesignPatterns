package nl.hanze.designpatterns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

import nl.hanze.designpatterns.datahandler.AbstractDataHandler;
import nl.hanze.designpatterns.datahandler.WebDataHandler;

public class WebDataHandlerTest {
	AbstractDataHandler handler;
	String exampleHtml =
			"<h1>Example Domain</h1>    <p>This domain is established to be used "
			+ "for illustrative examples in documents. You may use this    "
			+ "domain in examples without prior coordination or asking for "
			+ "permission.</p>    <p><a href=\"http://www.iana.org/domains/example\">"
			+ "More information...</a></p>";
	
	@Before
	public void setup() {
		handler = new WebDataHandler("http://www.example.org");
	}
	
	@Test
	public void test() {
		String data = handler.readData();
		assertTrue("example.org was not read properly: " + data, data.contains(exampleHtml));
	}

}
