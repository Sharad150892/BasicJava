package practice2;

import java.util.Arrays;

public class ArrayComparision {
	
	public static void main(String[] args) {
		int[] a = {12,34,22,34,445,56};
		int[] b = {12,34,56,32,45,667};
		int[] c = {12,34,22,34,445,56};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
	}

}
