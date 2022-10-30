package arrayprogram;

public class ArraySorting {
	
	public static void main (String[] args) {

		int [] a = {122, -23, 11, 3455, 223, 5665, 22, -12, 45, 56, 79, 13, 14, 15, 21, 23, 24, 25};
			
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {	     // for Ascending order:- > & for Descending Order:- <
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+", ");
	}

}
