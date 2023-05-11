package ua.hillel.hw5;

public class HomeWorkApp {

	public static void main(String[] args) {

		printThreeWords();
		checkSumSign();
		printColor();
		compareNumber();
		System.out.println(checkRange(5, 25));
		posOrNeg(-2);
		System.out.println(checkNegative(-5));
		iteration("iteration", 3);
		System.out.println(intercalaryYear(1900));
	}

	static void printThreeWords() {

		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}

	static void checkSumSign() {

		int a = -23;
		int b = 45;
		if ((a + b) >= 0) {
			System.out.println("The sum is positive");
		} else {
			System.out.println("The sum is negative");
		}

	}

	static void printColor() {
		int a = -101;
		if (a <= 0)
			System.out.println("RED");
		if (a > 0 & a <= 100)
			System.out.println("YELLOW");
		if (a > 100)
			System.out.println("GREEN");

	}

	static void compareNumber() {
		int a = 120;
		int b = 120;
		if (a >= b) {
			System.out.println("a >= b");
		} else
			System.out.println("a < b");
	}

	static boolean checkRange(int a, int b) {
		return ((a + b) > 10 && (a + b) <= 20);
	}

	static void posOrNeg(int a) {
		if (a >= 0) {
			System.out.println("Number is positive");
		} else
			System.out.println("Number is negative");
	}

	static boolean checkNegative(int a) {
		return (a < 0);
	}

	static void iteration(String text, int iter) {

		for (int i = 0; i < iter; i++) {
			System.out.println(text);
		}
	}

	static boolean intercalaryYear(int year) {
		boolean answer;
		if ((year % 4) == 0 & year % 100 != 0) {
			answer = true;
		} else if (year % 100 == 0 & year % 400 == 0) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}
}
