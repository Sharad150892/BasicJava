package practice3;

public class ReverseEachWordInString {

	public static void main(String[] args) {

		String str = "Welcome To Java in my Selenium";
		String[] word = str.split("\\s");

		String reverseString = "";

		for (String w : word) {

			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}

}
