package argsandreturn;

public class ArgandReturn {
public void Test1() {  // without argument without return
		
		System.out.println("No Argument No Return");
		System.out.println("<----------------------->");
		
	}
	
		public String Test2(int a, int b) {  // with Argument and with Return
		System.out.println(a);
		System.out.println(b);
		return "Argument & Return";
		
	}
	public int Test3() {   // without Argument and with Return
		
		return 1000;
	}
		public void Test4(int a, int b) {   // with Argument without Return
			int c = a+b;
			System.out.println(c);
			
			
		}

	public static void main(String[] args) {
		ArgandReturn obj = new ArgandReturn();
		obj.Test1();
		System.out.println(obj.Test2(600, 400));
		System.out.println("<----------------------->");
		System.out.println(obj.Test3());
		System.out.println("<----------------------->");
		obj.Test4(200,300);
		obj.Test4(3000,4000);
		System.out.println("<----------------------->");
				
	}

}
