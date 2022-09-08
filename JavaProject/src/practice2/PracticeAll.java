package practice2;

public class PracticeAll {
	
	int a = 20;
	int b = 30;
	int c = 40;
	int d = 10;

	public void substraction() {
	int a = this.a+b;
	int b = this.b+c;
	System.out.println(a);
	System.out.println(b);
	System.out.println(this.a);

	}
	public static void main(String[] args) {
	PracticeAll obj = new PracticeAll();
	obj.substraction();
	}
}
