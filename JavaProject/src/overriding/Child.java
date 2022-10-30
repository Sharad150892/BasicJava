package overriding;

public class Child extends Parent{
	
	int a = 40;
	static int b = 50;
	
	public void M1() {
		
		System.out.println("Method of Child");
	}
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.M1();
		
		
//		System.out.println(obj.a); // overriding is not possible for variable a
//		System.out.println(Parent.b);
	}

}
