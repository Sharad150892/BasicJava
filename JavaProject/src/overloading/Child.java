package overloading;

public class Child extends Parent{
	
	
	public void M1(int a, String Name) {
		
		int num = 10;
		long factorial = 1;
		
		for(int i=1; i<=num; i++) {
			
			factorial*=i;
		}
		System.out.printf("Factorial of %d = %d \n\n", num, factorial);
	}
	
	public static void main(String[] args) {
		Child obj = new Child();	
		System.out.println("Method of Child Factorial");
		obj.M1(12, "Sharad");
		System.out.println("Method of Parent Table");
		obj.M1();
		System.out.println("Method of Parent Sum");
		obj.M1();
		System.out.println("Static Method of Parent Alphabet");
		M1(false);
	}

}
