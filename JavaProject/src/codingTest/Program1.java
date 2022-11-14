package codingTest;

public class Program1 {
	
	static int staticVariable;

	static {

		System.out.println("StaticBlock");

		staticVariable = 30;
	}

	static void staticMethod() {

		System.out.println("StaticMethod");

		System.out.println(staticVariable);

	}

}
