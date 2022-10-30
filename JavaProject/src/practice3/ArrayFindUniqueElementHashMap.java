package practice3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayFindUniqueElementHashMap {

	public static void main(String[] args) {

		ArrayFindUniqueElementHashMap obj = new ArrayFindUniqueElementHashMap();
		int arr[] = {4, 5, 1, 2, 0, 4};
		obj.uniqueElement(arr);
	}

	void uniqueElement(int[] arr) {
	
		HashMap<Integer,Integer> map = new HashMap();
		
		for(int i=0; i<=arr.length-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i] , 0)+1);
			
		}
		
		
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1)
				System.out.println(entry.getKey());
		}
		
	}
}
