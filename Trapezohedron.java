import java.text.DecimalFormat;

/**
 *This program will give info about the shape.
 *Project 4
 *@author LaShante' Simington
 *COMP 1210 Section 001
 *@version 02/11/2022
 */
 
public class Trapezohedron
{

//Fields
   private String label = "";
   private String color = "";
   private double shortEdge = 0;

//Constructors

 /**
  *This area refers to the constructors.
  *@param labelIn is for holding the label.
  *@param colorIn is for holding the color.
  *@param shortEdgeIn is for holding short edge length.
  */
   public Trapezohedron(String labelIn, String colorIn, double shortEdgeIn)
   {
      setLabel(labelIn);
      setColor(colorIn);
      setShortEdge(shortEdgeIn);
   }

//Methods//

 /**
  *This area refers to the getLabel Method.
  * getLabel, accepts none, returns string.
  *@return label will return the label name.
  */
   public String getLabel() {
      return label;
   }

 /**
  *This area refers to the setLabel Method.
  *@param labelIn is for checking the label.
  * setLabel, takes a string, returns a boolean.
  *@return isValid returns the boolean.
  */
   public boolean setLabel(String labelIn) {
      boolean isValid = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isValid = true;
      }
      return isValid;
   }

 /**
  *This area refers to the getColor Method.
  *getColor, accepts none, returns string.
  *@return color returns the color input.
  */
   public String getColor() {
      return color;
   }

 /**
  *This area refers to the setColor Method.
  *@param colorIn is for getting the color.
  *setColor, takes a string, returns boolean.
  *@return isValid is used for the boolean.
  */
   public boolean setColor(String colorIn) {
      boolean isValid = false;
      if (colorIn != null) {
         color = colorIn.trim();
         isValid = true;
      }
      return isValid;
   }

/**
  *This area refers to the getShortEdge Method.
  *getShortEdge, accepts none, returns double.
  *@return isValid is used for the boolean.
  */
   public double getShortEdge() {
      return shortEdge;
   }

/**
  *This area refers to the setShortEdge Method.
  *@param shortEdgeIn is for getting the short edge value.
  *setShortEdge, accepts double, returns boolean.
  *@return isValid is used for the boolean.
  */
   public boolean setShortEdge(double shortEdgeIn) {
      boolean isValid = false;
      if (shortEdgeIn > 0) {
         shortEdge = shortEdgeIn;
         isValid = true;
      }
      return isValid;
   }

/**
  *This area refers to the surfaceArea Method.
  *surfaceArea, accepts one, returns double.
  *@return the surface area.
  */
   public double surfaceArea() {
      return (Math.sqrt((25 / 2.0) * (5 + Math.sqrt(5)))) 
         * (Math.pow(edgeLengthAntiprism(), 2));
   }

 /**
  *This area refers to the edgeLengthAntiprism Method.
  *EdgeLengthAntiprism, accepts none, returns double.
  *@return the edgeLengthAntiprism value.
  */
   public double edgeLengthAntiprism() {
      return (shortEdge / ((Math.sqrt(5) - 1) / 2));
   }

 /**
  *This area refers to the longEdge Method.
  * LongEdge, accepts none, returns double.
  *@return the value for longEdge.
  */
   public double longEdge() {
      return ((Math.sqrt(5) + 1) / 2) * edgeLengthAntiprism();
   }
 
 /**
  *This area refers to the volume Method.
  *volume, accepts none, returns double.
  *@return the value for volume.
  */
   public double volume() {
      return (5.0 / 12) * (3 + Math.sqrt(5)) 
         * Math.pow(edgeLengthAntiprism(), 3);
   }

 /**
  *This area refers to the toString Method.
  * toString, returns a string.
  *@return output will show the statements.
  */
   public String toString() { 
      DecimalFormat newFormat = new DecimalFormat("#,##0.0###");
   
      String output = ("Trapezohedron \"" + label + "\" is \"" + color 
            + "\" with 20 edges and 12 vertices.");
      output += ("\n\tedge length antiprism = " 
         + newFormat.format(edgeLengthAntiprism()) 
         + " units")
         + ("\n\tshort edge = " + newFormat.format(shortEdge) + " units")
         + ("\n\tlong edge = " + newFormat.format(longEdge()) + " units")
         + ("\n\tsurface area = " + newFormat.format(surfaceArea()) 
         + " square units")
         + ("\n\tvolume = " + newFormat.format(volume()) + " cubic units");
      return output;
   }
}