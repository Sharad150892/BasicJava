package polymorphismvariable;

public class Parent {
	
	int a = 20;
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		Parent pp = new Parent();
		Parent pp1 = new Parent();
		
		pp.a=50;
		pp1.a=100;					// a variable values overload with different values
		
		System.out.println(pp.a);
		System.out.println(pp1.a);
		System.out.println(obj.a);
	}

}
