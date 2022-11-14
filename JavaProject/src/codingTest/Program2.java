package codingTest;

public class Program2 {
	
	static{

		System.out.println("Program1");
	}

	public static void main(String[] args)

	{

		// Static Members directly accessed with Class Name

		Program1.staticVariable = 50;

		Program1.staticMethod();
	}

}
