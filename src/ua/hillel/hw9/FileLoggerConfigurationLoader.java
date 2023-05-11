package ua.hillel.hw9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {

	public FileLoggerConfiguration loader(File configFile) throws FileNotFoundException {

		String file = null;
		String format = null;
		long maxFileSize = 0;
		LoggingLevel level = null;

		try (BufferedReader bReader = new BufferedReader(new FileReader(configFile))) {
			while ((bReader.readLine()) != null) {
				String[] partsOfLine = bReader.readLine().split(":");
				String value = partsOfLine[1].trim();
				switch (partsOfLine[0]) {
				case "FILE":  
					file = value;
					break;
				case "LEVEL":
					level = LoggingLevel.valueOf(value);
					break;
				case "MAX-SIZE":
					maxFileSize = Long.parseLong(value);
					break;
				case "FORMAT":
					format = value;
					break;
				}

			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(file == null || format == null || level == null) {
			throw new IllegalArgumentException("Invalid config");
		}

		return new FileLoggerConfiguration(new File(file), level, maxFileSize, format);
	}
}
