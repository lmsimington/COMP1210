import java.util.Comparator;

/**
 *Added on to previous project.
 *Project 10
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/15/2022
 */
 
public class NameComparator implements Comparator<BallPlayer> {

/**
 *NameComparator compares names.
 *@param p1 holds player 1.
 *@param p2 holds player 2.
 *@return comparison for sort.
 */
   public int compare(BallPlayer p1, BallPlayer p2) {
      int p1Name = p1.getName().indexOf(" ");
      int p2Name = p2.getName().indexOf(" ");
      
      String player1Name = (p1.getName().substring(p1Name + 1) 
         + p1.getName().substring(0, p1Name)).toUpperCase();
         
      String player2Name = (p2.getName().substring(p2Name + 1) 
         + p2.getName().substring(0, p2Name)).toUpperCase();
         
      return player1Name.compareTo(player2Name);
   }
}