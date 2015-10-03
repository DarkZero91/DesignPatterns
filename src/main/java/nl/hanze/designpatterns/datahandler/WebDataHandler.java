package nl.hanze.designpatterns.datahandler;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class WebDataHandler extends AbstractDataHandler {
	private String url;
	
	public WebDataHandler(String url) {
		this.url = url;
	}
	
	@Override
	public String readData() {
		Scanner scanner = null;
		data = "";
		try {
			URL url = new URL(this.url);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			scanner = new Scanner(con.getInputStream());
			while(scanner.hasNextLine()) {
				data += scanner.nextLine();
			}
		}
		catch(Exception e) {
			data = null;
		}
		finally {
			if(scanner != null) { scanner.close(); }
		}
		return data;
	}

	@Override
	public String processData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeData() {
		// TODO Auto-generated method stub
		
	}

}
