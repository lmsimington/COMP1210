import java.util.Scanner;
 	  	
 /** 	
  *This program uses x/y/z values to generate the solution to an equation.
  *Project 2
  *@author LaShante' Simington
  *COMP 1210 Section 001
  *@version 01/28/2022
  */
  	  	
public class ThreeVariableExpression	  	
{	  	

 /**
  *This program will plug given values into an equation to print a solution.
  *@param args Command line arguments not used.
  */	  	
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
   //Insert Equation Here.
      System.out.println("result = (3.5x - 7.75) (2.85y + 6.0) "
         + "(1.5z - 3.1) / xyz ");
   
   //Call for x variable.
      System.out.print("\tx = ");
      double x = userInput.nextDouble();
      
   //Call for y variable.
      System.out.print("\ty = ");
      double y = userInput.nextDouble();
      
   //Call for z variable.
      System.out.print("\tz = ");
      double z = userInput.nextDouble();
      
   //Result statement variable.
      double result =  ((3.5 * x) - 7.75) * ((2.85 * y) 
         + 6.0) * ((1.5 * z) - 3.1)  / (x * y * z);
      
   //Check if values are over zero.
      if (x * y * z == 0) {
         System.out.println("result is \"undefined\"");
      }
      //Print the equation and solution.
      else {
         result = (((3.5 * x) - 7.75) * ((2.85 * y) 
            + 6.0) * ((1.5 * z) - 3.1) / (x * y * z));
         System.out.print("result = " + result);
      }
   
   }
   
}