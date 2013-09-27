package ch09.employees;

public class HourlyEmployee extends Employee
{
   private double hourlyWage;

   /**
      Constructs an hourly employee with a given name and hourly wage.
      @param name the name of this employee
      @param wage the hourly wage 
   */
   public HourlyEmployee(String name, double wage)
   {
      setName(name);
      hourlyWage = wage;
   }
 
   public double weeklyPay(int hoursWorked)
   {
      double pay = hoursWorked * hourlyWage;
      if (hoursWorked > 40)
      {
         pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
      }
      return pay;
   }
}

