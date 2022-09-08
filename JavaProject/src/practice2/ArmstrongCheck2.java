package practice2;

public class ArmstrongCheck2 {
	
	public static void main(String[] args) {
		
		int num = 54748; 
		int	rem=0, result = 0;
		int temp = num;
		
		for(;temp!=0; temp=temp/10) {
		
		rem = temp%10;
		
		result = result + (rem*rem*rem*rem*rem);	
		}
		if (result==num)
			System.out.println(num+" is Armstrong No.");
		else
			System.out.println(num+" is not Armstrong No."); 	
		
		}

}
