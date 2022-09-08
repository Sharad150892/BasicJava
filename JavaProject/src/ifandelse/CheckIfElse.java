package ifandelse;

public class CheckIfElse {

	public static void main(String[] args) {
		int a=100;
		int b=150;
		int c = 200;
		
		if  (a==b) {
			System.out.println("if is running");
		}
		else if (a>b){
			System.out.println("else is running");
		}
		else if (a==b) {
			System.out.println("if else 2 is running");
		}
		else if (a>b) {
			System.out.println("if else 3 is running");
		}
		else if (c>b) {
			System.out.println("if else 4 is running");
		}
	}	
	
	
}
