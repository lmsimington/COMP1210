import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

 /**
 *This program work with last week's material.
 *Project 5
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/22/2022
 *Happy 2sday.
 */
 
public class TrapezohedronListApp 
{
/**
 *This works with Trapezohedron.
 *@param args Command line arguments not used.
 *@throws FileNotFoundException may appear.
 */
   public static void main(String[] args)
      throws FileNotFoundException
   {
   //Prompt user for a file name.
      System.out.print("Enter file name: ");
      Scanner userInput = new Scanner(System.in);
   
   //Read in Data File.
      String fileName = userInput.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
   
   //In while loop, create new objects and add to array list.
      String name = scanFile.nextLine();
      ArrayList<Trapezohedron> trapList = new ArrayList<Trapezohedron>();
      
      while (scanFile.hasNext()) {
         String labelIn = scanFile.nextLine();
         String colorIn = scanFile.nextLine();
         double shortEdgeIn = Double.parseDouble(scanFile.nextLine());
         trapList.add(new Trapezohedron(labelIn, colorIn, shortEdgeIn));
      }
      scanFile.close();
     
   //Create TrapezohedronList object with the name of the list and the.. 
   //ArrayList of Trapezohedron objects as parameters in the constructor.
      TrapezohedronList list = new TrapezohedronList(name, trapList);
   
   
   //Print the TrapezohedronList object,print the summary.. 
   //information about the TrapezohedronList.
      System.out.print("\n" + list + "\n\n");
      System.out.println(list.summaryInfo());
   
   
   }
}