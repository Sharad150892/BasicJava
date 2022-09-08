package loop;

public class ObjectLoop {
int x=0;
	
	public static void main(String[] args) {
		
		ObjectLoop  obj = new ObjectLoop ();
		
			while (obj.x<=100) {
			if (!(obj.x%2==0))
				
				System.out.print("["+obj.x+"]"+" ");
			obj.x++;
		}
	}

}
