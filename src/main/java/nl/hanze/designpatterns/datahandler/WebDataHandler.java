package nl.hanze.designpatterns.datahandler;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		Pattern pattern = Pattern.compile("<title>(.*)</title>");
		Matcher matcher = pattern.matcher(data);
		
		matcher.find();
		data = matcher.group(1);
		
		return data;
	}

	@Override
	public void writeData() {
		System.out.println("I read example.org!");
	}

}
