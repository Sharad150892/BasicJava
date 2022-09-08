package practice;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String p = "Saras",  reverse = "";
		
		for (int i=p.length()-1; i>=0; --i) {
			reverse = reverse + p.charAt(i);
			
		}
		
		if (p.toLowerCase().equals(reverse.toLowerCase()))  {
			
			System.out.println(p+" is palindrome String");
		}
		else {
			
			System.out.println(p+" is not palindrom String"); 
		}
	}
}
