package ch03.stamp;

/**
*/
public class StampMachine
{
   public static final int FIRST_CLASS_STAMP_PRICE = 44;
   private int balance;

   /**
      Constructs a stamp machine with a zero balance.
   */
   public StampMachine() 
   { 
      balance = 0; 
   }

   /**
      Adds a given number of dollar bills into this machine.
      @param dollars the number of dollar bills
   */
   public void insert(int dollars)
   {
      balance = balance + 100 * dollars;
   }

   /**
      Dispenses first class stamps for the inserted payment.
      @return the number of first class stamps
   */
   public int giveFirstClassStamps()
   {
      int firstClassStamps = balance / FIRST_CLASS_STAMP_PRICE;
      balance = balance - firstClassStamps * FIRST_CLASS_STAMP_PRICE;
      return firstClassStamps;
   }

   /**
      Dispenses penny stamps for the inserted payment.
      @return the number of penny stamps
   */
   public int givePennyStamps()
   {
      int pennyStamps = balance;
      balance = 0;
      return pennyStamps;      
   }
}
