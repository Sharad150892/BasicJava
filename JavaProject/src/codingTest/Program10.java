package codingTest;

public class Program10 {

	public static void main(String[] args) {
		int[] a = { 10, 13, 0, 5, 8 };

		int[] b = a;
		a[2] = 17;
		System.out.println(b[2]);
		b[4] = 90;
		System.out.println(b[4]);
	}

}
