package _excercises.ch02;

import ch02.account.BankAccount;

/**
 * @author lar02
 *
 */
public class MyBankAccountTester {

  /**
   * @param args
   */
  public static void main(String[] args) {
    BankAccount testAccount = new BankAccount();
    BankAccount testAccount2 = new BankAccount();
    
    System.out.println(testAccount);
    
    testAccount.deposit(50);
    System.out.println(testAccount.getBalance());
    System.out.println("Excepted: 50");
    
    testAccount.withdraw(25);
    System.out.println(testAccount.getBalance());
    System.out.println("Excepted: 25");
    
    System.out.println(testAccount.getAccountNumber());
    System.out.println(testAccount2.getAccountNumber());
    
    System.out.println(testAccount);
  }

}
