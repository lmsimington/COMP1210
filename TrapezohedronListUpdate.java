import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *This program work with last week's material.
 *Project 5
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/22/2022
 *Happy 2sday.
 */
 
public class TrapezohedronList {

   private String trapezohedronList;
   private ArrayList<Trapezohedron> trap;
   
   /**
    *This area declares the parameters.
    * @param name is to hold the trapList.
    * @param trapIn is to hold the traps.
    */
   public TrapezohedronList(String name, ArrayList<Trapezohedron> trapIn) 
   {
      trapezohedronList = name;
      trap = trapIn;
   }
   
   /**
    *This area is to retrieve the name.
    * Returns a String representing the name of the list.
    *@return trapezohedronList returns the list of traps.
    */
   public String getName() {
      return trapezohedronList;
   }
   
   /**
    * This area is to count the trapezohedrons.
    * Returns an int, if theres 0, return 0. USE IF ELSE FOR THESE.
    *@return trap.size() returns the amt of traps.
    */
   public int numberOfTrapezohedrons() {
      return trap.size();
   }
   
   /**
    * This area finds the total surface area.
    * returns double, if 0, returns 0. use while loop.
    *@return total returns the surface area total.
    */
   public double totalSurfaceArea() {
      double total = 0;
      int index = 0;
      while (index < numberOfTrapezohedrons()) {
         total += trap.get(index).surfaceArea();
         index++;
      }
      return total;
   }
   
   /**
    * This area finds the total volume.
    * returns double, if 0, return 0.use while loop.
    *@return total holds the total volume.
    */
   public double totalVolume() {
      double total = 0;
      int index = 0;
      while (index < numberOfTrapezohedrons()) {
         total += trap.get(index).volume();
         index++;
      }
      return total;
   }
   
   /**
    * This area finds the average surface area.
    * returns double, if 0, return 0.if else using totals.
    *@return averageSurfaceArea uses the equation below.
    */
   public double averageSurfaceArea() {
      if  (numberOfTrapezohedrons() == 0) {
         return 0;
      }
      else {
         return (totalSurfaceArea() / numberOfTrapezohedrons());
      }
   }
    
   /**
    * This area finds the average volume.
    * returns double, if 0, return 0.if else using totals.
    *@return averageVolume uses equation to calculate.
    */
   
   public double averageVolume() {
      if (numberOfTrapezohedrons() == 0) {
         return 0;
      }
      else {
         return (totalVolume() / numberOfTrapezohedrons());
      }
   }
   
    /**
    * This area retrieves the toString.
    *@return output returns the toString.
    */
   public String toString() {
      String output = getName() + "\n";
      int index = 0;
      while (index < trap.size())
      {
         output += "\n" + trap.get(index).toString() + "\n";
         index++;
      }
      return output;
   }
   
    /**
    * This is the summary of gathered info.
    *@return output returns the summary.
    */
   public String summaryInfo() {
      DecimalFormat newFormat = new DecimalFormat("#,##0.0##");
      String output = ("----- Summary for " + getName() + " -----");
      output += ("\nNumber of Trapezohedrons: " + numberOfTrapezohedrons());
      output += ("\nTotal Surface Area: " 
         + newFormat.format(totalSurfaceArea()) + " square units");
      output += ("\nTotal volume: " + newFormat.format(totalVolume()) 
         + " cubic units");
      output += ("\nAverage Surface Area: " 
         + newFormat.format(averageSurfaceArea()) + " square units");
      output += ("\nAverage volume: " + newFormat.format(averageVolume()) 
         + " cubic units");
      return output;
   }
   
   
   
   
   
   // getList Method, Returns the ArrayList of Trapezohedron objects
   public ArrayList<TrapezohedronList> getList() {
      return trapList;
   }
   
   //readFile Method
   public String readFile(String fileNameIn)
   throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<TrapezohedronList>trapListName = new ArrayList<TrapezohedronList>();
   
      String trapListName = scanFile.nextLine();
   }
}