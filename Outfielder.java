/**
 *Baseball project code, week 1.
 *Project 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/10/2022
 */
 
public class Outfielder extends BallPlayer {
 
//instance variables here
   private double outfielderFieldingAvg;
   
/**
    *Outfielder is the main class.
 *@param playerNumberIn gets the player number.
 *@param playerNameIn gets the player name.
 *@param positionIn gets the player position.
 *@param baseSalaryIn gets the base salary.
 *@param bonusAdjustmentFactorIn gets the factor.
 *@param battingAverageIn gets the average.
 *@param outfielderFieldingAvgIn for avg.
 */
   public Outfielder(String playerNumberIn, String playerNameIn,
      String positionIn, double baseSalaryIn, 
      double bonusAdjustmentFactorIn, double battingAverageIn, 
      double outfielderFieldingAvgIn)  {
      
      super(playerNumberIn, playerNameIn, positionIn, baseSalaryIn,
         bonusAdjustmentFactorIn, battingAverageIn);
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }
   
/**
 *getOutfielderFieldingAvg gets avg.
 *@return outfielderFieldingAvg gets avg.
 *accepts none, returns double.
 */
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
/**
 *setOutfielderFieldingAvg sets avg.
 *@param outfielderFieldingAvgIn gets avg.
 *accepts double, returns none.
 */
   public void setOutfielderFieldingAvg(double outfielderFieldingAvgIn) {
      outfielderFieldingAvg = outfielderFieldingAvgIn;
   }
   
/**
 *totalEarnings calculates the earnings.
 *@return totalEarnings for total.
 *accepts none, returns double.
 */
   public double totalEarnings() {
      double totalEarnings = (baseSalary * bonusAdjustmentFactor
         * battingAverage * outfielderFieldingAvg) + baseSalary;
      return totalEarnings;
   }
   
/**
 *toString is invoked elsewhere.
 *@return output for invoked.
 *when invoked, is inherited from ballplayer.
 */
   // public String toString() {
      // String output = super.toString();
      // return output;
   // }
   
}