package codingTest;

public class Program4 {

	public static void main(String[] args)

	{

		Program3.staticVariable = 10;

		Program3.staticMethod();

		Program3 a1 = new Program3();

		System.out.println(a1.nonStaticVariable);

		System.out.println(a1.staticVariable);

	}

}
