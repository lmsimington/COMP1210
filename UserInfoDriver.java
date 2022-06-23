/**
 *This program will provide further info to UserInfo.java.
 *Activity 4
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/08/2022
 */
 
public class UserInfoDriver {

    /**
     *This program will accompany UserInfo.java.
     *@param args Command line arguments not used.
     */
   
   public static void main(String[] args) {
   
      //User1 Info.
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
   //User2 Info
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}