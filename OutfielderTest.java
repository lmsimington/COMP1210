import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** This tests for the outfielder methods. **/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

//These tests are used for the Outfielder class.
//Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
//150000, 1.25, .375, .950)

   /** A test for outfielder fielding average. **/
   @Test public void getOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         150000, 1.25, .375, .950);
      Assert.assertEquals("OufielderAvgTest", .950, 
         p1.getOutfielderFieldingAvg(), 0.0001);
   }
   
   /** A test for outfielder fielding average. **/
   @Test public void setOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         150000, 1.25, .375, .950);
      p1.setOutfielderFieldingAvg(.950);
      Assert.assertEquals("OufielderAvgTest", .950, 
         p1.getOutfielderFieldingAvg(), 0.0001);
      //Assert.assertEquals(
   }
      
      /** A test for total earnings. **/
   @Test public void totalEarningsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         150000, 1.25, .375, .950);
      Assert.assertEquals("totalEarnings", 216796.88, p1.totalEarnings(), 0.01);
   }
   
   //The tests regarding BallPlayer start here.
   
   /** A test for the getters. **/
   @Test public void gettersTest() {
      BallPlayer.resetCount();
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         150000, 1.25, .375, .950);
   
      Assert.assertEquals("getNumber", "32", p1.getNumber());
      Assert.assertEquals("getName", "Pat Jones", p1.getName());
      Assert.assertEquals("getPosition", "RF", p1.getPosition());
      Assert.assertEquals("getBaseSalary", 150000.00, 
         p1.getBaseSalary(), 0.001);
      Assert.assertEquals("getBonusAdjustmentFactor", 1.25, 
         p1.getBonusAdjustmentFactor(), 0.001);
      Assert.assertEquals("getBattingAvg", .375, p1.getBattingAvg(), 0.0001);
      //made an adjustemtn to the get and resetCount methods.
      Assert.assertEquals("getCount", 1, BallPlayer.getCount());
   }
   
   /** A test for the setters. **/
   @Test public void settersTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         150000, 1.25, .375, .950);
      
      p1.setNumber("32");
      Assert.assertEquals("setNumber", "32", p1.getNumber());
      
      p1.setName("Pat Jones");
      Assert.assertEquals("setName", "Pat Jones", p1.getName());
      
      p1.setPosition("RF");
      Assert.assertEquals("setPosition", "RF", p1.getPosition());
      
      p1.setBaseSalary(150000);
      Assert.assertEquals("setBaseSalary", 150000.00, 
         p1.getBaseSalary(), 0.001);
      
      p1.setBonusAdjustmentFactor(1.25);
      Assert.assertEquals("setBonusAdjustmentFactor", 1.25, 
         p1.getBonusAdjustmentFactor(), 0.001);
      
      p1.setBattingAvg(.375);
      Assert.assertEquals("setBattingAvg", .375, p1.getBattingAvg(), 0.001);
   }
}
