   /**
 *Adds onto last weeks project..
 *Activity 10
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 4/13/2022
 */
 
public class InventoryListApp {
 
  /**
   * This area is the main.
   * @param args not used.
   */
   
   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
   
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.print(myItems.toString() + "\n");
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}