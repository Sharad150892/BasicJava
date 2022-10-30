package accessmodifier1;

public class Child1 {
	
	public void M1(int a) {
		System.out.println("Method of Child 1");
		final int b =12;
	}
	
	public static void main(String[] args) {
		final int x = 10;
		Parent1 obj = new Parent1();
		
		System.out.println(obj.a);
		System.out.println(Parent1.b);
		obj.M1();
		
		Parent1.M1(13,true);
		
	}

}
