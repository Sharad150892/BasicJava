package practice;

import java.util.Scanner;

public class PalindromebyInput {
	
		public static void main(String[] args) {
			
			Scanner number = new Scanner(System.in);
			System.out.println("Enter Number to Check :");
			int num = number.nextInt();		
			int reverse=0, temp;
			temp=num;
			for(;num!=0; num/=10) {
		
				reverse=reverse*10 + num%10;
			}
			if (temp==reverse)
				System.out.println("Palindrome Number = "+reverse);
			else
				System.out.println("Not Palindrome Number = "+reverse);
			
		}
}
