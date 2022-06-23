import java.util.Scanner;

/**
 *This program will encode messages based on input.
 *Activity 3
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 01/31/2022
 */
 
public class MessageConverter
{

/**
 *This program will encode messages.
 *@param args Command line arguments not used.
 */
 
   public static void main(String[] args)
   {
   //Declare the variables.
      Scanner userInput = new Scanner(System.in);
      String message = "";
      String result = "";
   
    //Ask for user input message.
      System.out.print("Type in a message and press enter: \n\t> ");
      message = userInput.nextLine();
   
   //Describe what each number does.
      System.out.print("\nOutput types:"
         + "\n\t0: As is"
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
         
      int outputType = Integer.parseInt(userInput.nextLine());
   
   //Ask user for a number command.
   
   
   //0 is unchanged.
      if (outputType == 0) { //as is
         result = message;
      }
      
      //1 is trimmed.
      else if (outputType == 1) { //trimmed
         result = message.trim();
      }
      
      //2 is lowercase.
      else if (outputType == 2) { //lowercase
         result = message.toLowerCase();
      }
      
      //3 is uppercase.
      else if (outputType == 3) { //upper case
         result = message.toUpperCase();
      }
      
      //4 is lowercase vowels as underscores.
      else if (outputType == 4) { //replace vowels
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      
      //5 is without first and last character.
      else if (outputType == 5) { //without first and last
         result = message.substring(1, message.length() - 1);
      }
      
      //other: invalid selection
      else { //invalid input
         result = "Error: Invalid choice input.";
      }
      //Print the results
      System.out.println("\n" + result);
   }
   
}
