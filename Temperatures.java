import java.util.ArrayList;

/**
 *This program uses temperature data..
 *Activity 6
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/22/2022
 */

public class Temperatures 
{
   private ArrayList<Integer> temperatures;

/**
 *This program displays temperature data.
 *@param temperaturesIn reads in the temps.
 */
 
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
/**
 *getLowTemp takes none and returns int.
 *@return 0 for no temps, and low for low.
 */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

/**
 *getHighTemp takes none and returns int.
 *@return 0 for no temps, and high for high.
 */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }

/**
 *lowerMinimum takes int and returns int.
 *@param lowIn is for the minimum temp.
 *@return lowIn returns the low value.
 */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

/**
 *higherMaximum takes int and returns int.
 *@param highIn is for the max temp.
 *@return highIn returns the high value.
 */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

/**
 *toString takes none and returns String.
 *@return "" will return the results.
 */
   public String toString() {
      return "\tTemperatures: " + temperatures
           + "\n\tLow: " + getLowTemp()
           + "\n\tHigh: " + getHighTemp();
   }

//Fix getHighTemp() in interactions.

}
