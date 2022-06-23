/**
 *This program is for scores.
 *Activity 8
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/29/2022
 */
 
public class Scores {
   //this is the instance variable.
   private int[] numbers;
   
   
 /**
  *Scores is the constructor.
  *Has an int parameter of numbersIn.
  *@param numbersIn - numbers
  */  
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
  /**
   *findEvens has no parameters, returns an array of ints.
   *no parameters, returns an array.
   *@return evens returns the even values.
   */ 
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   
   /**
    *findOdds has no parameters, returns an array of ints.
    *no parameters, returns an array.
    *@return odds returns the odd values.
    */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      int count = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   
   /**
    *calculateAverage has no parameters, returns a double.
    *no parameters, returns an double.
    *@return average returns the avg value. 
    */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return (double) (sum) / (double) (numbers.length);
   }
   
   
   /**
    *toString returns the output.
    *no parameters, returns a string.
    *@return string returns the output.
    */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
   
   /**
    *toStringInReverse reverses the values.
    *this name is long and cumbersome to type.
    *no parameters, returns String of reversed values.
    *@return result returns the results.
    */
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }

}