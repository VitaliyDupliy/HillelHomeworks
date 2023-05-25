package ua.hillel.hw16;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {

		// task1 QuickSort

		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);

		}
		System.out.println(Arrays.toString(array));

		QuickSort.quickSort(array, 0, array.length - 1);

		System.out.println(Arrays.toString(array));

		// task 2 ShakerSort
		System.out.println("*************************************");

		int[] array2 = new int[30];
		Random rd = new Random();

		for (int i = 0; i < array2.length; i++) {
			array2[i] = rd.nextInt(100);

		}
		System.out.println(Arrays.toString(array2));

		ShakerSort.sort(array2);

		System.out.println(Arrays.toString(array2));

	}

}
