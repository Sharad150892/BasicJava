package practice3;

public class RemoveCharacterFromString {

	public static void main(String[] args) {

		String str = "SharadKumar";
		char c = 'K';

		removeChar(str, c);
	}

	public static void removeChar(String str, char c) {

		String finalstr = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != c) {
				finalstr = finalstr + str.charAt(i);
			}
		}
		System.out.println(finalstr);

	}

}
