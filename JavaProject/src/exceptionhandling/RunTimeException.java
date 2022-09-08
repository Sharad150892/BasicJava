package exceptionhandling;

public class RunTimeException {
	// if we write try then with try we have to write catch or finally
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		for (int i=4; i<=10; i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		System.out.println(11);
		Thread.sleep(200);
		System.out.println(12);
		try {
			System.out.println(13/0);
		}
		
		catch(ArithmeticException ref1) {
			System.out.println("Exception Has Occured due to "+ref1.getMessage());
		}
		finally {
			System.out.println("Finally wil always Run");
		}
		
		System.out.println(14);
		System.out.println(15);
	}
}
