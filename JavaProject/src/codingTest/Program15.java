package codingTest;

public class Program15 {

	 public static void main (String [] args) {

         try {

                System.out.println(2.0/0);

         } catch (ArithmeticException e) {

                System.out.println("ArthemeticException");

         }

   }

}
