import java.io.FileNotFoundException;

/**
 *Added on to previous project.
 *Project 10
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 04/15/2022
 */
 
public class BallPlayersPart2 {

/**
 *main is the only class.
 *@param args of array string.
 *@throws FileNotFoundException may appear.
 */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      //end the program here.
      }
      else {
      //get file name from command line.
      //create an instance of BallTeam.
      //call BallTeam to read and print 5 reports.
         BallTeam team = new BallTeam();
         team.readBallPlayerFile(args[0]);
         
         System.out.println((team.generateReport()));
         System.out.println((team.generateReportByNumber()));
         System.out.println((team.generateReportByName()));
         System.out.println((team.generateReportByEarnings()));
         System.out.println((team.generateExcludedRecordsReport()) + "\n");
      }
      
   }

}