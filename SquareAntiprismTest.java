import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//I left note of everything I tried for my reference.
//Fix equations to fix toString, learn the equalsTest.

 /**
 *This program tests SquareAntiprism.
 *Project 7A
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/21/2022
 */
public class SquareAntiprismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test makes a new object. **/
   @Test public void getMethodsTest() {
      SquareAntiprism.resetCount();
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      Assert.assertEquals("getLabelTest", "Small Example", ex1.getLabel());
      Assert.assertEquals("getEdgeTest", 1.25, ex1.getEdge(), 0.000001);
      Assert.assertEquals("getCountTest", 1, SquareAntiprism.getCount());
    
   }
   
  //  //Test the getLabel method here.
   // @Test public void getLabelTest() {
      // ;
   // }
   
//    //Test the getEdge method here.
   // @Test public void getEdgeTest() {
      // ;
   // }
   
   //Test the setEdge method here.
   // @Test public void setEdgeTest() {
      // ;
   // }
   
    /** This tests the setLabel method. */
   @Test public void setMethodsTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      Assert.assertTrue("setLabelTest", ex1.setLabel("Small Example"));
      Assert.assertFalse("setLabelTest", ex1.setLabel(null));
      Assert.assertTrue("setEdgeTest", ex1.setEdge(1.25));
      Assert.assertFalse("setEdgeTest", ex1.setEdge(-3));
   }
   
   /** This tests the height method. */
   @Test public void heightTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      Assert.assertEquals("heightTest", 1.075, ex1.height(), 0.001);
   }
   
   /** This tests the surfaceArea method. */
   @Test public void surfaceAreaTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      Assert.assertEquals("surfaceAreaTest", 25.914, ex1.surfaceArea(), 0.001);
   }
   
   /** This tests the volume method. */
   @Test public void volumeTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      Assert.assertEquals("volumeTest", 8.336, ex1.volume(), 0.001);
   }
   
   /** This tests the toString method. */
   @Test public void toStringTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      String outputTest = "SquareAntiprism \"Small Example\" with "
         + "edge of " + 1.25 + " units has:"
         + "\n\theight = " + 1.075 + " units"
         + "\n\tsurface area = " + 25.914 + " square units"
         + "\n\tvolume = " + 8.336 + " cubic units";
      //Assert.assertTrue(ex1.toString().contains("\"Small Example\""));
      //Assert.assertEquals(SquareAntiprism.toString, ex1.toString());
      //Assert.assertFalse("falseToString", ex1.toString(null));
      Assert.assertEquals("equalsTest", outputTest, ex1.toString());
   }
   
   //  //Test the getCount method here.
   // @Test public void getCountTest() {
      // ;
   // }
   
    /** This tests the resetCount method. */
   @Test public void resetCountTest() {
      SquareAntiprism.resetCount();
   }
  
  //An instance method that accepts a parameter of type 
  //Object and returns false if the Object is a not a SquareAntiprism;
  // otherwise, when cast to a SquareAntiprism, if it has the same 
  //field values (ignoring case in the label field) as the SquareAntiprism upon 
  //which the method was called, it returns true. Otherwise, it returns false.
    /** This tests the equals method. */
   @Test public void equalsTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      SquareAntiprism fake1 = new SquareAntiprism("Small Example", 1.25);
      SquareAntiprism ex2 = new SquareAntiprism(" Medium Example ", 10.4);
      Assert.assertTrue("equalsTest", ex1.equals(fake1));
      Assert.assertFalse("equalsFalse", ex2.equals(ex1));
      Assert.assertFalse("equalsObject", ex1.equals(null));
    //&& (Math.abs(edge - d.getEdge()) < .000001)); is not tested.
   }
   
   
   
   /** This tests the hashcode method. */
   @Test public void hashCodeTest() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Example", 1.25);
      Assert.assertEquals("hashcodeTest", 0, ex1.hashCode());
   }
   
   /**
    * compareToTest1 checks for equality.
    */
   @Test public void compareToTest1() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Antiprism", 1.25);
      ex1.volume();
   
      SquareAntiprism ex2 = new SquareAntiprism("Medium Antiprism", 10.4);
      ex2.volume();
   
      Assert.assertTrue(ex1.compareTo(ex1) == 0);
   }
   
   /**
    * compareToTest2 checks for 1 less than 2.
    */
   @Test public void compareToTest2() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Antiprism", 1.25);
      ex1.volume();
   
      SquareAntiprism ex2 = new SquareAntiprism("Medium Antiprism", 10.4);
      ex2.volume();
   
      Assert.assertTrue(ex1.compareTo(ex2) < 0);
   }
 
   /**
    * compareToTest3 checks for 2 more than 1.
    */
   @Test public void compareToTest3() {
      SquareAntiprism ex1 = new SquareAntiprism("Small Antiprism", 1.25);
      ex1.volume();
   
      SquareAntiprism ex2 = new SquareAntiprism("Medium Antiprism", 10.4);
      ex2.volume();
   
      Assert.assertTrue(ex2.compareTo(ex1) > 0);
   }
}
