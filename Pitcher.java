   /**
 *Baseball project code, week 1.
 *Project 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/10/2022
 */
 
public class Pitcher extends BallPlayer {
 
 //instance variables here
   protected int wins;
   protected int losses;
   protected double era;

/**
    *Outfielder is the main class.
 *@param playerNumberIn gets the player number.
 *@param playerNameIn gets the player name.
 *@param positionIn gets the player position.
 *@param baseSalaryIn gets the base salary.
 *@param bonusAdjustmentFactorIn gets the factor.
 *@param battingAverageIn gets the average.
 *@param winsIn gets the wins.
 *@param lossesIn gets the losses.
 *@param eraIn gets the era stats.
 */
   public Pitcher(String playerNumberIn, String playerNameIn,
      String positionIn, double baseSalaryIn, double bonusAdjustmentFactorIn,
      double battingAverageIn, int winsIn, int lossesIn, 
      double eraIn) {
      super(playerNumberIn, playerNameIn, positionIn, baseSalaryIn,
         bonusAdjustmentFactorIn, battingAverageIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
   
  /**
   *getWins gets the wins.
   *@return wins for wins.
   *accepts none, returns int.
   */
   public int getWins() {
      return wins;
   }
   
  /**
   *setWins sets the # of wins.
   *@param winsIn sets the wins.
   *accepts int, returns none.
   */
   public void setWins(int winsIn) {
      wins = winsIn;
   }
   
  /**
   *getLosses gets the # of losses.
   *@return losses for losses.
   *accepts none, returns int.
   */
   public int getLosses() {
      return losses;
   }
   
  /**
   *setLosses sets the losses.
   *@param lossesIn gets the losses.
   *accepts int, returns none.
   */
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }
   
  /**
   *getEra gets the era info.
   *@return era gives the era.
   *accepts none, returns double.
   */
   public double getEra() {
      return era;
   }
   
  /**
   *setEra sets the era.
   *@param eraIn gets the era.
   *accepts double, returns none.
   */
   public void setEra(double eraIn) {
      era = eraIn;
   }
   
  /**
   *totalEarnings gives the total.
   *@return totalEarnings gives total.
   *accepts none, returns double.
   */
   public double totalEarnings() {
   //baseSalary and bonusAdjustmentFactor don't work.
      // double totalEarnings = ((baseSalary * bonusAdjustmentFactor) 
         //    * (1 / (1 + era)) * ((wins - losses) / 25));
      double totalEarnings = ((baseSalary * bonusAdjustmentFactor)
            * (1 / (1 + era)) * (wins - losses) / 25.0) + baseSalary;
      return totalEarnings;
   }
   
  /**
   *stats retrieves the stats.
   *@return stats returns the stats.
   *accepts none, returns String.
   */
   public String stats() {
      String stats = wins + " wins, " + losses + " losses, " + era + " ERA";
      return stats;
   }
   
  /**
   *toString holds the print info.
   *@return output prints the info.
   *when invoked, inherited from BallPlayer.
   */
   // public String toString() {
      // String output = super.toString();
      // return output;
   // }
   
}