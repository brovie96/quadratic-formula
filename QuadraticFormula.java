/* Author: Seth Riedel
 * Purpose: Do the quadratic formula really fast
 * Version 1.7 (prettifies UI)
 * Get newest version at http://github.com/brovie96/quadratic-formula
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
      double discrimAginary;
      double answerIReal;
      double answerIMaginary;
      //get input
      System.out.println("This program will solve a quadratic equation ax^2 + bx + c = 0 and give an answer to six decimal places.");
      System.out.println();
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
      discrimAginary = Math.sqrt(-(Math.pow(b,2)-4*a*c));
      answerIReal = -b/(2*a);
      answerIMaginary = discrimAginary/(2*a);
      //print result
      System.out.println();
      if (firstAnswer == secondAnswer) System.out.printf("The answer is %f.%n",firstAnswer);
      else if (Double.isNaN(discrim))
      {
         System.out.printf("The answers are %f +/- %fi.%n",answerIReal,answerIMaginary);
      } //end if
      else System.out.printf("The answers are %f and %f.%n",firstAnswer,secondAnswer);
   } //end main method
} //end class