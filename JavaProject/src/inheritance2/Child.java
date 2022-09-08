package inheritance2;

public class Child extends Parent {
	
	int a = 100;
	int b = 200;
	int c = 300;
	static int d = 400;
	static int e = 500;
	int f = 2000;

	public int M1() {
		
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
		System.out.println(f);
		return 1000;
	}
	

	public static void main(String[] args) {
		
		Child obj = new Child();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(Parent.d);
		System.out.println(Parent.e);
		obj.Multiplication();
		obj.Division();
		Addition();
		Subtraction();
		System.out.println(obj.M1());
		
		
	}
}
