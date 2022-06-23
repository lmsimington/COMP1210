import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *This program is for customers.
 *Activity 7B
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/21/2022
 */
 
public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * setLocation1 tests a change of location.
    */
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   
   /** 
    * setLocation2 tests a change of location.
    */
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta, GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
   
   /** 
    * changeBalanceTest tests the change of balance.
    */
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
   
   /** 
    * toString tests the output.
    */
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   
   /** 
    * compareToTest1 tests compareTo method.
    */
   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   
   /** 
    * compareToTest2 tests compareTo method.
    */
   @Test public void compareToTest2() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   
   /** 
    * compareToTest3 tests compareTo method.
    */
   @Test public void compareToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}
