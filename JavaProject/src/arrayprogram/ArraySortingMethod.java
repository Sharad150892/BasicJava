package arrayprogram;
import java.util.Arrays;
public class ArraySortingMethod {
	
	
	public static void main(String[] args) {

		int[] a = {13,45,32,-12,14,2,3,22,-16,333,234,55,-33,44,67,87,888,9000,1001001,234532435,5,7};

			Arrays.sort(a);

			for(int i = 0; i<a.length; i++)
				System.out.print(a[i]+" ");
				
			System.out.println("\n");
			for(int i=a.length-1; i>=0; i--)
				System.out.print(a[i]+" ");
		
		}
	

}
