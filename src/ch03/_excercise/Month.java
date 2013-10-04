package ch03._excercise;

public class Month {
  
  private int month;
  private static final String[] MONTH_NAMES = {"Januar", "Februar", "März",
                                               "April", "Mai", "Juni", "Juli",
                                               "August", "September",
                                               "Oktober", "November",
                                               "Dezember"};
  
  public Month(int m) {
    month = m;
  }
  
  public String getName() {
    if (month <= 0 || month > 12) {
      return "null";
    }
    
    return MONTH_NAMES[month-1];
  }
  
  public static String getMonth(int m) {
    if (m <= 0 || m > 12) {
      return "null";
    }
    
    return MONTH_NAMES[m-1];
  }
}
