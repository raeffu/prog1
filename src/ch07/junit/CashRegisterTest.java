//package ch07.junit;
//
//import org.junit.Test;
//import org.junit.Assert;
//
//public class CashRegisterTest
//{
//   private static final double EPSILON = 1E-12;
//
//   @Test public void twoPurchases()
//   {
//      CashRegister register = new CashRegister();
//      register.recordPurchase(0.75);
//      register.recordPurchase(1.50);
//      register.enterPayment(2, 0, 5, 0, 0);
//      double expected = 0.25;
//      Assert.assertEquals(expected, register.giveChange(), EPSILON);
//   }
//
//   @Test public void testZeroBalance() 
//   {
//      CashRegister register = new CashRegister();
//      register.recordPurchase(2.25);
//      register.recordPurchase(19.25);
//      register.enterPayment(21, 2, 0, 0, 0);
//      Assert.assertEquals(0, register.giveChange(), EPSILON);
//   }
//
//   // More test cases 
//   // . . .
//}
