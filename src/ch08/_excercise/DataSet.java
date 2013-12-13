package ch08._excercise;

import java.util.ArrayList;

/**
 * Computes the average of a set of data values.
 */
public class DataSet {
  private double sum;
  private double maximum;
  private double minimum;
  private ArrayList<Double> median;
  private int count;

  /**
   * Constructs an empty data set with a given measurer.
   * 
   * @param aMeasurer
   *          the measurer that is used to measure data values
   */
  public DataSet() {
    sum = 0;
    count = 0;
    maximum = 0;
    minimum = 0;
    median = new ArrayList<Double>();
  }

  /**
   * Adds a data value to the data set.
   * 
   * @param x
   *          a data value
   */
  public void add(Measurer aMeasurer, Object x) {
    double value = aMeasurer.measure(x);

    sum = sum + value;
    if (count == 0) {
      maximum = value;
      minimum = value;
      median.add(value);
    }
    else if (maximum < value)
      maximum = value;
    else if (minimum > value)
      minimum = value;
    
    if (count != 0) {
      boolean isBiggest = true;
      for (int i = 0; i < median.size(); i++) {
        if (value <= median.get(i)) {
          median.add(i, value);
          isBiggest = false;
          break;
        }
      }
      if(isBiggest) median.add(value);
    }
    
    System.out.println(median.toString());
    
    count++;
  }

  /**
   * Gets the average of the added data.
   * 
   * @return the average or 0 if no data has been added
   */
  public double getAverage() {
    if (count == 0)
      return 0;
    else
      return sum / count;
  }

  /**
   * Gets the largest of the added data.
   * 
   * @return the maximum or 0 if no data has been added
   */
  public double getMaximum() {
    return maximum;
  }

  /**
   * Gets the smallest of the added data.
   * 
   * @return the minimum or 0 if no data has been added
   */
  public double getMinimum() {
    return minimum;
  }

  /**
   * Gets the median of the added data.
   * 
   * @return the median or 0 if no data has been added
   */
  public double getMedian() {
    int middle = (median.size() -1) / 2;
    
    System.out.println(middle);
    
    if (median.size() % 2 == 0) {
      return (median.get(middle) + median.get(middle+1)) / 2;
    }
    else {
      return median.get(Math.round(middle));
    }
  }
}
