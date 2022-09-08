package practice;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = number.nextInt();
		int a = 0;
		for(int i =2; i<num; i++) {
			if (num%i==0) {
				a=1;
				break;
			}
		}
		
		if (a==0)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is Not Prime Number");
		
		
	}
}
