package object;

public class ObjectCreation {
	int a = 56;
	int b = 44;
	
	public void M1() {
		int c = a+b;
		System.out.println(c);
	}
	public void M2() {
		int c =a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		ObjectCreation obj = new ObjectCreation();
		obj.M1();
		obj.M2();
	}
}
