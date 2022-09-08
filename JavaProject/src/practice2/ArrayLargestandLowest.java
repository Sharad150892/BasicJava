package practice2;

import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayLargestandLowest {
	
	public static void main(String[] args) {
		
		int[] ar = {13,45,67,87,55,44,33,77,88,55,12,34,567};

		TreeSet tr = new TreeSet();

		for(int num:ar)
			tr.add(num);

		ArrayList al = new ArrayList(tr);

		System.out.println("largest: "+al.get(al.size()-1));
		System.out.println("lowest: "+al.get(0));
		}
}
