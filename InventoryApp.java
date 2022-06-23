/**
 *Explanation of the code.
 *Activity 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/06/2022
 */
 
public class InventoryApp {
   /**
    *InventoryApp is the main.
    *Instantiates items 1-4.
    */
   public InventoryApp() {
      InventoryItem.setTaxRate(0.05);
   //Add the instantiation of items 1-4 here.
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      InventoryItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L.G. Jones");
   }
}