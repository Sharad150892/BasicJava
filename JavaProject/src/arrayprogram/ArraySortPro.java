package arrayprogram;

import java.util.Scanner;

public class ArraySortPro {
	
	public static void main(String[] args) {
		
		int[] a = {2,5,5,5,6,6,8,9,9,9,5};
		System.out.println("Enter Number to Find first & last index :");
		Scanner Sc = new Scanner(System.in);
		
		int k = Sc.nextInt(); // array index which we have to find
		
		for (int i = 0; i<a.length; i++) {
			if (a[i]==k) {
				System.out.print(i+" ");
				break;
			}
		}
		for (int j = a.length-1; j>=0; j--) {
			if(a[j]==k) {
				System.out.print(j+" ");
				break;
			}
		}
		if (k<=a.length) 
			System.out.println(" is expected index value");
		else
			System.out.println(k+" Array index is out of range");
	}
}
