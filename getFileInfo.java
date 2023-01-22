package FirstYearSecondSem;
import java.io.File;

public class getFileInfo {

	public static void main(String[] args)
	{
		File myObj = new File("filename.txt");
		if (myObj.exists())
		{
			System.out.println("File name:" + myObj.getName());
			System.out.println("Absolute path:" + myObj.canWrite());
			System.out.println("Readable " + myObj.canRead());
			System.out.println("File size in bytes " + myObj.length());
		}
		else
		{
			System.out.println("");
		}
	}
}
