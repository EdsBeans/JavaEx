import java.util.Scanner;

//WE
//Like
//PIZZA
public class methodEX {
   
   public static void main(String[] args) {
	  System.out.println("Give me a number: ");
      Scanner d = new Scanner(System.in);
      int a = d.nextInt();
      System.out.println("Give me another number: ");
      Scanner p = new Scanner(System.in);
      int b = p.nextInt();
      int c = maxFunction(a, b);
      System.out.println("Maximum Value = " + c);
      System.out.println("Give me one last number: ");
      Scanner l = new Scanner(System.in);
      int j = l.nextInt();
      int maximumvalue = maxFunction(c, j);
      System.out.println("maximum value of previous max value and new input is: " + maximumvalue);
      
   }

   /** returns the minimum of two numbers */
   public static int maxFunction(int n1, int n2) {
      int max;
      if (n1 < n2)
         max = n2;
      else
         max = n1;

      return max; 
   }
}