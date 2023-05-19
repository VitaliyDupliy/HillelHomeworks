package ua.hillel.hw9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileLoggerConfigurationLoader {

	/*
	 * FILE: path to the file 
	 * LEVEL: logging level 
	 * MAX-SIZE: size 
	 * FORMAT: [TIME] [LEVEL] - [MESSAGE]
	 * 
	 */
	
	private static long size = 0;
	
	public static FileLoggerConfiguration load (File configFile) throws FileNotFoundException, IOException {
		
	String file = null;
	LoggingLevel level = null;
	String format = null;


		
		try (BufferedReader reader =  new BufferedReader(new FileReader(configFile))) {
			
			String line;
			while((line = reader.readLine()) != null) { 
				
				String [] lineParts = line.split(":");
				String volume = lineParts[1].trim();
				
				switch (lineParts[0]) {
				case "FILE":
					file = volume;

					break;
				case "LEVEL":
					level = LoggingLevel.valueOf(volume);

					break;
				case "MAX-SIZE":
					size = Long.parseLong(volume);

					break;
				case "FORMAT":
					format = volume;

					break;
				}
				
			}
		}
		if(file == null || level == null || size <= 0 || format == null) {
			throw new IllegalArgumentException();
		}
		return new FileLoggerConfiguration(new File(file), level, size, format);
	}
	

	public static long getSize() {
		return size;
	}
}

