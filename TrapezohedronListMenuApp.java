import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

//Fix instances of trape, and the 'while choice is not q' option.

 /**
 *This program works with Trapezohedron data.
 *Project 6
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/28/2022
 */
 
public class TrapezohedronListMenuApp {

/**
 * This program is used with TrapezohedronList and Trapezohedron.
 * This area is the main method.
 *@param args Command line arguments not used.
 *@throws FileNotFoundException may occur.
 */
   public static void main(String[] args) 
      throws FileNotFoundException {
   //Instantiate and assign meaning to the variables.
      Scanner userInput = new Scanner(System.in);
      String name = "*** no list name assigned ***";
      ArrayList<Trapezohedron> list = new ArrayList<Trapezohedron>();
      TrapezohedronList trape = new TrapezohedronList(name, list);
      
    //Create the list for the menu..
      String menu = "";
      menu = "Trapezohedron List System Menu";
      menu += "\nR - Read File and Create Trapezohedron List";
      menu += "\nP - Print Trapezohedron List";
      menu += "\nS - Print Summary";
      menu += "\nA - Add Trapezohedron";
      menu += "\nD - Delete Trapezohedron";
      menu += "\nF - Find Trapezohedron";
      menu += "\nE - Edit Trapezohedron";
      menu += "\nQ - Quit";
      //menu += "\nEnter Code [R, P, S, A, D, F, E, Q]:";
      System.out.println(menu);
   
   
      char choice = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         String code = userInput.nextLine();
         code = code.toUpperCase();
         choice = code.charAt(0);
         
         switch (choice) {
            // Read File Option.
            case 'R': 
               String file = "";
               System.out.print("\tFile name: ");
               file = userInput.nextLine();
               //Add the backend process.
               System.out.println("\tFile read in and Trapezohedron"
                  + " List created");
               break;
               
               // Print Option.
            case 'P': 
               System.out.println(trape.toString());
               break;
               
               // Summary Option.
            case 'S': 
               System.out.println("\n" + trape.summaryInfo());
               break;
               
               // Add Info Option.
            case 'A': 
               String addLabel = "";
               String addColore = "";
               double addShortEdge = 0.0;
               // Obtain new paramaters
               System.out.print("\tLabel: ");
               addLabel = userInput.nextLine().trim();
               System.out.print("\tColor: ");
               String addColor = userInput.nextLine();
               System.out.print("\tShort Edge: ");
               addShortEdge = Double.parseDouble(userInput.nextLine());
               // Create and add new object
               trape.addTrapezohedron(addLabel, addColor, addShortEdge);
               System.out.println("\t*** Trapezohedron added ***");
               break;
               
               //Deletion Option.
            case 'D':
               String deleteLabel = "";
               System.out.print("\tLabel: ");
               deleteLabel = userInput.nextLine().trim();
               
               if (trape.findTrapezohedron(deleteLabel) == null) {
                  System.out.println("\t\"" + deleteLabel + "\" not found");
               }
               else {
                  System.out.println("\t\"" 
                     + trape.findTrapezohedron(deleteLabel).getLabel() 
                     + "\" deleted");
                  trape.deleteTrapezohedron(deleteLabel);
               }
               break;
               
               //Find Option.
            case 'F': 
               // Obtain found object label
               String findLabel = "";
               System.out.print("\tLabel: ");
               findLabel = userInput.nextLine().trim();
               
               if (trape.findTrapezohedron(findLabel) != null) {
                  System.out.println(trape.findTrapezohedron(findLabel));
               }
               else {
                  System.out.println("\t\"" + findLabel + "\" not found");
               }
               break;
               
               //Edit Option.
            case 'E': 
               String editLabel = "";
               String editColor = "";
               double editShortEdge = 0;
               //Get the new info.
               System.out.print("\tLabel: ");
               editLabel = userInput.nextLine().trim();
               System.out.print("\tColor: ");
               editColor = userInput.nextLine().trim();
               System.out.print("\tShort Edge: ");
               editShortEdge = Double.parseDouble(userInput.nextLine());
               // If object to be edited exists then...
               if (trape.findTrapezohedron(editLabel) != null) {
                  // Edit object.
                  trape.editTrapezohedron(editLabel, editColor, editShortEdge);
                  System.out.println("\t\"" 
                     + editLabel
                     + "\" successfully edited");
               }
               else {
                  System.out.println("\t\"" + editLabel + "\" not found");
               }
               break;
               
               //Quit Option.
            case 'Q': 
            //nothing should happen here
               break;
               
               //Invalid Option.
            default: 
               System.out.println("\t*** invalid code ***");
               break;
         }
         
         System.out.print("\n");
      } while (choice != 'Q');
   
   }
}
