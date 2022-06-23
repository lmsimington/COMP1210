import java.util.Scanner;
 	  	
 /** 	
  *This program is for an atm.
  *Project 2
  *@author LaShante' Simington
  *COMP 1210 Section 001
  *@version 01/28/2022
  */
  	  	
public class ATM 	
{	  	
 /**
  *This program determines the amount of each bill type.  
  *@param args Command line arguments not used.
  */	  	
  
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
   
    //Ask for an amount.
      System.out.print("Enter the amount: ");
      int amount = userInput.nextInt();
   
   
   //If Else Statement to check amt entered.
      if (amount > 500) {
         System.out.println("Limit of $500 exceeded!");
      }
      
      //Finish the else statement.
      else {
       //Maximum number of 20's.
         int twenty = amount / 20;
         int remaining = amount % 20;
      
      
      //Maximum number of 10's.
         int tens = remaining / 10;
         remaining = remaining % 10;
         
      
      //Maximum number of 5's.
         int fives = remaining / 5;
         remaining = remaining % 5;
         
      
      //Maximum number of 1's.
         int ones = remaining / 1;
         remaining = remaining % 1;
       
      
      //The remaining print statements.
         System.out.println("Bills by denomination:");
         System.out.println("\t$20: " + twenty);
         System.out.println("\t$10: " + tens);
         System.out.println("\t$5: " + fives);
         System.out.println("\t$1: " + ones);
      
      
      //Print the amounts and denominations.
         System.out.println("$" + amount + " = ("  
            + twenty + " * $20) + (" 
            + tens + " * $10) + (" 
            + fives + " * $5) + (" 
            + ones + " * $1)");
      }
   }
}