import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *This program will test bank loan info.
 *Activity 7A
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/16/2022
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
 * This area holds the test.
 */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}