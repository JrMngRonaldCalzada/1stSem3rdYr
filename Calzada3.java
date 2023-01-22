package ronald;
import java.util.Scanner;

public class Calzada3
{
	public static void main(String[] args)
	{
		int ChiefBato;
		   
	    Scanner input = new Scanner(System.in);
	    System.out.println("Input an integer:");
	   
	    while ((ChiefBato = input.nextInt()) != 0) {
	      System.out.println("You entered " + ChiefBato);
	      System.out.println("Input an integer:");
	    }
	   
	    System.out.println("Out of loop");
	}
}