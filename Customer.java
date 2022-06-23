 /**
 *This program is for customers.
 *Activity 7B
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/21/2022
 */
 
public class Customer implements Comparable<Customer> {
   // instance variables (can be used within the class)
   private String customer;
   private String location;
   private double balance;
   
   /**
    * Customer is the main class.
    * @param nameIn holds the customer's name.
    * comments are always useful.
    */
   public Customer(String nameIn) {
      customer = nameIn; //sets name to parameter input
      location = ""; //sets location to empty string
      balance = 0; //sets the balance to zero
   }
   
   /**
    * location sets the location variable.
    * @param locationIn accepts location.
    * takes String, returns none.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * changeBalance adds an amt to the balance.
    * @param amount holds the amount.
    * takes double, returns none.
    */
   public void changeBalance(double amount) {
      balance = balance + amount;
   }
   
   /**
    * getLocation returns variable for location.
    * takes none, returns String.
    * @return location gives the location.
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * getBalance retrieves balance.
    * takes none, returns double.
    * @return balance gives the balance.
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * setLocation overload method.
    * @param city holds the city.
    * @param state holds the state.
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
    * toString returns the info gathered.
    * @return output returns the toString.
    */
   public String toString() {
      String output = customer + "\n" 
         + location + "\n" + "$" + balance;
      return output;
   }
   
   /**
    * compareTo is used to comparecustomers.
    * @param obj holds the customers as objects.
    * @return 0, -1, or 1 based on criteria met.
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //consider them equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; //should return a negative number
      }
      else {
         return 1; //should return a positive number
      }
   }
}