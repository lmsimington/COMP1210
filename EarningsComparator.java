import java.util.Comparator;

/**
 *Added on to previous project.
 *Project 10
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/15/2022
 */
 
public class EarningsComparator implements Comparator<BallPlayer> {
/**
 *compare compares players.
 *@param p1 holds player 1.
 *@param p2 holds player 2.
 *@return output for output.
 */
   public int compare(BallPlayer p1, BallPlayer p2) {
      double p1Earnings = p1.totalEarnings();
      double p2Earnings = p2.totalEarnings();
      
      int output = 0;
   
      if (p1Earnings < p2Earnings) {
         output = 1;
      }
      else if (p1Earnings == p2Earnings) {
         output = 0;
      }
      else if (p1Earnings > p2Earnings) {
         output = -1;
      }
      return output;
   }
   
}
