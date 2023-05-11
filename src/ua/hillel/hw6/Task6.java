package ua.hillel.hw6;

import java.util.Random;
import java.util.Scanner;

/*
Створити масив зі слів String[] words = {"apple", "orange", "lemon", "banana",
 "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", 
 "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", 
 "pepper", "pineapple", "pumpkin", "potato"};

При запуску програми комп'ютер загадує слово, запитує відповідь у користувача,

порівнює його із загаданим словом та повідомляє чи правильно відповів користувач. Якщо слово 
не вгадано, комп'ютер показує літери, які стоять на своїх місцях.

apple – загадане

apricot - відповідь гравця

ap############# (15 символів, щоб користувач не міг дізнатися довжину слова)

Для порівняння двох слів посимвольно, можна скористатися:

String str = "apple";

str.charAt(0); - метод, поверне char, який стоїть у слові str на першій позиції

Граємо до тих пір, поки гравець не відгадає слово

Використовуємо лише маленькі літери
*/

public class Task6 {

	public static void main(String[] args) {

		String[] words = { "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
				"garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
				"pear", "pepper", "pineapple", "pumpkin", "potato" };

		Random rand = new Random();

		int wd = rand.nextInt(words.length);
		String compWord = words[wd];

		String version = null;

		for (String s : words) {
			System.out.println(s);
		}

		System.out.println("Here is the list of words. What did i guess?");

		try (Scanner sc = new Scanner(System.in)) {
			while (!(compWord.equalsIgnoreCase(version))) {

				version = sc.next();

				if (compWord.equalsIgnoreCase(version)) {
					System.out.println("Congrats, You win! ");
				} else {

					int lenghtOfWord;

					if (compWord.length() <= version.length()) {
						lenghtOfWord = compWord.length();
					} else {
						lenghtOfWord = version.length();
					}

					for (int i = 0; i < lenghtOfWord; i++) {
						if (compWord.charAt(i) == version.charAt(i)) {
							System.out.print(compWord.charAt(i));
						} else {
							System.out.print("#");

						}

					}

					for (int i = 0; i < 15 - lenghtOfWord; i++) {
						System.out.print("#");

					}
					System.out.println();
				}
			}
		}
	}

}
