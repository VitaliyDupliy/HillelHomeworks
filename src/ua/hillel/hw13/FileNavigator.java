package ua.hillel.hw13;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class FileNavigator {
	
	private final String path;
	Map<String, ArrayList<FileData>> fileMap = new HashMap<>();

	

	public FileNavigator(String path) {
		this.path = path;
	}

	public void add(FileData file) {

		if (fileMap.containsKey(file.getPath())) {

			fileMap.get(file.getPath()).add(file);
		} else {
			System.out.println("The key " + file.getPath() + " is not exist");
		}
	}

	public List<FileData> find(String path) {

		return fileMap.get(path);

	}

	public List<FileData> filterBySize (int size){
		
		List<FileData> filteredList = new ArrayList<>();
		for (FileData f : fileMap.get(path)) {
			if (f.getSize() <= size) {filteredList.add(f);}
		}
		return filteredList ;
		
	}
	
	public void remove (String path) {
		if (fileMap.containsKey(path)) {
			fileMap.clear();
		}
	}
	
	public  List<FileData> sortBySize () {
		
		(fileMap.get(path)).sort(new FileDataComparator());
		
		return fileMap.get(path);
		
	}
	
	
}
