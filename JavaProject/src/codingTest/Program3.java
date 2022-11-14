package codingTest;

public class Program3 {

	int nonStaticVariable;

	static int staticVariable;

	static void staticMethod()

	{

		System.out.println(staticVariable);

	}

	void nonStaticMethod()

	{

		System.out.println(staticVariable);

		System.out.println(nonStaticVariable);

	}
}
