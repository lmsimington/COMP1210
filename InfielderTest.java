import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** a test for the infielder methods. **/
public class InfielderTest {
   
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
//Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 
//150000, 2.50, .275, .850)
   
    /** A test for outfielder fielding average. **/
   @Test public void getInfielderFieldingAvgTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 
         150000, 2.50, .275, .850);
      Assert.assertEquals("InfielderAvgTest", .850, 
         p2.getInfielderFieldingAvg(), 0.0001);
   }
   
   /** A test for outfielder fielding average. **/
   @Test public void setInfielderFieldingAvgTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 
         150000, 2.50, .275, .850);
      p2.setInfielderFieldingAvg(.850);
      Assert.assertEquals("InfielderAvgTest", .850, 
         p2.getInfielderFieldingAvg(), 0.0001);
      //Assert.assertEquals(
   }
      
      /** A test for total earnings. **/
   @Test public void totalEarningsTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B", 
         150000, 2.50, .275, .850);
      Assert.assertEquals("totalEarnings", 237656.25, p2.totalEarnings(), 0.01);
   }
}

