package FirstYearSecondSem;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class midtermExam 
{
	public static void main(String[] args) 
	{
		int[][] m = getArray();
	    System.out.println("\nSum of all elements is " + sum(m));
	    }
	    public static int[][] getArray() 
	    {
	        Scanner input = new Scanner(System.in);
	        int[][] sum = new int[3][6];
	        System.out.println("Enter " + sum.length + " rows and " + sum[0].length + " columns: ");
	        for (int m = 0; m < sum.length; m++)
	            for (int kilawin = 0; kilawin < sum[m].length; kilawin++)
	            	sum[m][kilawin] = input.nextInt();
	        return sum;
	    }

	    public static int sum(int[][] ChiefBato) {
	        int total = 0;
	        for (int row = 0; row < ChiefBato.length; row++) {
	            for (int column = 0; column < ChiefBato[row].length; column++) 
	            {
	                total += ChiefBato[row][column];
	            }
	        }
	        return total;
	    }
	}