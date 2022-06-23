import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *This program will solve an equation.
 *Project 3
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/07/2022
 */
 
public class MathExpression
{

/**
 *This program will solve an equation.
 *@param firstName
 *@param lastName
 */
 
 
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      
      //Name the variables here.
      System.out.print("Enter a value for x: ");
      double x = Double.parseDouble(userInput.nextLine());
      
      //Set up the formatting.
      DecimalFormat resultFormat = new DecimalFormat("#,##0.0##");
      
      
      //Insert the equation, and result.
      double result = (Math.sqrt(Math.abs(3 + (3 * x) 
         + (3 * Math.pow(x, 2)) + (3 * Math.pow(x, 3)) + (3 * Math.pow(x, 4))))
         + 3 * Math.pow(x, 5)) / (Math.abs(x) + 3);
      
      String resultS = Double.toString(result);
      
      //Make the formats for outputs.
      int left = resultS.indexOf(".");
      int length = resultS.length();
      int right = length - left - 1;
    
      
      //List the print statements here.
      System.out.println("Result: " 
         + resultS);
      System.out.println("# of characters to left of decimal point: " 
         + left);
      System.out.println("# of characters to right of decimal point: " 
         + right);
      System.out.println("Formatted Result: " + resultFormat.format(result));
   }
      
}