package ch02.account;

/**
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {
  private double balance;
  private static int uniqueAccountNumber = 0;
  private int accountNumber;

  /**
   * Constructs a bank account with a zero balance.
   */
  public BankAccount() {
    balance = 0;
    incUniqueAccountNumber();
    this.accountNumber = uniqueAccountNumber;
  }

  /**
   * Constructs a bank account with a given balance.
   * 
   * @param initialBalance
   *          the initial balance
   */
  public BankAccount(double initialBalance) {
    balance = initialBalance;
    incUniqueAccountNumber();
    this.accountNumber = uniqueAccountNumber;
  }

  /**
   * Deposits money into the bank account.
   * 
   * @param amount
   *          the amount to deposit
   */
  public void deposit(double amount) {
    balance = balance + amount;
  }

  /**
   * Withdraws money from the bank account.
   * 
   * @param amount
   *          the amount to withdraw
   */
  public void withdraw(double amount) {
    balance = balance - amount;
  }

  /**
   * Gets the current balance of the bank account.
   * 
   * @return the current balance
   */
  public double getBalance() {
    return balance;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  private void incUniqueAccountNumber() {
    uniqueAccountNumber += 1;
  }
}
