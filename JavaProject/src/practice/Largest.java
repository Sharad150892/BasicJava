package practice;

public class Largest {

	public static void main(String[] args) {

		double n1=-4.5;
		double n2=3.2;
		double n3=1.3;

		if(n1>=n2 && n1>=n3) 
			System.out.println(n1+" is the Largest number");
		
		else if (n2>=n1 && n2>=n3)
			System.out.println(n2+" is the Largest number");
		
		else
			System.out.println(n3+" is the Largest number");
	}
	
}
