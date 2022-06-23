 /**
 *Explanation of the code.
 *Activity 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/06/2022
 */
 
public class ElectronicsItem extends InventoryItem {
   /**
    *this area holds the instance variables.
    *shipping cost calls for its own comment.
    */
   protected double weight;
   /**
    *this accounts for the shipping cost.
    */
   public static final double SHIPPING_COST = 1.5;
  
  /**
   * ElectronicsItem is the main class.
   * @param weightIn takes the weight.
   * @param nameIn takes the name.
   * @param priceIn takes the price. 
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      name = nameIn;
      price = priceIn;
      weight = weightIn;
   }
   
   /**
    *calculateCost estimates the price.
    *@return changes the output of cost.
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}