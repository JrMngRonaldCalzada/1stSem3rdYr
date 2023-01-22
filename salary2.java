package FirstYearSecondSem;
import java.util.Scanner;

public class salary2 
{
	public static void main(String[] args)
	   {
	      final int EMPLOYEES = 5; 
	      double payRate;          
	      double grossPay;         
	      double overtime;          
	      int[] hours = new int[EMPLOYEES];
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the hours worked by " + EMPLOYEES + " who all earn " + "the same hourly rate.");
	      for (int index = 0; index < EMPLOYEES; index++)
	      {
	         System.out.print( "Employee #" + (index + 1) + ": ");
	         hours[index] = in.nextInt();
	      }
	      System.out.print("Enter each employee's hourly rate: ");
	      payRate = in.nextDouble();
	      System.out.println( "Here is the gross pay for each employee:");
	      for (int index = 0; index < EMPLOYEES; index++)
	      {
	         if (hours[index] > 40)
	         {
	            grossPay = 40 * payRate;
	            overtime = (hours[index] - 40) * (1.5 * payRate);
	            grossPay += overtime;
	         }
	         else
	            grossPay = hours[index] * payRate;
	         System.out.println("Employee #" + (index + 1) + ": $" + grossPay);
      }
   }
}