package _excercises.ch03;

public class CelciusConverter {
  
  public static final double POUND_IN_G = 453.592;
  public static final double OUNCE_IN_G = 28.3495;
  private static final double F_OFFSET = 32;
  private static final double F_FACTOR = 1.8;
  
  public static double toCelcius(double fahrenheit) {
    return (fahrenheit - F_OFFSET) / F_FACTOR;
  }
  
  public static double toFahrenheit(double celcius) {
    return (celcius * F_FACTOR) + F_OFFSET;
  }
  
}
