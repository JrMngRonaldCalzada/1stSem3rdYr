package SecondYearOOP;
import java.util.Scanner;
public class activity1modified
{
    public static void main(String args[] )
    { 
        double balance = 365200.0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Select Your Transaction");
            System.out.println("Select 1 for Withdraw");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Check Balance");
            System.out.println("Select 4 for EXIT");
            System.out.print("Select the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter the amount of money to be withdrawn:");
                withdraw = s.nextDouble();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Transaction Success!");
                    System.out.println("Thank you for choosing 0202 Bank");
                }
                else
                {
                    System.out.println("Insufficient Balance!");
                    System.out.println("Thank you for choosing 0202 Bank");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter the amount of money to be deposited:");
                deposit = s.nextDouble();
                balance = balance + deposit;
                System.out.println("Transaction Success!");
                System.out.println("Thank you for choosing 0202 Bank");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("Thank you for choosing 0202 Bank");
                System.out.println("");
                break;
 
                case 4:
                System.out.println("Goodbye!");
                System.out.println("Thank you for choosing 0202 Bank");
                System.exit(0);
            }
        }
    }
}