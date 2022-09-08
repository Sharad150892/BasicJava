package inheritance;

public class Child1 extends Parent {
	
	public void Laptop() {
		System.out.println("Loptop of Child 1");
	}
	
	
	public static void main(String[] args) {
		Child1 obj = new Child1();
		obj.Bunglow();
		obj.Car();
		obj.Farm();
		obj.Laptop();
		
	}	
}
