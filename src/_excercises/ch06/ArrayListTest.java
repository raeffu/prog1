package _excercises.ch06;

public class ArrayListTest {

  public static void main(String[] args) {
    ArrayListInt test = new ArrayListInt(2);
    
//    testing add
    System.out.println("add");
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.add(2);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.add(1);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.add(3);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.add(4);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.add(5);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    
//    testing remove
    System.out.println("remove");
    test.remove(2);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    
//  test get
    System.out.println("get");
    System.out.println(test.get(1));
    System.out.println(">" + test.getSize() + "<");
//  test set
    System.out.println("set");
    test.set(1, 3);
    System.out.println(test.get(1));
    System.out.println(">" + test.getSize() + "<");
    System.out.println(test);
    
//    test insert
    System.out.println("insert");
    test.insert(1, 6);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.insert(0, 7);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.insert(7, 8);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.insert(6, 13);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.insert(6, 9);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.insert(4, 10);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.insert(0, 11);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
//    test.insert(22, 12);
//    System.out.println(test);
    
    test.remove(8);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.remove(10);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.remove(7);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    test.remove(0);
    System.out.println(test);
    System.out.println(">" + test.getSize() + "<");
    
  }

}
