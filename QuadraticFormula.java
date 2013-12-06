/* Author: Seth Riedel
 * Purpose: Do the quadratic formula really fast
 * Version 2.0 (optimizes input, rejects non-numbers)
 * Get newest version at http://github.com/brovie96/quadratic-formula
 */
import java.util.Scanner; //import scanner
public class QuadraticFormula
{
   static Scanner key = new Scanner(System.in); //create scanner
   public static void main(String[] args)
   {
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
      //reject zero as a value for a
      while (true)
      {
         a = input("Enter a value for a: ");
         if (a != 0)
            break;
         System.out.println("This program does not solve first-order equations.");
      } //end while
      b = input("Enter a value for b: ");
      c = input("Enter a value for c: ");
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
   
   static double input(String prompt)
   {
      double x = 0;
      loop:
      while(true)
      {
         System.out.print(prompt);
         try {
            x = key.nextDouble();
            break loop; //this will only be reached if the input is a double
         } catch (Exception e) {
            key.nextLine();
            System.out.println("Please enter a number.");
         }
      } //end
      return x; 
   } //end input method
} //end class