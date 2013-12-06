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

    DataSet data = new DataSet();

    data.add(mR, new Rectangle(5, 10, 20, 30));
    data.add(mR, new Rectangle(10, 20, 30, 40));
    data.add(mR, new Rectangle(20, 30, 5, 15));
    
    data.add(mS, "1d");
    data.add(mS, "abc");
    data.add(mS, "a");

    System.out.println("Average area: " + data.getAverage());
//    System.out.println("Expected: 625");

//    Rectangle max = (Rectangle) data.getMaximum();
//    System.out.println("Maximum area rectangle: " + max);
//    System.out.println("Expected: "
//        + "java.awt.Rectangle[x=10,y=20,width=30,height=40]");
  }
}
