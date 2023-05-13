package ua.hillel.hw11;

import java.util.ArrayList;



public class MainApp {

	public static void main(String[] args) {
		String[] str = {"A", "b", "C", "f"};
		Integer[] itr = {1,2,45,88};
		Double[] d = {1.0,2.0,45., 88.};
						
		toList(str);
		toList(itr);
		toList(d);
		System.out.println();
//******************************************************
		System.out.println("Task 2 ");
		System.out.println();
		Orange orange = new Orange();
		Apple apple = new Apple();
		Box<Orange> orangeBox = new Box<>();
		Box<Orange> orangeBox1 = new Box<>();
		Box<Apple> appleBox = new Box<>();
		
		
		
		
		orangeBox.addOneFruit(orange);
		
		orangeBox.addSomeFruit(3, orange);
		orangeBox1.addSomeFruit(5, orange);
		appleBox.addSomeFruit(6, apple);
		
		
		System.out.println(orangeBox);
		System.out.println(appleBox);
		
		System.out.println(orangeBox.getWeight());
		System.out.println(appleBox.getWeight());
		
		System.out.println(orangeBox.compareWeigthOfBoxes(orangeBox1));
		System.out.println(orangeBox.compareWeigthOfBoxes(appleBox));
		
						
		orangeBox.merge(orangeBox1);
		
	}

	public static <T> ArrayList <T> toList(T array[]) {
		ArrayList<T>  list = new ArrayList<T>(array.length);
		
		for(T i : array) {
			list.add(i);
		}
		System.out.println(list);

		return   list;
	}

}
