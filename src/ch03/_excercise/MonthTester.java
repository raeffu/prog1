package ch03._excercise;

//import ch03._excercise.Month;

public class MonthTester {

  public static void main(String[] args) {
    Month test1 = new Month(2);
    Month test2 = new Month(5);
    Month test3 = new Month(-1);
    Month test4 = new Month(0);
    Month test5 = new Month(13);
    
    System.out.println(test1.getName());
    System.out.println(test2.getName());
    System.out.println(test3.getName());
    System.out.println(test4.getName());
    System.out.println(test5.getName());
  }

}