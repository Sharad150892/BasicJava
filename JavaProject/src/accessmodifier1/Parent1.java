package accessmodifier1;

 public class Parent1 {
	
	 protected int a =100;
	
	protected static int b=200;
	 
	 public final static void M1(int a, boolean b) {
		 System.out.println("Static Method of parent 1 ");
	 }
	 
	 public final void M1() {
		 System.out.println("Method of parent 1");
	 }
	 
	 public static void main(String[] args) {
		 Parent1 obj = new Parent1();
		 System.out.println(obj.a);
		 System.out.println(b);
		
	}

}