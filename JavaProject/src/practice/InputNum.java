package practice;

import java.util.Scanner;

public class InputNum {
	
	
	public static void main(String[] args) {
		
		try (Scanner num = new Scanner(System.in)) {
			
			System.out.println("Enter Number :");
			
			int number = num.nextInt();
			
			System.out.println("Entered Number :"+number);
		}
		
		
	}

}
