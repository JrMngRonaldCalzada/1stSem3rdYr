package FirstYearSecondSem;
import java.util.Scanner;

public class tryprelim {

	public static void main(String[] args) 
	{
		int n=10;
		int[] arr = new int[n]; 
		Scanner bato = new Scanner(System.in);
		
		 int length = arr.length; 
		
		 System.out.println( "INDEX:   VALUES: "); 
		  System.out.print("index0  ");
		  arr[0] = bato.nextInt();
		  System.out.print("index1  ");
		  arr[1] = bato.nextInt();
		  System.out.print("index2  ");
		  arr[2] = bato.nextInt();
		  System.out.print("index3  ");
		  arr[3] = bato.nextInt();
		  System.out.print("index4  ");
		  arr[4] = bato.nextInt();
		  System.out.print("index5  ");
		  arr[5] = bato.nextInt();
		  System.out.print("index6  ");
		  arr[6] = bato.nextInt();
		  System.out.print("index7  ");
		  arr[7] = bato.nextInt();
		  System.out.print("index8  ");
		  arr[8] = bato.nextInt();
		  System.out.print("index9  ");
		  arr[9] = bato.nextInt();
		  System.out.print("index9  ");
				  
		  for (int i = 0; i < length; i++) { 
	            arr[i] = arr[i] + 2; 
		  
	      System.out.println(" Increments: ");   
		  System.out.println(" " + arr[i]); 

	}
	}
}
