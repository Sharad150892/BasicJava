package dsaprogram;

import java.util.ArrayList;
import java.util.TreeSet;

public class MaximumMinimum1 {
	
	public static void main(String[] args) {
		
		int[] ar = {12,44,32,55,2,300,900};
		
		TreeSet tr = new TreeSet();
		
		for(int num:ar)
			tr.add(num);
		
		ArrayList al = new ArrayList(tr);
		
		System.out.println("Maximum Element: "+al.get(al.size()-1));
		System.out.println("Minimum Element: "+al.get(0));
	}

}
