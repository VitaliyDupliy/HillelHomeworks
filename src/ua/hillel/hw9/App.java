package ua.hillel.hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileLoggerConfiguration configuration = FileLoggerConfigurationLoader.load(new File("FileLogConfig.txt"));

//		Logger filelogger = new FileLogger(configuration);

//		for (int i = 0; i < 2000; i++) {
//		filelogger.info("info message" + i);
//		filelogger.debug("debug message" + i);
//		}

		Logger consoleLogger = new ConsoleLogger(configuration);

		for (int i = 0; i < 20; i++) {
			consoleLogger.info("Info message");
		}

	}
}
