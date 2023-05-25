package ua.hillel.hw16;

public class ShakerSort {

	public static void sort(int[] array) {

		int temp = 0;
		int leftSide = 0;
		int rightSide = array.length - 1;

		while (leftSide < rightSide) {

			for (int i = leftSide; i < rightSide; i++) {

				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			rightSide--;

			for (int i = rightSide; i > leftSide; i--) {
				if (array[i] < array[i - 1]) {
					temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
				}
			}
			leftSide++;
		}

	}
}
