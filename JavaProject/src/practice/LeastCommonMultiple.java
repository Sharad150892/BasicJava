package practice;

public class LeastCommonMultiple {
	
	public static void main(String[] args) {

		int n1=72, n2=120, hcf=1;

		for (int i=1; i<=n1 && i<=n2; i++) {
		
		if(n1%i==0 && n2%i==0) 
			
			hcf=i;
		}

		int LCM=(n1*n2)/hcf;
		
		System.out.printf("LCM of %d and %d = %d ",n1,n2,LCM);
	}

}
