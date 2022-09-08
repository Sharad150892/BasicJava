package constructor;

public class Constructor3 {
int a;
	
	public Constructor3(int a) {
		this.a=a;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Constructor3 obj = new Constructor3(90);
		
		int c= obj.a+100;
		System.out.println(c);
		
	}

}
