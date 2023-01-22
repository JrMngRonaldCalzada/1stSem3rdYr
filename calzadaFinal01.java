package FirstYearSecondSem;
import java.io.FileWriter;
import java.io.IOException;

public class calzadaFinal01 
{
	public static void main(String[] args) 
	{
	    try {
	        FileWriter myWriter = new FileWriter("filename.txt");
	        myWriter.write("Hello World!");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) 
	    {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
	 }
}