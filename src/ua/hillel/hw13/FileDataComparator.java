package ua.hillel.hw13;

import java.util.Comparator;

public class FileDataComparator implements Comparator<FileData>{

	@Override
	public int compare(FileData o1, FileData o2) {
		// TODO Auto-generated method stub
		return o1.getSize() - o2.getSize();
	}

}
