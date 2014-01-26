package _excercises.ch08;

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

    DataSet data = new DataSet();
//    DataSet dataS = new DataSet();

    data.add(mR, new Rectangle(5, 10, 20, 30));
    data.add(mR, new Rectangle(5, 10, 40, 20));
    data.add(mR, new Rectangle(10, 20, 30, 40));
    data.add(mR, new Rectangle(20, 30, 5, 15));
    
    data.add(mS, "1d");
    data.add(mS, "abc");
    data.add(mS, "a");
    data.add(mS, "aaaa");

////  Rectangle
//    System.out.println("Average area: " + data.getAverage());
//    System.out.println("Maximum area rectangle: " + data.getMaximum());
//    System.out.println("Minimum area rectangle: " + data.getMinimum());
//    System.out.println("Median area rectangle: " + data.getMedian());
//    
////  String
//    System.out.println("Average string length: " + data.getAverage());
//    System.out.println("Maximum string length: " + data.getMaximum());
//    System.out.println("Minimum string length: " + data.getMinimum());
//    System.out.println("Median string length: " + data.getMedian());
    
//  Generic
    System.out.println("Average  : " + data.getAverage());
    System.out.println("Maximum  : " + data.getMaximum());
    System.out.println("Minimum  : " + data.getMinimum());
    System.out.println("Median   : " + data.getMedian());
  }
}
