/**
 *Explanation of the code.
 *Activity 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/06/2022
 */
 
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;

   /**
    *OnlineArticle is the main method.
    * @param nameIn takes the name.
    * @param priceIn takes the price.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

   /**
    *setWordCount finds the number of words.
    *@param wordCountIn takes word count.
    *@return wordCount tells the amt of words.
    */
   public double setWordCount(int wordCountIn) {
      wordCountIn = 0;
      wordCount = wordCountIn;
      return wordCount;
   } 
//Check the wordCount method here.
}