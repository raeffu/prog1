package ch08._excercise;

import java.awt.Rectangle;

/**
 * This program demonstrates the use of an inner class.
 */
public class DataSetTester
{
  public static void main(String[] args)
  {
    class RectangleMeasurer implements Measurer
    {
      public double measure(Object anObject)
      {
        Rectangle aRectangle = (Rectangle) anObject;
        double area = aRectangle.getWidth() * aRectangle.getHeight();
        return area;
      }
    }

    class StringMeasurer implements Measurer
    {
      public double measure(Object anObject)
      {
        String aString = (String) anObject;
        double length = aString.length();
        return length;
      }
    }

    Measurer mR = new RectangleMeasurer();
    Measurer mS = new StringMeasurer();

    DataSet dataR = new DataSet();
    DataSet dataS = new DataSet();

    dataR.add(mR, new Rectangle(5, 10, 20, 30));
    dataR.add(mR, new Rectangle(5, 10, 40, 20));
    dataR.add(mR, new Rectangle(10, 20, 30, 40));
    dataR.add(mR, new Rectangle(20, 30, 5, 15));
    
    dataS.add(mS, "1d");
    dataS.add(mS, "abc");
    dataS.add(mS, "a");
    dataS.add(mS, "aaaa");

//  Rectangle
    System.out.println("Average area: " + dataR.getAverage());
    System.out.println("Maximum area rectangle: " + dataR.getMaximum());
    System.out.println("Minimum area rectangle: " + dataR.getMinimum());
    System.out.println("Median area rectangle: " + dataR.getMedian());
    
//  String
    System.out.println("Average string length: " + dataS.getAverage());
    System.out.println("Maximum string length: " + dataS.getMaximum());
    System.out.println("Minimum string length: " + dataS.getMinimum());
    System.out.println("Median string length: " + dataS.getMedian());
  }
}
