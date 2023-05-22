package ua.hillel.hw13;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class FileNavigator {

	Map <String, ArrayList<String>> fileList = new HashMap<>();

	public FileNavigator(Map<String, ArrayList<String>> fileList) {
		this.fileList = fileList;
	}
	
	public void add(FileData file) {
		fileList.put(file.getPath(), new ArrayList<String>());
	}
	
}
