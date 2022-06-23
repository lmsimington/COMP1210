import java.text.DecimalFormat;

/**
 *Baseball project code, week 1.
 *Project 9
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/10/2022
 */
 
public abstract class BallPlayer implements Comparable<BallPlayer> {

   protected String playerNumber;
   protected String playerName;
   protected String position;
   protected double baseSalary;
   protected double bonusAdjustmentFactor;
   protected double battingAverage;
//check the variable for objects of ball players.
   protected static int ballPlayers = 0;

/**
 *BallPlayer is the main method.
 *@param playerNumberIn gets the player number.
 *@param playerNameIn gets the player name.
 *@param positionIn gets the player position.
 *@param baseSalaryIn gets the base salary.
 *@param bonusAdjustmentFactorIn gets the factor.
 *@param battingAverageIn gets the average.
 */
   public BallPlayer(String playerNumberIn, String playerNameIn,
      String positionIn, double baseSalaryIn, double bonusAdjustmentFactorIn,
      double battingAverageIn) {
      playerNumber = playerNumberIn;
      playerName = playerNameIn;
      position = positionIn;
      baseSalary = baseSalaryIn;
      bonusAdjustmentFactor = bonusAdjustmentFactorIn;
      battingAverage = battingAverageIn;
      ballPlayers++;
   }
   
/**
 *getNumber gets the number.
 *@return playerNumber for #.
 *accepts none, returns String.
 */
   public String getNumber() {
      return playerNumber;
   }
   
/**
 *setNumber sets the player number.
 *@param playerNumberIn gets the number.
 *accepts String, returns none.
 */
   public void setNumber(String playerNumberIn) {
      playerNumber = playerNumberIn;
   }

/**
 *getName gets the name.
 *@return playerNumber for name.
 *accepts none, returns String.
 */
   public String getName() {
      return playerName;
   }

/**
 *setName sets the player name.
 *@param playerNameIn gets the name.
 *accepts String, returns none.
 */
   public void setName(String playerNameIn) {
      playerName = playerNameIn;
   }

/**
 *getPosition gets the position.
 *@return position for position.
 *accepts none, returns String.
 */
   public String getPosition() {
      return position;
   }

/**
 *setPosition sets the player position.
 *@param positionIn gets the position.
 *accepts String, returns none.
 */
   public void setPosition(String positionIn) {
      position = positionIn;
   }

/**
 *getBaseSalary gets the base amt.
 *@return baseSalary for base amt.
 *accepts none, returns double.
 */
   public double getBaseSalary() {
      return baseSalary;
   }

/**
 *setBaseSalary sets the base salary.
 *@param baseSalaryIn sets the base salary.
 *accepts double, returns none.
 */
   public void setBaseSalary(double baseSalaryIn) {
      baseSalary = baseSalaryIn;
   }

/**
 *getBonusAdjustmentFactor gets the factor.
 *@return bonusAdjustmentFactor gives factor.
 *accepts none, returns double.
 */
   public double getBonusAdjustmentFactor() {
      return bonusAdjustmentFactor;
   }

/**
 *setNumber sets the player number.
 *@param bonusAdjustmentFactorIn gets the factor.
 *accepts double, returns none.
 */
   public void setBonusAdjustmentFactor(double bonusAdjustmentFactorIn) {
      bonusAdjustmentFactor = bonusAdjustmentFactorIn;
   }

/**
 *getBattingAvg gets the batting avg.
 *@return battingAverage for avg.
 *accepts none, returns double.
 */
   public double getBattingAvg() {
      return battingAverage;
   }

/**
 *setBattingAvg sets the batting average.
 *@param battingAverageIn sets the batting avg.
 *accepts double, returns none.
 */
   public void setBattingAvg(double battingAverageIn) {
      battingAverage = battingAverageIn;
   }

/**
 *getCount gets the count.
 *@return count gives amt of players.
 *accepts none, returns int.
 */
   public static int getCount() {
      return ballPlayers;
   }
   
/**
 *resetCount resets the count.
 *accepts none, returns none.
 */
   public static void resetCount() {
      ballPlayers = 0;
   }
   
/**
 *stats gives the stats.
 *@return battingAverage formats avg.
 *accepts none, returns String.
 */
   public String stats() {
      DecimalFormat df = new DecimalFormat(".000");
      return df.format(battingAverage);
   }

/**
 *toString holds the print info.
 *@return output gives the print info.
 *accepts none, returns a String. will be inherited.
 */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00");
      String output = "";
      output = playerNumber + " " + playerName + " (" + position + ") ";
      output += stats() + "\nBase Salary: $" + df.format(baseSalary);
      output += " Bonus Adjustment Factor: " + bonusAdjustmentFactor;
      output += "\nTotal Earnings: $" + df.format(totalEarnings());
      output += " (" + getClass() + ")";
      return output;
   }
      

/**
 *totalEarnings gives the earnings.
 *@return totalEarnings gives the amt.
 *abstract that accepts none, returns a double.
 */
   public double totalEarnings() {
      double totalEarnings = 0;
      return totalEarnings;
   }

/**
 *compareTo is used for comparable.
 *@param obj represents the player compared.
 *@return playerNumber comparison.
 *added comparable interface, not tested.
 */
      
   public int compareTo(BallPlayer obj) {
      return playerNumber.compareTo(obj.getNumber());
   }
}