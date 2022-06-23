import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** This tests for the pitcher methods. **/
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   //Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
   //150000, 3.50, .125, 22, 4, 2.85);

   /** A test that always fails. **/
   @Test public void gettersTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         150000, 3.50, .125, 22, 4, 2.85);
      Assert.assertEquals("getWins", 22, p3.getWins(), 0.01);
      Assert.assertEquals("getLosses", 4, p3.getLosses(), 0.01);
      Assert.assertEquals("getEra", 2.85, p3.getEra(), 0.01);
   }
   
    /** A test that always fails. **/
   @Test public void settersTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         150000, 3.50, .125, 22, 4, 2.85);
      p3.setWins(22);
      Assert.assertEquals("setWins", 22, p3.getWins(), 0.01);
      p3.setLosses(4);
      Assert.assertEquals("setLosses", 4, p3.getLosses(), 0.01);
      p3.setEra(2.85);
      Assert.assertEquals("setEra", 2.85, p3.getEra(), 0.001);
   }
   
   /** A tests for stats. **/
   @Test public void statsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         150000, 3.50, .125, 22, 4, 2.85);
      Assert.assertEquals("stats", "22 wins, 4 losses,"
         + " 2.85 ERA", p3.stats());   
   } 
   
   /** A test for total earnings. **/
   @Test public void totalEarningsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         150000, 3.50, .125, 22, 4, 2.85);
      Assert.assertEquals("totalEarnings", 248181.82, 
         p3.totalEarnings(), 0.01);
   }
}
