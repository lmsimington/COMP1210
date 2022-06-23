
 /**
 *This program will give bank loan info.
 *Activity 7A
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/16/2022
 */
 
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   

/**
 * BankLoan holds the variables used.
 * @param customerNameIn holds the customer name.
 * @param interestRateIn holds the rate.
 */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
 *This is the main method's start.
 * @param amount holds the amount.
 * @return wasLoanMade returns a true or false value.
 */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
 * is AmountValid returns a boolean value.
 * @param amount holds the amount.
 * @return amount returns the amount.
 */

   public static boolean isAmountValid(double amount) {
      boolean isAmountValid = false;
   
      if (amount >= 0) {
         isAmountValid = true;
      }
      return isAmountValid;
   }
   
/**
 * payBank holds balance.
 * @param amountPaid holds the amt paid.
 * @return newBalance returns the abs value remaining.
 */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
/**
 * getBalance returns the balance.
 * @return balance returns the full balance.
 */
   public double getBalance() {
      return balance;
   }
  
/**
 * isInDebt fi nds out if there is debt.
 * @param loan holds the loan info.
 * @return isInDebt returns debt status.
 */
   public static boolean isInDebt(BankLoan loan) {
      boolean isInDebt = false;
      if (loan.getBalance() > 0) {
         return true;
      }
      return isInDebt;
   } 
   
/**
 *setInterestRate sets the rate.
 * @param interestRateIn holds the rate.
 * @return interestRate returns the rate.
 */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
/**
 * getInterestRate returns the rate.
 * @return interestRate returns the rate.
 */
   public double getInterestRate() {
      return interestRate;
   }
   
/**
 * chargeInterest shows the full amt with interest.
 */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
      
/**
 *getLoansCreated returns the number of loans.
 * @return loansCreated returns the loans made.
 */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
    * this area resets the amt of loans made.
    */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
/**
 * toString returns the results of the program.
 * @return output returns the results.
 */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
