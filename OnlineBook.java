/**
 *Explanation of the code.
 *Activity 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/06/2022
 */
 
public class OnlineBook extends OnlineTextItem {
   protected String author;
 
   /**
    *OnlineBook is the main.
    *@param nameIn gets the name.
    *@param priceIn takes a price.
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
 
   /**
    *setAuthor sets the author name.
    *@param authorIn takes the author.
    *@return author gives author's name.
    */
   public String setAuthor(String authorIn) {
      author = authorIn;
      return author;
   } 
   
   /**
    *toString changes the print value.
    *@return adjusted toString.
    */
   public String toString() {
      String output = super.toString();
      output = name + " - " + author + ": $" + price;
      //return super.toString() + name + " - " + author + ": $" + price;
      return output;
   }
}
//Can't change the author's name in interactions.