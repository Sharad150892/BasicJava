package constructor;

public class Constructor2 {
	public Constructor2(int phy, int chem, int math, String stuname) {
		System.out.println("Mark of Student= "+ stuname);
		System.out.println("Physics    = "+phy);
		System.out.println("Chemistry  = "+chem);
		System.out.println("Mathematics= "+math);
		int c=phy+chem+math;
		System.out.println("Total      = "+c+"\n");
	}
	public static void main(String[] args) {
		new Constructor2(80,56,78,"Sharad");
		System.out.println("<------------------------>");
		new Constructor2(46,40,43,"Shyaam");
	}

}
