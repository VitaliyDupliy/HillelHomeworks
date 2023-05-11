package ua.hillel.hw9;

import java.io.File;

public class FileLoggerConfiguration {

	
    private final File file;
    private final LoggingLevel level;
    private final long maxFileSize;
    private final String format; // [TIME] [LEVEL] [THREAD] - [MESSAGE]
	
	public FileLoggerConfiguration(File file, LoggingLevel level, long maxFileSize, String format) {
		
		this.file = file;
		this.level = level;
		this.maxFileSize = maxFileSize;
		this.format = format;
	}

	public File getFile() {
		return file;
	}

	public LoggingLevel getLevel() {
		return level;
	}

	public long getMaxFileSize() {
		return maxFileSize;
	}

	public String getFormat() {
		return format;
	}
	
	
	
	 
	
	
	
}
