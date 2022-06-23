/**
 *This program will output the user's status and info.
 *Activity 4
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/08/2022
 */
 
public class UserInfo
{
 //Instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   
   //Constructor
   private static final int OFFLINE = 0, ONLINE = 1;
   
    /**
     *This program will output name, age, location, and status.
     *@param firstNameIn for first name of user
     *@param lastNameIn for last name of user
     */
   
   public UserInfo(String firstNameIn, String lastNameIn)
   
   { 
   //Methods
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
    /**
    *This area refers to the toString Method.
    *@return output will output the given info?
    */
   public String toString()
   
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
   
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      
      //There was a (+ status) in line 51.
      //Removed to prevent the 0/1 response for the on or off.
      
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
    *This area refers to the location of the user..
    *@param locationIn placeholder description.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
    *This area refers to the age over 0.
    *@param ageIn placeholder description.
    *@return isSet placeholder description.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
    *This area calls for the age.
    *@return age placeholder description.
    */
   public int getAge() {
      return age;
   }
   /**
    *This area returns the user location.
    *@return location placeholder description.
    */
   public String getLocation() {
      return location;
   }
   /**
    *This area refers to an offline user.
    */
   public void logOff() {
      status = OFFLINE;
   }
   /**
    *This area refers to an online user.
    */
   public void logOn() {
      status = ONLINE;
   }
   
   
   
}