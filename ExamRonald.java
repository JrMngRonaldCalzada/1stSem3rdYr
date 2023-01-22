package SecondYearOOP;
import java.util.Scanner;

public class ExamRonald 
{
	public static void main(String[] args) {
		   int i, q, z, c, b;
		   int x=0;
		   String[] name = new String[30];
		  
		   String[] course = new String[30];
		  
		  
		   int menuChoice;

		   Scanner input = new Scanner (System.in);

		   start:
		   do{

		       System.out.println("Student Record Menu");
		       System.out.println("1. Add Student");
		       System.out.println("2. View Student");
		       System.out.println("3. Search Student");	
		       System.out.println("4. Exit");
		       System.out.println("Enter a choice: ");
		       menuChoice = input.nextInt();

		       if (menuChoice==1)
		       {
		           for (z=x; z<=29; z++)
		           {
		               System.out.println("Full name:");
		               name [z] = input.nextLine();
		               System.out.println("Course:");
		               course [z] = input.next();
		        
		               
		               x++;
		               continue start;
		           }
		       }
		               else if (menuChoice==2)
		               {
		                   for (i=0; i<x; i++)
		                   {
		                       System.out.println(name[i] + course [i]);
		                   }
		               }
		   } 
		   while (menuChoice<4);
		}
	}