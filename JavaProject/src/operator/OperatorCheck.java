package operator;

public class OperatorCheck {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		
		b=++a;
		c=--d;
		d=a++;
		a=c--;
		
			System.out.println("B= "+b);
			System.out.println("C= "+c);
			System.out.println("D= "+d);
			System.out.println("A= "+a);
		
	}
}
