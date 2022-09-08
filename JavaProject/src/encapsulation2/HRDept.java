package encapsulation2;



import java.util.Scanner;

import encapsulation1.Master;

public class HRDept extends Master{
	
	
		public static void main(String[] args) {
			HRDept hrobj = new HRDept();
			System.out.println(hrobj.getSalaryForHRView());
			
			 		Scanner newSal = new Scanner(System.in);
					System.out.println("Enter Revised Salary");
					int revsal = newSal.nextInt();
					hrobj.setSalary(revsal);
				System.out.println(hrobj.getSalaryForHRView());
		}
	

}
