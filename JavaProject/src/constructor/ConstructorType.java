package constructor;

public class ConstructorType {
	
	public ConstructorType() {
		
		System.out.println("Constructor 1");
		
	}
	
	public ConstructorType(int a) {
		this();
		System.out.println("Constructor 2");
	}
	public ConstructorType(String Name) {
		this(6);
		System.out.println("Constructor 3");
	}
	public static void main(String[] args) {
		new ConstructorType("sharad");
		
	}
}
