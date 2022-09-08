package practice;

public class LeastCommonMultiple2 {
	
	public static void main(String[] args) {
		
	int n1=36; int n2 = 96;
	int lcm=(n1>n2) ? n1:n2;

	while(true) {

			if(lcm%n1==0 && lcm%n2==0) {
				System.out.printf("LCM of %d and %d is %d ",n1, n2, lcm);
				break;
				
		}
			++lcm;
	}
		
	}

}
