package ronald;
import java.util.Scanner;

public class Calzada1
{
	public static void main(String[] args)
	{
		 Scanner reader = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int ChiefBato = reader.nextInt();

	        if(ChiefBato % 2 == 0)
	            System.out.println(ChiefBato + " is a even number");
	        else
	            System.out.println(ChiefBato + " is a odd number");
	}
}