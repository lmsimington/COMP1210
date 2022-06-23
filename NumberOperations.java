//java.text.ArrayList;

/**
 *This program will ...
 *Activity 5
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/15/2022
 */
 
public class NumberOperations {
   private int number;
  
//Constructors

 /**
  *This area refers to the NumberOperations Method.
  * NumberOperations accepts none and returns int.
  *@param numberIn is for accepting the number.
  */
   public NumberOperations(int numberIn) 
   {
      number = numberIn;
   }


 /**
  *This area refers to the getColor Method.
  * getValue takes none and returns int.
  *@return number placeholder.
  */
   public int getValue() {
      return number; //placeholder return
   }


 /**
  *This area refers to the oddsUnder Method.
  * oddsUnder takes none and returns a String.
  *@return output placeholder.
  */
   public String oddsUnder() {
      String output = "";
       //placeholder return
      
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
    
 /**
  *This area refers to the powersTwoUnder Method.
  * powersTwoUnder takes none and returns a String.
  *@return output placeholder.
  */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2 
      }
      return output;
   }
   
   
 /**
  *This area refers to the isGreater Method.
  * isGreater takes an int and returns an int.
  *@param compareNumber will compare.
  *@return 0 placeholder.
  */
   public int isGreater(int compareNumber) {
      //return 0; //placeholder return
      if (number > compareNumber) {
         return 1; 
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0; 
      }
   }
   
   
 /**
  *This area refers to the toString method.
  * toString takes none and returns a String.
  *@return placeholder.
  */
   public String toString() {
      return number + ""; //placeholder return
   }
}
