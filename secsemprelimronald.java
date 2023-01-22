package FirstYearSecondSem;
import java.util.Scanner;

public class secsemprelimronald
{
	public static void main(String[] args) 
	{
		int n=10;
		int[] kamutig = new int[n]; 
		Scanner bato = new Scanner(System.in);
		
		 int length = kamutig.length; 
		
		 System.out.println( "INDEX: "); 
		  System.out.print("index0  ");
		  kamutig[0] = bato.nextInt();
		  System.out.print("index1  ");
		  kamutig[1] = bato.nextInt();
		  System.out.print("index2  ");
		  kamutig[2] = bato.nextInt();
		  System.out.print("index3  ");
		  kamutig[3] = bato.nextInt();
		  System.out.print("index4  ");
		  kamutig[4] = bato.nextInt();
		  System.out.print("index5  ");
		  kamutig[5] = bato.nextInt();
		  System.out.print("index6  ");
		  kamutig[6] = bato.nextInt();
		  System.out.print("index7  ");
		  kamutig[7] = bato.nextInt();
		  System.out.print("index8  ");
		  kamutig[8] = bato.nextInt();
		  System.out.print("index9  ");
		  kamutig[9] = bato.nextInt();
		  System.out.print("index9  ");
				  
		  for (int i = 0; i < length; i++) { 
	            kamutig[i] = kamutig[i] + 2; 
		  
	      System.out.println(" Increments: ");   
		  System.out.println(" " + kamutig[i]); 

	}
	}
}
