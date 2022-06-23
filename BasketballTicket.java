import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/**
 *This program will show specific info based on ticket input.
 *Project 3
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/04/2022
 */
 
public class BasketballTicket
{

/**
 *This program will show info about a game.
 *@param args Command line arguments not used.
 */
 
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      DecimalFormat numberFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat discountFormat = new DecimalFormat("0%");
      DecimalFormat prizeFormat = new DecimalFormat("000000");
      //These were made into comments for learning purposes.
      //DecimalFormat dateFormat = new DecimalFormat("##/##/####");
      //DecimalFormat timeFormat = new DecimalFormat("##:##");
      
      
      
   //Ask for a ticket to take info from.
      System.out.print("Enter ticket code: ");
      String ticketcode = userInput.nextLine().trim();
      
   
      if (ticketcode.length() < 28) {
         System.out.println("\n*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 28 characters.");
      }
      
      else {
      
      //State the variables
         Random rand = new Random();
         String priceS = ticketcode.substring(0, 6);
         double price = Double.parseDouble(priceS) / 100;
         String discountS = ticketcode.substring(6, 8);
         double discount = Double.parseDouble(discountS) / 100;
         //Break the time apart for formatting.
         String hour = ticketcode.substring(8, 10);
         String minute = ticketcode.substring(10, 12);
         //Break the date apart for formatting.
         String month = ticketcode.substring(12, 14);
         String day = ticketcode.substring(14, 16);
         String year = ticketcode.substring(16, 20);
         
         String section = ticketcode.substring(20, 23);
         String row = ticketcode.substring(23, 25);
         String seat = ticketcode.substring(25, 27);
         String ticket = ticketcode.substring(27);
         String cost = numberFormat.format(price * (1 - discount));
         double prize = rand.nextInt(999999) + 1;
      
      //Ticket, What game is it for?
         System.out.println("\nTicket: " + ticket);
      
      
      //Date of the event, 3 spaces after.
         System.out.print("Date: " + month + "/" + day + "/" + year + "   ");
      
      
      //Time of the event
         System.out.println("Time: " + hour + ":" + minute);
      
      
      //Section of Seating, 3 spaces after.
         System.out.print("Section: " + section + "   ");
      //Row of seating, 3 spaces after.
         System.out.print("Row: " + row + "   ");
      //Physical seat number
         System.out.println("Seat: " + seat);
      
      
      //Starting price
         System.out.print("Price: " + numberFormat.format(price) + "   ");
      //Discount percentage
         System.out.print("Discount: " 
            + discountFormat.format(discount) + "   ");
      //Adjusted price, Cost
         System.out.println("Cost: " + cost);
      
      
      //Random prize number from 000001 to 999999
         System.out.println("Prize Number: " + prizeFormat.format(prize));
      }
   }
   
}