//import statements here
import java.text.DecimalFormat;

/**
 *Accompanies the SquareAntiprism files.
 *Project 8
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/30/2022
 */
 
public class SquareAntiprismList {
 
//instance variables here
   private String name;
   private int number;
   private SquareAntiprism[] sal;

  /**
   * SquareAntiprismList is the main class.
   * @param nameIn holds the name.
   * @param numberIn is # of objects holds the array.
   * @param salIn holds the list
   */
   public SquareAntiprismList(String nameIn, 
      SquareAntiprism[] salIn, int numberIn) {
      name = nameIn;
      number = numberIn;
      sal = salIn;
   }
   
   /**
    *This method retrieves the name.
    *@return name gives the name.
    */
   public String getName() {
      return name;
   }
   
   /**
    *This method holds the amt of objects.
    *@return number if theres 1+ objects.
    */
   public int numberOfSquareAntiprisms() {
      if (number > 0) {
         return number;
      }
      return 0;
   }
   
   /**
    *This method holds the total SA.
    *@return totalSA gives the overall SA.
    */
   public double totalSurfaceArea() {
      double totalSA = 0;
      int index = 0;
      double totalValue = 0.0;
      
      if (number > 0) {
         while (index < number) {
         
            totalValue = sal[index].surfaceArea();
            totalSA += totalValue;
            index++;
         }
      }
      else {
         totalSA = 0.0;
      }
      return totalSA;
   } 
   
   /**
    *This method holds the list's volume.
    *@return totalVolume gives overall volume.
    */
   public double totalVolume() {
      double totalVolume = 0;
      int index = 0;
      double findTotal = 0.0;
      
      if (number > 0) {
         while (index < number) {
            findTotal = sal[index].volume();
            totalVolume += findTotal;
            index++;   
         }
      }
      else {
         totalVolume = 0.0;   
      }
      return totalVolume;
   }
  
   /**
    *This method holds the avg surface area.
    *@return avgSA gives the avg Surface Area.
    */
   public double averageSurfaceArea() {
      double avgSA = 0;
      if (number > 0) {
         avgSA = totalSurfaceArea() / numberOfSquareAntiprisms();
      }
      else {
         return 0;
      }
      return avgSA;
   }
   
   /**
    *This method finds the avg volume.
    *@return avgVol gives the avg volume.
    */
   public double averageVolume() {
      double avgVol = 0;
      if (number > 0) {
         avgVol = totalVolume() / numberOfSquareAntiprisms();
      }
      else {
         return 0;
      }
      return avgVol;
   }
   
   /**
    *This method holds the printed info.
    *@return result prints the results.
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of SquareAntiprisms: " + numberOfSquareAntiprisms();
      result += "\nTotal Surface Area: "  
         + df.format(totalSurfaceArea()) + " square units";
      result += "\nTotal Volume: "  
         + df.format(totalVolume()) + " cubic units";
      result += "\nAverage Surface Area: "  
         + df.format(averageSurfaceArea()) + " square units";
      result += "\nAverage Volume: "  
         + df.format(averageVolume()) + " cubic units";
      return result; 
   }
   
   /**
    *This method retrieves the list.
    *@return sal gives SquareAntiprism List.
    */
   public SquareAntiprism[] getList() {
      return sal;
   }
   
   /**
    *This method holds the option to add.
    *@param label holds the label name.
    *@param edge holds an edge length.
    */
   public void addSquareAntiprism(String label, double edge) {
      SquareAntiprism object = new SquareAntiprism(label, edge);
      sal[number] = object;
      number++;
   } 
  
   /**
    *This method holds the finder.
    *@param labelIn holds the name.
    *@return null for this method.
    */
   public SquareAntiprism findSquareAntiprism(String labelIn) {
      for (int index = 0; index < number; index++) {
         if (sal[index].getLabel().equalsIgnoreCase(labelIn)) {
            return sal[index];
         }
      }
      return null;
   }
   
   /**
    *This method holds the option to delete.
    *@param labelIn hold the label name.
    *@return output gives the result.
    */
   public SquareAntiprism deleteSquareAntiprism(String labelIn) {
      int index = 0;
      SquareAntiprism output = null;
      
      while (index < number) {
         if (sal[index].getLabel().equalsIgnoreCase(labelIn)) {
            output = sal[index];
            for (int i = index; i < number - 1; i++) {
               sal[i] = sal[i + 1];
            }
            sal[number - 1] = null;
            number--;
            break;
         }
      }
      return output;
   }
   
   /**
    *This method holds the option to edit.
    *@param labelIn holds the label name.
    *@param edgeIn holds the edge length.
    *@return result is a boolean result.
    */
   public boolean editSquareAntiprism(String labelIn, double edgeIn) {
      boolean result = false;
      int index = 0;
      
      while (index < number) {
         if (sal[index].getLabel().equalsIgnoreCase(labelIn)) {
            sal[index].setEdge(edgeIn);
            result = true;
            break;
         }
         index++;
      }
      return result;
   }
   
   /**
    *This method holds the antiprism w/ the biggest vol.
    *@return objectWithLargestVolume is the largest vol.
    */
   public SquareAntiprism findSquareAntiprismWithLargestVolume() {
      SquareAntiprism objectWithLargestVolume = sal[0];
      double largestVolume = sal[0].volume();
      
      if (number > 0) {
         for (int index = 0; index < number; index++) {
            if (sal[index].volume() >= largestVolume) {
               largestVolume = sal[index].volume();
               objectWithLargestVolume = sal[index];
            }
         }
      }
      else {
         return null;
      } 
      return objectWithLargestVolume;
   }
      
}