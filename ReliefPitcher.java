/**
 *Baseball project code, week 1.
 *Project 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/10/2022
 */
 
public class ReliefPitcher extends Pitcher {
 
 //instance variables here

   private int saves;

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
 *@param savesIn gets the saves.
 */
   public ReliefPitcher(String playerNumberIn, String playerNameIn,
      String positionIn, double baseSalaryIn, double bonusAdjustmentFactorIn,
      double battingAverageIn, int winsIn, int lossesIn, 
      double eraIn, int savesIn) {
   
      super(playerNumberIn, playerNameIn, positionIn, baseSalaryIn,
         bonusAdjustmentFactorIn, battingAverageIn,  winsIn, 
         lossesIn, eraIn);
      saves = savesIn;
   }
   
   /**
    *getSaves gets the saves.
    *@return saves gives saves.
    *accepts none, returns int.
    */
   public int getSaves() {
      return saves;
   }
   
/**
 *setSaves sets the saves.
 *@param savesIn gets the saves.
 *accepts int, returns none.
 */
   public void setSaves(int savesIn) {
      saves = savesIn;
   }
  
/**
 *totalEarnings gets total amt.
 *@return totalEarnings for total.
 *accepts none, returns double.
 */
   public double totalEarnings() {
      double totalEarnings = ((baseSalary * bonusAdjustmentFactor) 
            * (1 / (1 + era)) * (wins - losses + saves) / 30) + baseSalary;
      return totalEarnings;
   }
   
/**
 *stats gets the stats.
 *@return stats gives the stats.
 *accepts none, returns String.
 */
   public String stats() {
      String stats = wins + " wins, " + losses + " losses, " 
         + saves + " saves, " + era + " ERA";
      return stats;
   }
   
/**
 *toString returns the output.
 *@return output gives the output.
 *when invoked, inherited from BallPlayer.
 */
   // public String toString() {
      // String output = super.toString();
      // return output;
   // }
   
}