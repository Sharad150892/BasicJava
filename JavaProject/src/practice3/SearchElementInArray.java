package practice3;

public class SearchElementInArray {

	public static void main(String[] args) {

		int a[] = { 10, 33, 21, 45, 67, 43, 55 };

		int search_ele = 55;

		boolean flag = false;

		for (int i = 0; i <= a.length - 1; i++) {
			if (search_ele == a[i]) {
				System.out.println("Element Found at : " + i);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Element not Found");
		}

	}

}
