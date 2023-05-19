package ua.hillel.hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
		
		
	  FileLoggerConfiguration configuration = FileLoggerConfigurationLoader.load(new File("FileLogConfig.txt"));
		

		FileLogger filelogger = new FileLogger(configuration);
		
		for (int i = 0; i < 1000; i++) {
		filelogger.info("info message" + i);
		filelogger.debug("debug message" + i);
		}
	}
}
