//import statements here

/**
 *Adds to project 10.
 *Project 11
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/21/2022
 */

  /**
   *InvalidCategoryException is the main class.
   */
public class InvalidCategoryException extends Exception {
  
   /**
    *InvalidCategoryException, user exc.
    *@param category of type string.
    */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}