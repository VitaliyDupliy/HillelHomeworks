package ua.hillel.hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMaxSizeReachedException  extends RuntimeException{
	
	public FileMaxSizeReachedException(File logFile) throws FileNotFoundException, IOException {
		super("LogFile " + logFile + " max size is reached. Max size fo logfile: "
	+ FileLoggerConfigurationLoader.getSize());
	}
	
}

