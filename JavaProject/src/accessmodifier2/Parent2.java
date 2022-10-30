package accessmodifier2;

import accessmodifier1.Parent1;

public class Parent2 extends Parent1 {
	
	public void M1(boolean a) {
		
		System.out.println("Method of Parent 2");
		
	}

	public static void main(String[] args) {
		Parent2 obj = new Parent2();
		
//		System.out.println(obj.a);
		System.out.println(b);
		obj.M1();
		M1(34,false);
		obj.M1(true);
		
	}
		
}


