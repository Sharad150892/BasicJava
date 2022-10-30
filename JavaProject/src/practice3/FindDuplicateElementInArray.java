package practice3;

import java.util.HashSet;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		String arr[]= {"Java","Selenium","TestNG","Selenium","Phython"};
		
		boolean flag = false;
		for(int i=0; i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Found duplicate Element:- "+arr[i]);
					flag =true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not found");
		}
		
//		String arr[]= {"Java","Selenium","TestNG","Selenium","Phython"};
//		
//		
//		HashSet <String> langs = new HashSet();
//		
//		/*System.out.println(langs.add("Java"));
//		System.out.println(langs.add("Selenium"));
//		System.out.println(langs.add("TestNG"));
//		System.out.println(langs.add("Java"));*/
//		
//		boolean flag = false;
//		for(String l:arr) {
//			if(langs.add(l)==false) {
//				System.out.println("Found duplicate Element:- "+l);
//				flag = true;
//			}
//		}
//		if(flag==false) {
//			System.out.println("Duplicate element not found");
//		}

	}

}
