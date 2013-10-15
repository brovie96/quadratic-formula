/* Author: Seth Riedel
 * Purpose: Do the quadratic formula really fast
 * Version 1.1 (with input, partially handles imaginary answers)
 */
import java.util.Scanner; //import scanner
public class QuadraticFormula
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in); //create scanner
      //define variables
      double a;
      double b;
      double c;
      double discrim;
      double firstAnswer;
      double secondAnswer;
      //get input
      System.out.print("Enter a value for a: ");
      a = input.nextDouble();
      System.out.print("Enter a value for b: ");
      b = input.nextDouble();
      System.out.print("Enter a value for c: ");
      c = input.nextDouble();
      //calculations
      discrim = Math.sqrt(Math.pow(b,2) - 4*a*c);
      firstAnswer = (-b + discrim)/(2*a);
      secondAnswer = (-b - discrim)/(2*a);
      //print result
      if (firstAnswer == secondAnswer) System.out.printf("The answer is %f.%n",firstAnswer);
      else if (Double.isNaN(firstAnswer))
      {
         if (Double.isNaN(secondAnswer)) System.out.println("There are no real answers.");
         else System.out.printf("The only real answer is %f.%n",secondAnswer);
      } //end if
      else if (Double.isNaN(secondAnswer)) System.out.printf("The only real answer is %f.%n",firstAnswer);
      else System.out.printf("The answers are %f and %f.%n",firstAnswer,secondAnswer);
   } //end main method
} //end class