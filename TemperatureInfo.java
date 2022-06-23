import java.util.Scanner;
import java.util.ArrayList;

 /**
 *This program works with temperature data.
 *Activity 6
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/23/2022
 */
 
public class TemperatureInfo {

/**
 * This program is used with Temperatures.java.
 * This area is the main method.
 * Instantiate variables and create loops.
 *@param args Command line arguments not used.
 */
   public static void main(String[] args) {
   
   //Instantiate and assign meaning to the variables.
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
    //Create the do while loop to read temperatures and add to list.
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      Temperatures temps = new Temperatures(tempsList);
      
    //Create menu with do while loop for 4 inputs.
    //[L]ow temp, [H]igh temp, [P]rint, and [E]nd.
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, "
            + "[P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
          
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
          
            case 'P':
               System.out.println(temps);
               break;
          
            case 'E':
               System.out.println("\tDone");
               break;
          
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }
}





  // do {
         // System.out.print("Enter a temperature (or nothing to end list): ");
         // tempInput = userInput.nextLine().trim();
         // if (!tempInput.equals("")) {
            // tempsList.add(Integer.parseInt(tempInput));
         // }
      // } while (!tempInput.equals(""));
   //    
      // Temperatures temps = new Temperatures(tempsList);
   //    
   //  //Create menu with do while loop for the inputs.
      // char choice = 'Q';
      // do {
         // System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         // choice = userInput.nextLine().toUpperCase().charAt(0);
         // switch (choice) {
            // case 'R':
               // System.out.println("\tLow is " + temps.getLowTemp());
               // break;
         //  
            // case 'P':
               // System.out.println("\tHigh is " + temps.getHighTemp());
               // break;
         //  
            // case 'S':
               // System.out.println(temps);
               // break;
         //  
            // case 'A':
               // System.out.print("\tLabel:\t" + userInput);
            //    System.out.print("\tColor:\t" + userInput);
            //    System.out.print("\tShort Edge:\t" + userInput);
            //    System.out.println("\t*** Trapezohedron added ***");
               // break;
         //       
         //       case 'D':
               // System.out.println("\tDone");
               // break;
         //       
         //       case 'F':
               // System.out.println("\tDone");
               // break;
         //       
         //       case 'E':
               // System.out.println("\tDone");
               // break;
         //       
         //       case 'Q':
               // System.out.println("\tDone");
               // break;
         //  
            // default:
               // System.out.println("\tInvalid choice!");
         // }
      // } while (choice != 'Q');
   // }
// }

//choice = Character.toUpperCase(choice);