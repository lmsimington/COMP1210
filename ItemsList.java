/**
 *Adds to the previous activity.
 *Activity 10
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 4/13/2022
 */
 
public class ItemsList {
 
//instance variables here

   private InventoryItem[] inventory;
   private int count;

  /**
   * ItemsList is the main class.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    *addItem creates new objects.
    *@param itemIn accepts new item.
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    *calculateTotal find the total.
    *@param electronicsSurcharge is part of cost.
    *@return total for the total/
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
    *toString holds the print info.
    *@return output prints the output.
    */
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}
   
