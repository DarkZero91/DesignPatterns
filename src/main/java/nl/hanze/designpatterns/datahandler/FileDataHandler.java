package nl.hanze.designpatterns.datahandler;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataHandler extends AbstractDataHandler {
	private File file; // Source text file.
	
	public FileDataHandler(File file) {
		this.file = file;
	}
	
	@Override
	public String readData() {
		FileReader reader = null;
		
		try {
			reader = new FileReader(file);
			char[] buffer = new char[1024];
			StringBuilder builder = new StringBuilder();
			int bytesRead = 0;
			
			while((bytesRead = reader.read(buffer)) != -1) {
				builder.append(buffer, 0, bytesRead);
			}
			
			reader.close();
			data = builder.toString();
			return data;
		} catch (Exception e) {
			if(reader != null) {
				try { reader.close(); }
				catch (IOException e1) {} 
			}
			return null;
		}
	}

	@Override
	public String processData() {
		data = data.substring(0, 26);
		return data;
	}

	@Override
	public void writeData() {
		try {
			File file = new File("output.txt");
			if(!file.createNewFile()) { return; }
			
			FileWriter writer = new FileWriter(file);
			writer.write(data);
			writer.flush();
			writer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
