package ua.hillel.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//(File file, LoggingLevel level, long maxFileSize, String format)
// [TIME] [LEVEL] - [MESSAGE]

public class FileLogger {

	private final FileLoggerConfiguration configuration = null;

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Log_'dd.LL.yyyy_'time'HH-mm-ss");

	void info(String message) {

	}

	void debug(String message) {

	}

	public void log(String message) {

		String time = LocalDateTime.now().format(formatter);
		File logFile = configuration.getFile();

		if (logFile.length() >= configuration.getMaxFileSize()) {

			File oldLogfile = new File(time);
			logFile.renameTo(oldLogfile);
			try {
				logFile.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {

			String messageForLogfile = configuration.getFormat();

			messageForLogfile = messageForLogfile.replace("TIME", time);
			messageForLogfile = messageForLogfile.replace("LEVEL", configuration.getLevel().name());
			messageForLogfile = messageForLogfile.replace("MESSAGE", message);

			writer.append(messageForLogfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
