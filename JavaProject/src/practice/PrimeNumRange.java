package practice;

import java.util.Scanner;

public class PrimeNumRange {
	
	
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number :");
		int x = number.nextInt();
		int y = number.nextInt();
		
		for (;x<y; x++) {
			int a = 0;
		for(int i =2; i<x; i++) {
			if (x%i==0) {
				a=1;
				break;
			}
		}
		if (a==0 && x!=1 && x!=0)
			System.out.print(x+" ");
		}
		
	}
}



