package FirstYearSecondSem;
import java.util.Scanner;

public class midtermExam2 
{
	public static void main(String[] args) 
	{
	    try (Scanner input = new Scanner(System.in)) 
	    {	
		System.out.println("Enter first integer: ");
		
		int igado = input.nextInt();
		
		System.out.println("Enter second integer: ");
		
		int kilawin = input.nextInt();
		int ciao = igado < kilawin ? igado : kilawin;
		while (igado % ciao != 0 || kilawin % ciao != 0) 
		{
			ciao--;
		}
		System.out.println("The greatest common divisor for " + igado + " and " + kilawin + " is " + ciao);
	    }
	}
}