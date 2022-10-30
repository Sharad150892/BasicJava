package practice3;

import java.util.Arrays;

public class ArrayFindUniqueElement {

	public static void main(String[] args) {
		ArrayFindUniqueElement obj = new ArrayFindUniqueElement();
		int arr[] = { 9, 2, 3, 2, 6, 6 };
		obj.uniqueElement(arr);

	}

	public int uniqueElement(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			if (arr.length - i >= 2 && arr[i] != arr[i + 1]) {
				return arr[i];
			} else if (arr.length - i == 1) {
				return arr[i];
			} else {
				i++;
			}
		}

		return -1;
	}
}
