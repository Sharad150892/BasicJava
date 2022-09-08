package polymorphismvariable;

public class Child extends Parent {
	
	int a = 200;
	
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		System.out.println(obj.a);
		
	}

}
