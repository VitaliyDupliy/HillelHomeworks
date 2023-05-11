package ua.hillel.hw9;

import java.io.File;

public class FileMaxSizeReachedException extends RuntimeException {

	public FileMaxSizeReachedException(File logfile) {
		super("Size of log file " + logfile + "is reached max size");
		
	}
	

}
