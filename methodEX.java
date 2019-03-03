/* 
 * Eddie Fujimori
 * 3/3/2019
 * In this program we are demonstrating methods
 *  using a program that will output the maximum of two numbers
 */
import java.util.Scanner;

public class methodEX {
   
   public static void main(String[] args) {
	  // Asking for user input integer values
	  System.out.println("Give me a number: ");
      Scanner d = new Scanner(System.in);
      int a = d.nextInt();
      System.out.println("Give me another number: ");
      Scanner p = new Scanner(System.in);
      int b = p.nextInt();
      
      //Finding the maximum value of previous inputs
      int c = maxFunction(a, b);
      System.out.println("Maximum Value = " + c);
      
      //one last user input integer value
      System.out.println("Give me one last number: ");
      Scanner l = new Scanner(System.in);
      int j = l.nextInt();
      
      //maximum value of previous max value and previous input
      int maximumvalue = maxFunction(c, j);
      System.out.println("maximum value of previous max value and new input is: " + maximumvalue);
      
   }

   /* returns the maximum of two numbers */
   public static int maxFunction(int n1, int n2) {
      int max;
      if (n1 < n2)
         max = n2;
      else
         max = n1;

      return max; 
   }
}