package ua.hillel.hw13;

public class FileData implements Comparable<FileData> {

	private String name;
	private String path;
	private int size;
	
	
	public FileData(String name, String path, int size) {
		this.name = name;
		this.path = path;
		this.size = size;
	}
	
	
	public String getName() {
		return name;
	}


	public String getPath() {
		return path;
	}


	public int getSize() {
		return size;
	}


	@Override
	public int compareTo(FileData o) {
		
		return this.size - o.size;
	}

	
			
	
}
