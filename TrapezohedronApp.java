import java.util.Scanner;

/**
 *This program will accompany Trapezohedron.java.
 *Project 4
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/11/2022
 */
 
public class TrapezohedronApp
{
/**
 *This program will find values for a trapezohedron.
 *@param args Command line arguments not used.
 */
   public static void main(String[] args)
   {
   
      Scanner userInput = new Scanner(System.in);
   //Ask for the user's input.
      System.out.println("Enter label, color, and short " 
         + ("edge length for a trapezohedron."));
   
   //Placeholders for variables
      String getLabel = "";
      String getColor = "";
      String getShortEdge = "";
   
   //Ask for label.
      System.out.print("\tlabel: ");
      getLabel = userInput.nextLine();
   //Ask for color.
      System.out.print("\tcolor: ");
      getColor = userInput.nextLine();
   //Ask for edge.
      System.out.print("\tshort edge: ");
      getShortEdge = userInput.nextLine();
   
   //Placeholder variable values.
      double shortEdge = Double.parseDouble(getShortEdge);
            
   //If Else For Short Edge
      if (shortEdge <= 0) {
         System.out.println("Error: short edge must be greater than zero.");
      }
      else {
         Trapezohedron trap = new Trapezohedron(getLabel, getColor, shortEdge);
         System.out.println("\n" + trap);
      }
   
   }

}