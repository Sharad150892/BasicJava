package practice3;

import java.util.Arrays;

public class TwoArraysAreEqualOrNot {
	
public static void main(String[] args) {
		
		int arr1[] = {2,3,5,7};
		int arr2[] = {3,2,5,9};	
		if(areEqual(arr1,arr2)) 
			System.out.println("Two arrays are Equal");
		else
			System.out.println("Two arrays are Not Equal");
		
		
	}
	
	public static boolean areEqual(int[] arr1, int[] arr2) {
		
		int m = arr1.length;
		int n = arr2.length;
		
		if(m!=n) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0; i<m; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	

}
