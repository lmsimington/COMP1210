import java.text.DecimalFormat;
    
 /**
 *This program is for a square antiprism.
 *Project 7A
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 03/17/2022
 */
 
public class SquareAntiprism implements Comparable<SquareAntiprism> {
	// constant fields

   // instance variables (can be used within the class)
   private String label = "";
   private double edge = 0;
   private static int count = 0;
   
   /**
    * SquareAntiprism is the main class.
    * @param labelIn holds label.
    * @param edgeIn holds edges.
    */
   public SquareAntiprism(String labelIn, double edgeIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
   /**
    * getLabel retrieves the label.
    * @return label holds the label.
    */
   //getLabel takes none, returns String.
   public String getLabel() {
      return label;
   }
   
   /**
    * setLabel returns the label.
    * @return true if set and false if not.
    * @param labelIn holds the label to be set.
    */
   //setLabel takes String, returns boolean.
   public boolean setLabel(String labelIn) {
      boolean isValid = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isValid = true;
      }
      return isValid;
   }
   
   /**
    * getEdge retrieves the edge.
    * @return edge returns the edge.
    */
   //getEdge accepts none, returns double.
   public double getEdge() {
      return edge;
   }
   
   /**
    * setEdge sets the edge value.
    * @return true if edge is set, and false if not.
    * @param edgeIn accepts the edge value.
    */
   //setEdge takes double, returns boolean.
   public boolean setEdge(double edgeIn) {
      boolean isValid = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isValid = true;
      }
      return isValid;
   
   }
   
   /**
    * height holds the height.
    * @return height which holds height.
    */
   //height accepts none, returns double.
   public double height() {
      //double height = (Math.sqrt(1 - (Math.pow(1 / Math.cos(Math.PI / 16),
         //+2) / 4) * edge));
      double height = Math.sqrt(1 - Math.pow(1 / Math.cos(
         +Math.PI / 16), 2) / 4) * edge;
      return height;
   }
   
   /**
    * surfaceArea calculates the surface area.
    * @return surfaceArea which holds itself.
    */
   //surfaceArea accepts none, returns double.
   public double surfaceArea() {
      double surfaceArea = ((4 * ((Math.cos(Math.PI / 8))
         / (Math.sin(Math.PI / 8)) 
         + Math.sqrt(3)) * Math.pow(edge, 2)));
         
      //double surfaceArea = (4 * (Math.cos(Math.PI/8))/(Math.sin
      //(Math.PI/8))+Math.sqrt(3)*(Math.pow(edge, 2)));
      //double surfaceArea = 4 * 
      return surfaceArea;
   }
   
   /**
    * volume holds calculates the volume.
    * @return volume holds the volume.
    */
   //volume accepts none, returns double.
   public double volume() {
      //double volume = 8 * (Math.sqrt(4 * Math.pow(
         // +(Math.cos(Math.PI / 16)), 2) - 1) * (Math.sin(
         // +3 * Math.PI) / 16) * Math.pow(edge, 
         // +3) / (12 * Math.pow((Math.sin(Math.PI / 8)), 2)));
         
      double volume = 8 * (Math.sqrt(4 * Math.pow(Math.cos(
         +Math.PI / 16), 2) - 1) * Math.sin((3 * Math.PI) / 16) 
         * Math.pow(edge, 3) / (12 * Math.pow(Math.sin(Math.PI / 8), 2)));
      return volume;
   }
   
   /**
    * toString holds the print info.
    * @return output which holds the print statements.
    */
   //toString returns String and has format.
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "SquareAntiprism " + "\"" + label + "\"" + " with "
         + "edge of " + edge + " units has:"
         + "\n\theight = " + df.format(height()) + " units"
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
   
   /**
    * getCount is a static method.
    * @return count returns the count value.
    */
   //getCount static method accepts none, returns int.
   public static int getCount() {
      return count;
   }
   
   /**
    * resetCount is a static method.
    * this area resets the count value.
    */
   //resetCount static method accepts none, returns none, sets count to 0.
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * equals is an instance method.
    * @param obj holds an object.
    * @return false or given.
    */
   //equals instance method accepts Object.
   public boolean equals(Object obj) {
   
      if (!(obj instanceof SquareAntiprism)) {
         return false;
      }
      else {
         SquareAntiprism d = (SquareAntiprism) obj;
         return (label.equalsIgnoreCase(d.getLabel())
            && (Math.abs(edge - d.getEdge()) < .000001));
      }
   }
   
   /**
    * hashcode is needed because of equals.
    * @return zero returns zero.
    */
   //hashCode() accepts none, returns int.
   public int hashCode() {
      int zero = 0;
      return zero;
   }
   
    /**
    * compareTo is used for the SquareAntiprism objects.
    * @param obj is used to store objects.
    * @return -1/0/1 based on met criteria.
    */
   public int compareTo(SquareAntiprism obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0; //consider them equal and return 0
      }
      else if (this.volume() < obj.volume()) {
         return -1; //should return a negative number
      }
      else {
         return 1; //should return a positive number
      }
   }
   
}

