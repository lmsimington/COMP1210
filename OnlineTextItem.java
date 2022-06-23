/**
 *Explanation of the code.
 *Activity 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/06/2022
 */
 
public abstract class OnlineTextItem extends InventoryItem {

   /**
    *OnlineTextItem is the main.
    *@param nameIn takes the name.
    *@param priceIn takes the price.
    *calls the parent class constructor.
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

   /**
    *calculateCost finds the total.
    *@return price gives the price.
    */
   public double calculateCost() {
      return price;
   }
}