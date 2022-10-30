package practice3;

import java.util.Arrays;

public class SearchElementInArrayBinary {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		boolean flag = false;

		int key = 7;
		int l = 0;
		int h = a.length - 1;

		while (l <= h) {
			int m = (l + h) / 2;

			if (a[m] == key) {
				System.out.println("Element Found at index :"+m);
				flag = true;
				break;
			}
			if (a[m] < key) {
				l = m + 1;
			}
			if (a[m] > key) {
				h = m - 1;
			}

		}
		if (flag == false) {
			System.out.println("Element not Found");
		}
		
		// by using binary search method
		System.out.println("Element Found at index : "+Arrays.binarySearch(a, key));

	}

}
