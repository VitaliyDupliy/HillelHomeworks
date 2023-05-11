package ua.hillel.hw6;

public class StringManipulation {

	public static void main(String[] args) {

		findSymbolOccurance("banana", 'a');

		System.out.println(findWordPosition("concatination", "cat"));
		
		stringReverse("representation");
		System.out.println(isPalindrome("madam"));

	}

	static int findSymbolOccurance(String str, char c) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("Simbol \'" + c + "\' occurs " + count + " times in  this string");
		return count;

	}
	

	static int findWordPosition(String source, String target) {

		return source.indexOf(target);
	}
	
	
	static StringBuilder stringReverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		return sb.reverse();
	}

	static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		return sb.toString().equalsIgnoreCase(sb.reverse().toString());
	}
	
	
}
		
				
			