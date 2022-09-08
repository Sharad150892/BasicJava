package practice;

public class PalindromeNum {
	
	public static void main(String[] args) {
		
		int num = 123, reverse = 0, temp;
		temp=num;

		for(;num !=0; num/=10) {

		int digit = num%10;
		reverse = reverse*10+digit;		

		}
		
		if (temp==reverse)		
			System.out.println("Palindrome Number = "+reverse);
		else
			System.out.println("Not Palindrome Number = "+reverse);
	}
}
