import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

      
/**
 *This program work with Trapezohedron.
 *Project 6
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/28/2022
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
      output += ("\nTotal Volume: " + newFormat.format(totalVolume()) 
         + " cubic units");
      output += ("\nAverage Surface Area: " 
         + newFormat.format(averageSurfaceArea()) + " square units");
      output += ("\nAverage Volume: " + newFormat.format(averageVolume()) 
         + " cubic units");
      return output;
   }
   
   /**
    * getList Method, Returns the ArrayList of Trapezohedron objects.
    *@return trap will return the list.
    */
   public ArrayList<Trapezohedron> getList() {
      return trap;
   }
   
   /**
    *This is the readFile Method.
    *@return newTrapeList will return the new list.
    *@param fileName holds the file name.
    *@throws FileNotFoundException may occur.
    */
   public TrapezohedronList readFile(String fileName)
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
     
      ArrayList<Trapezohedron>trapList = new ArrayList<Trapezohedron>();
   
      String trapListName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String nameIn = scanFile.nextLine();
         String colorIn = scanFile.nextLine();
         double shortEdgeIn = Double.parseDouble(scanFile.nextLine());
         Trapezohedron trape = new Trapezohedron(nameIn, colorIn, shortEdgeIn);
         trapList.add(trape);
      }
      scanFile.close();
      TrapezohedronList newTrapeList = new 
         TrapezohedronList(trapListName, trapList); 
      return newTrapeList;
   }
      
     /**
      * addTrapezohedron returns nothing, takes label, color, short edge.
      *create new object and add to list. add a javadoc comment.
      *@param labelIn holds the object label.
      *@param colorIn holds object color.
      *@param shortEdgeIn hold edge length.
      */
   public void addTrapezohedron(String labelIn, 
      String colorIn, double shortEdgeIn) { 
      Trapezohedron trape = new Trapezohedron(labelIn, colorIn, shortEdgeIn);
      trap.add(trape);
   }
      /**
       *findTrapezohedron takes label as String and returns..
       * object if found, otherwise null.
       *@return trape returns the trape object.
       *@param labelIn holds label info.
       */
   public Trapezohedron findTrapezohedron(String labelIn) {
      for (Trapezohedron trape : trap) {
         if (trape.getLabel().equalsIgnoreCase(labelIn)) {
            return trape;
         }
      }
      return null;
   }
      
    /** deleteTrapezohedron takes String for label and returns...
     * the trap if found and deleted. otherwise null
     *@param labelIn holds label info.
     *@return deleted returns the deleted object.
     */
   public Trapezohedron deleteTrapezohedron(String labelIn) {
      if (findTrapezohedron(labelIn) != null) {
         Trapezohedron deleted = findTrapezohedron(labelIn);
         trap.remove(deleted);
         return deleted;
      }
      else {
         return null;
      }
   }
      
      /**editTrapezohedron takes 3 params uses label to find...
       *sets other values passed in as params. not found returns false.
       *@return true if true and false if false
       *@param labelIn holds the object label for this section.
       *@param colorIn holds object color for this section.
       *@param shortEdgeIn hold edge length for this section.
       */
   public boolean editTrapezohedron(String labelIn, String colorIn, 
         double shortEdgeIn) { 
      Trapezohedron tli = findTrapezohedron(labelIn);
      if (tli != null) {
         tli.setColor(colorIn);
         tli.setShortEdge(shortEdgeIn);
         return true;
      }
      return false;
   }
}
