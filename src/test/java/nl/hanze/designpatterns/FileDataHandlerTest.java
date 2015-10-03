package nl.hanze.designpatterns;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import nl.hanze.designpatterns.datahandler.AbstractDataHandler;
import nl.hanze.designpatterns.datahandler.FileDataHandler;

public class FileDataHandlerTest {
	File file;
	AbstractDataHandler handler;
	String testData = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit."
			+ " Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque"
			+ " penatibus et magnis dis parturient montes, nascetur ridiculus mus."
			+ " Donec quam felis, ultricies nec, pellentesque eu, pretium quis,"
			+ " sem. Nulla consequat massa quis enim. Donec pede justo, fringilla"
			+ " vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut,"
			+ " imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede"
			+ " mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum"
			+ " semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula,"
			+ " porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem"
			+ " ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus"
			+ " viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean"
			+ " imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper"
			+ " ultricies nisi. Nam eget dui."; 
	
	@Before
	public void setup() {
		file = new File("resource.txt");
		try {
			file.createNewFile();
			pupulateResourceFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		handler = new FileDataHandler(file);
	}
	
	@After
	public void teardown() {
		file.delete();
		
		// Destroy the output file.
		file = new File("output.txt");
		if(file.exists()) { file.delete(); }
	}
	
	@Test
	public void testReadData() {
		String data = handler.readData();
		assertEquals(testData, data);
	}
	
	@Test
	public void testProcessData() {
		handler.readData();
		String data = handler.processData();
		
		// We're only interested in the first part of the Lorem Ipsum dummy string.
		assertEquals("Lorem ipsum dolor sit amet", data);
	}
	

	@Test
	public void testWriteData() {
		handler.readData();
		handler.processData();
		handler.writeData();
		
		File file = new File("output.txt");
		assertTrue("The output file does not exist.", file.exists());
		assertEquals("The file content is wrong.", 26, file.length());
	}
	
	private void pupulateResourceFile(File file) throws IOException {
		FileWriter writer = new FileWriter(file);
		writer.write(testData);
		writer.flush();
		writer.close();
	}
}
