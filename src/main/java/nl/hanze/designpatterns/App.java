package nl.hanze.designpatterns;

import java.io.File;

import nl.hanze.designpatterns.datahandler.AbstractDataHandler;
import nl.hanze.designpatterns.datahandler.FileDataHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractDataHandler handler = new FileDataHandler(new File("resource.txt"));
        handler.readData();
        handler.processData();
        handler.writeData();
    }
}
