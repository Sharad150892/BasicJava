package variable;

public class GlobalVariable {
	
	int a = 57;
	static int b = 65;
	
	public static void main(String[] args) {
		GlobalVariable obj = new GlobalVariable();
		
		System.out.println(obj.a);
		
		System.out.println(b);
	}

}
