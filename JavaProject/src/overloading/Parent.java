package overloading;

public class Parent {
	public void M1() {
		
		int num =5;
		
		for (int i=1; i<=10; i++) {
			
			System.out.printf("%d * %d = %d \n",num,i,num*i);
		}
		System.out.println(" ");
	}
	
	public void M1(int a) {
		
		int num = 100; int sum = 0;
		for (int i=0; i<=num; i++) {
			
			sum +=i;
		}
		System.out.println("Sum = "+sum+"\n");
	}
	
	public static void M1(boolean a) {
		char c;
		
		for(c='A'; c<='Z'; c++ ) {
			System.out.print(c+" ");
		}
	}
}
