package _excercises.ch03;

public class NumberTest {
  
  public static void main(String[] args) {
    double x = 2.5;
    double y = -1.5;
    int m = 18;
    int n = 4;
    
    // 2.5 + (4 * -1.5) - (2.5 + 4) * -1.5
    System.out.println(x + n * y - (x + n) * y);
    // (18 / 4) + (18 % 4)
    System.out.println(m / n + m % n);
  }
  
}