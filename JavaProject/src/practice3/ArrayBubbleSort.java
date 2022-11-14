package practice3;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {

		int a[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		
		System.out.println("Arrays Before Sorting : "+Arrays.toString(a));
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=i+1; j<=a.length-1; j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array After Sorting :"+Arrays.toString(a));
	}

}
