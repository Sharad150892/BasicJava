package practice3;

public class StringPringFirstTwoElement {
	
	public static void main(String[] args) {

		String str[] = { "test", "dev", "devops", "test", "hr", "manage" };

		for (int i = 0; i <= str.length - 1; i++) {

			for (int j = i + 1; j <= str.length - 1; j++) {
				
					System.out.println(str[i]+", "+str[j]);
					break;
			}
			break;
		}
	}

}
