package ua.hillel.hw9;

import java.io.BufferedWriter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements Logger{
	
	private final FileLoggerConfiguration configuration;

	private static final  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Log: 'dd.LL.yyyy; 'time:'HH-mm-ss");
	
	

	public ConsoleLogger(FileLoggerConfiguration configuration) {
		this.configuration = configuration;
	}

	public void info(String message) {
		log( message);
	}

	public void debug(String message) {
		if (configuration.getLevel() != LoggingLevel.DEBUG) {
			return;
		}
		log(message);
		info(message);
		
	}

	public void log(String message) {

		String time = LocalDateTime.now().format(formatter);
		

		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String messageForLog = configuration.getFormat();

			messageForLog = messageForLog.replace("[TIME]", time);
			messageForLog = messageForLog.replace("[LEVEL]", configuration.getLevel().name());
			messageForLog = messageForLog.replace("[MESSAGE]", message);

			writer.write(messageForLog);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
