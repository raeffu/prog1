package ch03._excercise;

public class EasterSunday {

  // private int year;
  //
  // public EasterSunday(int y) {
  // year = y;
  // }

  public static String getEasterSunday(int y) {
    int a = y % 19;
    int b = y / 100;
    int c = y % 100;
    int d = b / 4;
    int e = b % 4;
    int g = (8 * b + 13) / 25;
    int h = (19 * a + b - d - g + 15) % 30;
    int j = c / 4;
    int k = c % 4;
    int m = (a + 11 * h) / 319;
    int r = (2 * e + 2 * j - k - h + m + 32) % 7;
    int month = (h - m + r + 90) / 25;
    int day = (h - m + r + month + 19) % 32;
    
    return day + " " + Month.getMonth(month) + " " + y;
  }

}
