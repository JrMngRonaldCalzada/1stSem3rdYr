package ronald;
import java.util.Scanner;

public class Calzada2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
				   
		System.out.print("Enter the 1st number: ");
	    int ChiefBato1 = in.nextInt();
				   
		System.out.print("Enter the 2nd number: ");
		int ChiefBato2 = in.nextInt();
				   
		System.out.print("Enter the 3rd number: ");
		int ChiefBato3 = in.nextInt();
				   
				   
		if (ChiefBato1 > ChiefBato2)
		if (ChiefBato1 > ChiefBato3)
		System.out.println("The greatest: " + ChiefBato1);
				   
	    if (ChiefBato2 > ChiefBato1)
		if (ChiefBato2 > ChiefBato3)
		System.out.println("The greatest: " + ChiefBato2);
				   
		if (ChiefBato3 > ChiefBato1)
		if (ChiefBato3 > ChiefBato2)
		System.out.println("The greatest: " + ChiefBato3);
	}
}