package practice3;

public class EvenOddFromArray {
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Even Number");
		
		/*for(int i=0; i<=a.length-1;i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+", ");
		}*/
		
		for(int value:a) {
			if(value%2==0)
				System.out.print(value+", ");
		}
		
		System.out.println("\n \nOdd Number");
		
		/*for(int i=0; i<=a.length-1; i++) {
			if(a[i]%2!=0)
				System.out.print(a[i]+", ");
		}*/
		
		for(int value:a) {
			if(value%2!=0)
				System.out.print(value+", ");
		}
	}

}
