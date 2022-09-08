package inheritance2;

public class Parent {
	
	
	int a = 10;
	int b = 20;
	int c = 30;
	static int d = 40;
	static int e = 50;
	int f = 200;

	public void Multiplication() {

		System.out.println(a*b*c);
	}
	public void Division() {
		System.out.println(b/a);

	}

	public static void Addition() {
		System.out.println(d+e);

	}

	public static void Subtraction() {
		Parent obj = new Parent();
		System.out.println(obj.c-obj.a);

	}

}
