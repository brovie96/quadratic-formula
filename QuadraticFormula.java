/* Author: Seth Riedel
 * Purpose: Do the quadratic formula really fast
 * Version 0.5 (test with x^2 - 1 = 0; results should be 1 and -1)
 */
public class QuadraticFormula
{
   public static void main(String[] args)
   {
      //define variables
      double a = 1;
      double b = 0;
      double c = -1;
      double discrim;
      double firstAnswer;
      double secondAnswer;
      //get input (coming in version 1.0)
      //calculations
      discrim = Math.sqrt(Math.pow(b,2) - 4*a*c);
      firstAnswer = (-b + discrim)/(2*a);
      secondAnswer = (-b - discrim)/(2*a);
      //print result
      System.out.printf("The answers are %f and %f.%n",firstAnswer,secondAnswer);
   } //end main method
} //end class