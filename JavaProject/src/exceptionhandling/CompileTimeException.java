package exceptionhandling;

public class CompileTimeException {
	
	public static void main(String[] args) throws InterruptedException, ArithmeticException{
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		for (int i=4; i<=10; i++) {
			Thread.sleep(2000);
			System.out.println(i);
		}
		System.out.println(11);
		Thread.sleep(2000);
		System.out.println(12);
		System.out.println(15/0);
		System.out.println(16);
	}

}
