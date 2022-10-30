package practice3;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before Swapping " + a + " " + b);

//	int t=a;
//	a=b;
//	b=t;

//	a=a+b;
//	b=a-b;
//	a=a-b;

//	a=a*b;
//	b=a/b;
//	a=a/b;

		// XOR method bitwise
//	a=a^b;
//	b=a^b;
//	a=a^b;

		// Single Statement

		b = a + b - (a = b);

		System.out.println("After Swapping " + a + " " + b);

	}

}
