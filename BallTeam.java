import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;

/**
 *Added on to previous project.
 *Project 10
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/15/2022
 */
 
public class BallTeam {
//may throw FileNotFoundException
   //placeholder types are being used here.
   private String teamName; //name of the team
   private BallPlayer[] roster; //array holds up to 24
   private int playerCount; //# of players in roster
   private String[] excludedRecords; //array up to 30
   private int excludedCount; //tracks # in array
   /**
    *These are a different type of variable.
    */
   public static final int MAX_PLAYERS = 24;
   /** It said it needed a comment here. */
   public static final int MAX_EXCLUDED = 30;
   
   /**
    *BallTeam declared most variables.
    */
   public BallTeam() {
      teamName = "";
      roster = new BallPlayer[MAX_PLAYERS];
      playerCount = 0;
      excludedRecords = new String [30];
      excludedCount = 0;
     //Max_Players is declared above.
     //Max_Excluded is declared above.
   }
   
  /**
   *getTeamName gets the team name.
   *@return teamName gives team name.
   *returns string.
   */
   public String getTeamName() {
      return teamName;
   }
   
  /**
   *setTeamName gets team name.
   *@param teamNameIn gets team name.
   *returns none, accepts string.
   */
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }
   
  /**
   *getRoster gets roster.
   *@return roster gives roster.
   *returns ball player array.
   */
   public BallPlayer[] getRoster() {
      return roster;
   }
    
  /**
   *setRoster sets roster.
   *@param playerArrayIn takes players.
   *returns none, accepts ball player array.
   */
   public void setRoster(BallPlayer[] playerArrayIn) {
      roster = playerArrayIn;
   }
   
   
  /**
   *getPlayerCount gets count.
   *@return playerCount gives players.
   *returns current value.
   */
   public int getPlayerCount() {
         //how to find the amt here.
      return playerCount;
   }
   
 /**
  *setPlayerCount sets count.
  *@param playerCountIn 
  *returns none, accepts an int.
  */
   public void setPlayerCount(int playerCountIn) {
      playerCount = playerCountIn;
   }
   
  /**
   *getExcludedRecords gets records.
   *@return excludedRecords gives excl'd.
   *returns string array repping these records.
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   *getExcludedRecordsIn gets the records.
   *@param excludedRecordsIn gets excl recs..
   *returns none, accepts string array.
   */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   
  /**
   *getExcludedCount gets the count.
   *@return excludedCount gets count.
   *returns current value of excludedCount
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
    *setExcludedCount changes count.
    *@param excludedCountIn accepts.
    *accepts int, returns none.
    */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   
  /**
   *readBallPlayerFile reads the file.
   *@param fileNameIn takes the file name.
   *accepts data file as string, returns none.
   *@throws FileNotFoundException may be used.
   */
   public void readBallPlayerFile(String fileNameIn) throws 
        FileNotFoundException {
      
      Scanner scanFile = new Scanner(new File(fileNameIn));
      teamName = scanFile.nextLine().trim();
      
      String line = null;
      while (scanFile.hasNextLine()) {
         
         line = scanFile.nextLine();
         Scanner scanLine = new Scanner(line);
         scanLine.useDelimiter(",");
            
         try {
            char category = scanLine.next().charAt(0);
            BallPlayer player;
         
            switch (category) {
            
               case 'O':
                  player = new Outfielder(scanLine.next(), scanLine.next(),
                     scanLine.next(), Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
                  break;
            
               case 'I':
                  player = new Infielder(scanLine.next(), scanLine.next(),
                     scanLine.next(), Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
                  break;
            
               case 'P':
                  player = new Pitcher(scanLine.next(), scanLine.next(),
                     scanLine.next(), Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Integer.parseInt(scanLine.next()), 
                     Integer.parseInt(scanLine.next()), 
                     Double.parseDouble(scanLine.next()));
                  break;
            
               case 'R':
                  player = new ReliefPitcher(scanLine.next(),
                     scanLine.next(), scanLine.next(),
                     Double.parseDouble(scanLine.next()), 
                     Double.parseDouble(scanLine.next()),
                     Double.parseDouble(scanLine.next()), 
                     Integer.parseInt(scanLine.next()), 
                     Integer.parseInt(scanLine.next()), 
                     Double.parseDouble(scanLine.next()), 
                     Integer.parseInt(scanLine.next()));
                  break;
            
               default:
               // if (excludedCount < MAX_EXCLUDED) {
               // excludedRecords[excludedCount++] = "*** invalid category *** "
                     // + line;
                  throw new 
                     InvalidCategoryException(Character.toString(category));
            }
                         //switch player/roster?  
            if (playerCount < MAX_PLAYERS) {
               roster[playerCount++] = player;
            }
            else if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount++] = line;
                        //"Maximum player count of 24 exceeded for: " + line;
            }
            
         } 
         
         
         
         //wont understand line, add excld record, where to try.
         catch (InvalidCategoryException e) {
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount++] = 
                  e + " in: " + line;
            }
         }
         
         catch (NumberFormatException e) {
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount++] = 
                  e + " in: " + line;
            }
         }
         
         catch (NoSuchElementException e) {
            if (excludedCount < MAX_EXCLUDED) {
               excludedRecords[excludedCount++] = 
                  e + " in: " + line;
            }
         }
         continue;
      }
   }
   
   
   
  /**
   *generateReport gives generic report.
   *returns a string, original order.
   *@return output gives report.
   */
   public String generateReport() {
      String output = "---------------------------------------";
      output += "\nTeam Report for " + teamName;
      output += "\n---------------------------------------\n";
      for (BallPlayer player : roster) {
         if (player != null) {
            output += "\n" + player + "\n";
         }
      }
      return output;
   }
   
   /**
   *generateReportByNumber sorts by num.
   *@return output gives the output.
   *returns a string, natural ordering 
   */
   public String generateReportByNumber() {
      BallPlayer[] byPlayerNumber = Arrays.copyOf(roster, playerCount);
      Arrays.sort(byPlayerNumber);
      
      String output = "";
      output += "---------------------------------------";
      output += "\nTeam Report for " + teamName + " (by Number)";
      output += "\n---------------------------------------";
      for (BallPlayer player : byPlayerNumber) {
         if (player != null) {
            output += "\n" + player.getNumber() + " " + player.getName() + " ";
            output += player.getPosition() + " " + player.stats();
         }
      }
      output += "\n";
      return output;
   }
   
  /**
   *generateReportByName sorts by name.
   *returns a string, by last name.
   *@return output for the output.
   */
   public String generateReportByName() {
      BallPlayer[] byPlayerName = Arrays.copyOf(roster, playerCount);
      Arrays.sort(byPlayerName, new NameComparator());
      
      String output = "";
      output += "---------------------------------------";
      output += "\nTeam Report for " + teamName + " (by Name)";
      output += "\n---------------------------------------";
      for (BallPlayer player : byPlayerName) {
         if (player != null) {
            output += "\n" + player.getNumber() + " " + player.getName() + " ";
            output += player.getPosition() + " " + player.stats();
         }
      }
      output += "\n";
      return output;
   }
   
   /**
    *generateReportByEarnings sorts by $.
    *returns a string, by total earnings.
    *@return output gives the output.
    */
   public String generateReportByEarnings() {
      DecimalFormat df = new DecimalFormat("$###,##0.00");
      
      BallPlayer[] byEarnings = Arrays.copyOf(roster, playerCount);
      Arrays.sort(byEarnings, new EarningsComparator());
      
      String output = "";
      output += "---------------------------------------";
      output += "\nTeam Report for " + teamName + " (by Earnings)";
      output += "\n---------------------------------------";
      for (BallPlayer player : byEarnings) {
         if (player != null) {
            output += "\n" + df.format(player.totalEarnings()) + " ";
            output += player.getNumber() + " " + player.getName() + " ";
            output += player.getPosition() + " " + player.stats();
         }
      }
      return output;
   }
   
   /**
    *generateExcludedRecordsReport of excl.
    *returns a string, processed as shown below.
    *@return output gives the output.
    */
   public String generateExcludedRecordsReport() {
      String output = "";
      output += "---------------------------------------";
      output += "\nExcluded Records Report";
      output += "\n---------------------------------------";
      for (String string : excludedRecords) {
         if (string != null) {
            output += "\n" + string;
         }
      }
      return output;
      // output += "*** invalid category ***";
      // return output;
   }
}