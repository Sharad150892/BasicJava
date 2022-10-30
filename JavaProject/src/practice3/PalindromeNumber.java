package practice3;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int temp = num;
		int rev=0;
		
		for(;num!=0; num/=10) {
			rev = rev*10 + num%10;

		}
		if(temp==rev) {
			System.out.println(rev+ " is Palindrome");
		}
		else {
			System.out.println(rev+ " is not Palindrome");
		}
		
	}

}
