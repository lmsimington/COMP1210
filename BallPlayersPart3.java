import java.io.FileNotFoundException;
   
/**
 *BallPlayersPart3 for project 11.
 */
public class BallPlayersPart3 {

/**
 *main is the only class.
 *@param args of array string.
 */
   public static void main(String[] args) {
      try {
         if (args.length == 0) {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         //end the program here.
         }
         else {
         //get file name from command line.
         //create an instance of BallTeam.
         //call BallTeam to read and print 5 reports.
            BallTeam newTeamName = new BallTeam();
            newTeamName.readBallPlayerFile(args[0]);
         
            System.out.println(newTeamName.generateReport());
            System.out.println(newTeamName.generateReportByNumber());
            System.out.println(newTeamName.generateReportByName());
            System.out.println(newTeamName.generateReportByEarnings() + "\n");
            System.out.println(newTeamName.generateExcludedRecordsReport() 
               + "\n");
         }
      }
      catch (FileNotFoundException e) {
         System.out.println("*** Attempted to read file: " + e);
         
         // if (excludedCount < MAX_EXCLUDED) {
       // excludedRecords[excludedCount++] = "*** invalid category *** "
                     // + line;
               //       }
      }
      // catch (InvalidCategoryException e) {
         // String invalid1 = e + "in: " + line;
         // addExcludedRecord(invalid1);
      // }
      // 
      // catch (NumberFormatException e) {
         // String invalid2 = e + "in: " + line;
         // addExcludedRecord(invalid2);
      // }
      // catch (NoSuchElementException e) {
         // String invalid3 = e + "in: " + line;
         // addExcludedRecord(invalid3);
      // }
      
   }
}