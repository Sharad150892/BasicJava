package method;

public class MethodCreation {
	
	public static void Sharad() {
		System.out.println("Hi There");
		MethodCreation obj = new MethodCreation();
		obj.Sahu();
		
	}
	public void Sahu() {
		System.out.println("Hello There");
	}
	
	public static void main(String[] args) {
		Sharad();
		int a=10;
		System.out.println("value of a "+--a);
		
	}


}

	