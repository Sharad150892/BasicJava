package encapsulation1;

import java.util.Scanner;

public abstract class Master {
	
	
	private int sal = 50000;	//Data hiding
	
	public int getSalaryForEmp() {
		Scanner Security = new Scanner(System.in);	
			System.out.println("Enter Password :");
			String Password = Security.next(); 
			if (Password.equals("Sharad@1508"))
				return sal;
			else
				return 0; 
			
	}
	
	public int getSalaryForHRView() {
		Scanner Security = new Scanner(System.in);
		System.out.println("Enter Password");
		String Password = Security.next();
		if (Password.equals("Hr@123"))
			return sal;
		else
			return 0;
		
	}
	
	public void setSalary(int sal) {
		Scanner Security = new Scanner(System.in);
		System.out.println("Enter password");
		String Password = Security.next();
		if (Password.equals("Hr@123")) {
			this.sal=sal;
		System.out.println("Updated Salary");
		
		}
	}		
}
