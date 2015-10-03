package nl.hanze.designpatterns;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

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
	public void testReadData() {
		String data = handler.readData();
		assertTrue("example.org was not read properly: " + data, data.contains(exampleHtml));
	}

	@Test
	public void testProcessData() {
		handler.readData();
		String data = handler.processData();
		
		// We're only interested in the content of the title tag.
		assertEquals("Example Domain", data);
	}
}
