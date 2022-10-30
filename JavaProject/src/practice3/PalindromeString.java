package practice3;

public class PalindromeString {
	
	
	public static void main(String[] args) {
		
		String str = "Saras";
		String temp = str;
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
	
		if(temp.equalsIgnoreCase(rev))
			System.out.println(rev+" is palindrome");
		else
			System.out.println(rev+" is not palindrome");
	}
	

}
