import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** this is for the relief pitcher tests. **/
public class ReliefPitcherTest {
  
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

//ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
//150000, 3.50, .125, 5, 4, 3.85, 17);
 
   /** A test for the saves. **/
   @Test public void savesTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
      Assert.assertEquals("getSaves", 17, p4.getSaves(), 0.01);
      p4.setSaves(17);
      Assert.assertEquals("setSaves", 17, p4.getSaves(), 0.01);
   }
   
   /** A tests for stats. **/
   @Test public void statsTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
      Assert.assertEquals("stats", "5 wins, 4 losses, 17 saves," 
         + " 3.85 ERA", p4.stats());   
   } 
   
   /** this tests for the total earnings. **/
   @Test public void totalEarningsTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 150000, 
         3.50, .125, 5, 4, 3.85, 17);
      Assert.assertEquals("totalEarnings", 214948.45, 
         p4.totalEarnings(), 0.01);
   }
   
}
