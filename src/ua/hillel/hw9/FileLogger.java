package ua.hillel.hw9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {
	
	private  final FileLoggerConfiguration configuration;
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH~mm dd MM yy");
	
	
	
	public FileLogger(FileLoggerConfiguration configuration) {
		this.configuration = configuration;
	}

	public void info (String message) throws IOException  {
		if(configuration.getLevel() == LoggingLevel.INFO) {
			File logFile = configuration.getFile();
			
			if(logFile.length() >= configuration.getMaxFileSize()) {
				throw new FileMaxSizeReachedException(logFile);
			}
			
			try (FileWriter writer = new FileWriter(logFile)) {
				
				String messageForLogFile = configuration.getFormat();
				
				messageForLogFile = messageForLogFile.replace("[TIME]", LocalDateTime.now().format(dtf));
				messageForLogFile = messageForLogFile.replace("[LEVEL]", configuration.getLevel().name());
				messageForLogFile = messageForLogFile.replace("[THREAD]", Thread.currentThread().getName());
				messageForLogFile = messageForLogFile.replace("[MESSAGE]", message);
				
				
				writer.write(messageForLogFile);
			}
		}
		
	}
	
	public void debug (String message) {
		
	}
	

}
