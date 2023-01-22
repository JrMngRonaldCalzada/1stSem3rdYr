package FirstYearSecondSem;
import java.util.Scanner;

public class kamatis 
{
	public static void main(String[] args) 
	{
		final int employees = 3;
		int[] hours = new int[employees];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the hours worked:");
		
		System.out.println("viy");
		hours[0] = in.nextInt();
		
		System.out.println("cong");
		hours[1] = in.nextInt();
		
		System.out.println("waldo");
		hours[2] = in.nextInt();
		
		System.out.println("The hours entered are:");
		System.out.println(hours[0]);
		System.out.println(hours[1]);
		System.out.println(hours[2]);
	}
	}	