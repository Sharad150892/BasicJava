package variable;

public class LocalVariable {
	
	int a = 60;
	static int b = 80;
	
	public void M1() {
	 int a = 20;
	 int b = 30;
	 System.out.println(a);
	 System.out.println(b);
	 
	 System.out.println(this.a);
	 System.out.println(LocalVariable.b);
		
	}
	
	public static void main(String[] args) {
		LocalVariable obj = new LocalVariable();
		obj.M1();
	}


}
