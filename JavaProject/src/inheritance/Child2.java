package inheritance;

public class Child2 extends Child1 {
	
	public void Mobile() {
		System.out.println("Mobile of Child 2");
	}
	
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.Bunglow();
		obj.Car();
		obj.Farm();
		obj.Laptop();
		obj.Mobile();
		
	}
}
