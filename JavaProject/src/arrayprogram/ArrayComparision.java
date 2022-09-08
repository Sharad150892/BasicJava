package arrayprogram;
import java.util.Arrays;
public class ArrayComparision {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {5,4,3,2,1};
		int[] c = {1,2,3,4,5};

		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(a,c));
		System.out.println(Arrays.equals(b,c));
	}

}
