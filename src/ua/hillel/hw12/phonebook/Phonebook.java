package ua.hillel.hw12.phonebook;

import java.util.ArrayList;
import java.util.List;

import ua.hillel.hw12.Record;

public class Phonebook {

	private List<Record> book = new ArrayList<>();

	public void add(Record rec) {
		book.add(rec);

	}

	public Record find(String name) {
		for (Record rec : book) {
			if (rec.getName().equalsIgnoreCase(name)) {
				return rec;
			}
		}
		return null;

	}

	public ArrayList<Record> findAll(String name) {
		ArrayList<Record> abonent = new ArrayList<>();

		for (Record rec : book) {
			if (rec.getName().equalsIgnoreCase(name)) {
				abonent.add(rec);
			}
			if (abonent.size() == 0) {
				return null;
			}
		}
		return abonent;

	}
}
