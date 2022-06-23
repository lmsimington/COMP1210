//import statements here
import javax.swing.JOptionPane;

/**
 *Driver for division class.
 *Activity 11
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/19/2022
 */
 
public class DivisionDriver {
 
//instance variables here

  /**
   * MainClassName is the main class.
   * @param args of string array.
   */
   
   public static void main(String[] args) {
      String numInput = JOptionPane.showInputDialog("Enter the numerator: ");
      String denomInput = JOptionPane.showInputDialog("Enter the "
         + "denominator: ");
   
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n" 
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n" 
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, 
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error",
            JOptionPane.ERROR_MESSAGE);
      }
   }
}

