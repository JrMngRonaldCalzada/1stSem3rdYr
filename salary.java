package FirstYearSecondSem;
import java.util.Scanner;

public class salary
{
    public static void main(String[] args) {
        
        System.out.println("Enter the hours worked by 5 employees");
        Scanner input = new Scanner(System.in);
        
        int hoursWorked[] = new int[5];
        int grossPay[] = new int [hoursWorked.length];
        int hourlyRate;
        int i;
       
        for(i = 0; i < hoursWorked.length; i++)
        {
            System.out.print("EMPLOYEE " + (i+1) + ": ");
            hoursWorked[i] = input.nextInt();
        }
        System.out.print("Enter the hourly rate for each employee: ");
        hourlyRate = input.nextInt();
        
        System.out.println("Employees gross pay: ");
       
        for(i = 0; i < hoursWorked.length; i++)
        {
            grossPay[i] = hourlyRate * hoursWorked[i];
        }
        for(i = 0; i < hoursWorked.length; i++){
            System.out.println("EMPLOYEE " + (i+1) + " "  + grossPay[i]);
        }  
    }
}