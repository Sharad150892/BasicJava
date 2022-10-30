package encapsulation3;

public class Child extends Master {
	
	
	
	public static void main(String[] args) {
		Child obj = new Child();
		
		System.out.println(obj.getSal());
		obj.setSal(2000);
		System.out.println(obj.getSal());
		
		
	}
}
