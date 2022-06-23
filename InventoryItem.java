/**
 *Explanation of the code.
 *Activity 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/06/2022
 */
 
public class InventoryItem {
 
//instance variables here
   protected String name;
   protected double price;
   private static double taxRate = 0;
  
  /**
   * InventoryItem is the main class.
   * @param nameIn takes the name.
   * @param priceIn takes the price.
   */
   
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
     
   /**
    *getName retrieves the name.
    *@return name gives the name.
    */
   public String getName() {
      return name;
   }
   
   /**
    *calculateCost calculates the cost.
    *@return price gives the total.
    */
   public double calculateCost() {
      return price * (1 + taxRate); 
   }
   
   /**
    *setTaxRate adjusts the tax rate.
    *@param taxRateIn accepts the new rate.
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    *toString printsall the info.
    *@return gives the name/format/price
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}
   //the price outputs in interactions 
   //dont change the initial price given.