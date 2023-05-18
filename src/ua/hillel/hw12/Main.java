package ua.hillel.hw12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// task 1

		String[] wordsArray = { "apple","banana", "orange", "melon", "banana", "banana", "avocado", "apple", "carrot",
				"cherry", "garlic", "grape", "melon","mango", "leak", "kiwi", "mango","mango", "melon", "olive", "apple",
				"peanut", "apple", "pepper","mango","banana", "melon", "potato","banana","melon", "potato", "kiwi", "kiwi", "kiwi" };

		ArrayList<String> wordsList = toList(wordsArray); // Task2

		countOccurance(wordsList, "kiwi"); // task1

		// task 3*********************
		ArrayList<Integer> numbersList = new ArrayList<>();
		Random rm = new Random();
		for (int i = 0; i < 20; i++) {
			numbersList.add(rm.nextInt(20));
		}
		System.out.println(numbersList);
		System.out.println(findUnique(numbersList));
		// ***************************
		
		//task 4 
		
		calcOccurance(wordsList);
		
		System.out.println(findOccurance(wordsList));
		
	}

	public static <T> int countOccurance(ArrayList<T> list, T item) {

		int counter = 0;
		for (T s : list) {

			if (s.equals(item)) {
				counter++;
			}
		}
	//	System.out.println(item + ": " + counter + " times");
		return counter;

	}

	// Task2
	 static <T> ArrayList<T> toList(T[] array) {

		ArrayList<T> list = new ArrayList<T>(Arrays.asList(array));
		return list;
	}

	// Task3
	static <T> ArrayList<T> findUnique(ArrayList<T> nonSortedList) {

		ArrayList<T> sortedList = new ArrayList<>();
		for (T i : nonSortedList) {
			if (!sortedList.contains(i))
				sortedList.add(i);
		}

		return sortedList;
	  }
	

	//Task 4 
	static <T> void calcOccurance (ArrayList<T> nonSortedList) {
		
		for (T i : findUnique(nonSortedList)) {
			countOccurance(nonSortedList, i);
		}
		
	}
	
	
	static   Map<String,Integer> findOccurance(ArrayList<String> al) {
		
		Map<String,Integer> occurances = new HashMap<>();
		
		for(String str : findUnique(al)) {
			
			occurances.put(str, countOccurance(al,str));
		}
		
		
		return occurances;
		
	}
	
}
