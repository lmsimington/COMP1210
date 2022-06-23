/**
 *Baseball project code, week 1.
 *Project 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/10/2022
 */
 
public class Infielder extends BallPlayer {
 
//instance variables here
   private double infielderFieldingAvg;

  /**
   * MainClassName is the main class.
   * @param playerNumberIn gets player number.
   * @param playerNameIn takes the player name.
   * @param positionIn takes the player position.
   * @param baseSalaryIn takes the base salary.
   * @param bonusAdjustmentFactorIn takes adj.
   * @param battingAverageIn takes the avg.
   * @param infielderFieldingAvgIn takes the infldr avg.
   */
   public Infielder(String playerNumberIn, String playerNameIn,
         String positionIn, double baseSalaryIn, double bonusAdjustmentFactorIn,
         double battingAverageIn, double infielderFieldingAvgIn) {
      super(playerNumberIn, playerNameIn, positionIn, baseSalaryIn,
         bonusAdjustmentFactorIn, battingAverageIn);
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   /**
    *getInfielderFieldingAvg gets the avg.
    *@return infielderFieldingAvg for avg.
    *accepts none, return double.
    */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
    *setInfielderFieldingAvg sets the avg.
    *@param infielderFieldingAvgIn for avg.
    *accepts double, returns none.
    */
   public void setInfielderFieldingAvg(double infielderFieldingAvgIn) {
      infielderFieldingAvg = infielderFieldingAvgIn;
   }
   
   /**
    *totalEarnings calculates earnings.
    *@return totalEarnings for 
    *accepts none, returns double.
    */
   public double totalEarnings() {
      double totalEarnings = (baseSalary * bonusAdjustmentFactor
         * battingAverage * infielderFieldingAvg) + baseSalary;
      return totalEarnings;
   }
   
   /**
    *toString invokes print info.
    *@return output gives the output.
    *when invoked, is inherited from ballplayer.
    */
   // public String toString() {
      // String output = super.toString();
      // return output;
   // }
   
}