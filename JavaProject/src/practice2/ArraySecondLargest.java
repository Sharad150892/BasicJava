package practice2;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArraySecondLargest {
	
	public static void main(String[] args) {
		
		int ar[] = {100,90,94,80,70,94,100};	
		
		 TreeSet tr = new TreeSet();
		
		for (int num:ar)
				tr.add(num);
		
		ArrayList al = new ArrayList(tr); 
		
		System.out.println("2nd largest number in Array: "+al.get(al.size()-2));
		System.out.println("2nd lowest number in Array: "+al.get(1));
		
	}
}
