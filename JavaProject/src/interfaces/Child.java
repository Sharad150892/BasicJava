package interfaces;

public class Child implements Parent1, Parent2 {

	@Override
	public void Position() {
		System.out.println("Method of Position");
		 
		for (char i='A' ; i<='Z'; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}

	@Override
	public void Portfolio() {
		System.out.println("Method of Portfolio");
		int n=10;
		long f = 1;
		for(int i=1; i<=n; i++) {
			f*=i;
		}
		System.out.println("Factorial = "+f);
		System.out.println();
	}

	@Override
	public void Order() {
		System.out.println("Method of Order");
		
		int n=10, fT=0, sT=1;
		
		System.out.println("Fibonacci series of "+n+" terms is");
		for(int i=1; i<=n; i++) {
			System.out.print(fT+", ");
			int nT=fT+sT;
			fT=sT;
			sT=nT;
		}
		System.out.println();
		
	}

	@Override
	public void SignUp() {
		System.out.println("Method of SignUp");
		
		int n1=48, n2=96, gcd=1;
		
		for(int i=1; i<=n1 && i<=n2; i++) {
			if (n1%i==0 && n2%i==0)
				gcd = i;
		}
		System.out.println("GCD of "+n1+" and "+n2+" is "+gcd);
		System.out.println();
		
	}

	@Override
	public void Homepage() {
		System.out.println("Method of Homepage");
		
		int n1=49, n2=35, gcd=1;
		for(int i=1; i<=n1 && i<=n2; i++) {
			if (n1%i==0 && n2%i==0)
				gcd=i;
			
		}
		int lcm = (n1*n2)/gcd;
				System.out.println("LCM of "+n1+" and "+n2+" is "+lcm);
				System.out.println();
	}

	@Override
	public void BuyStock() {
		System.out.println("Method of BuyStock");
		int num = 100, sum = 1;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("Sum = "+sum);
		System.out.println();
	}

	@Override
	public void SellStock() {
		System.out.println("Method of SellStock");
		int n=7;
		for (int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d \n",n,i,n*i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Child ob = new Child();
		ob.SignUp();
		ob.Homepage();
		ob.BuyStock();
		ob.SellStock();
		ob.Portfolio();
		ob.Position();
		ob.Order();
	}

}
