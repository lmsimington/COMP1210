//import statements here

/**
 *Divides a numerator and denominator.
 *Activity 11
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/19/2022
 */
 
public class Division {
 
//instance variables here

  /**
   * intDivide divides N by D.
   * @param numerator takes nume.
   * @param denominator takes denom.
   * @return for what's returned.
   */
   
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator; 
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    *decimalDivide does float point div.
    *@param numerator for nume.
    *@param denominator for denom.
    *@return solution for solution.
    *@throws IllegalArgumentException for exception.
    */
   public static double decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      double solution = (double) numerator / denominator;
      return solution;
      
   }
   
}