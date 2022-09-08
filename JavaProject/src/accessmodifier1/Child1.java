package accessmodifier1;

public class Child1 extends Parent1 {
	
	public void M1(int a) {
		System.out.println("Method of Child 1");
	}
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		System.out.println(obj.a);
		System.out.println(Parent1.b);
		obj.M1();
		
		Parent1.M1(13,true);
		
	}

}
