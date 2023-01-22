package FirstYearSecondSem;

public class RonaldQuiz1d 
{
	public static void main(String[] args) 
	{
		int [] ronald = new int [] {10,16,24,72,43,35,23,84,46,92};
		int min = ronald[0];
		for (int talong = 1; talong <  ronald[0]; talong++)
			if(min > ronald[talong]) min = ronald[talong];
		System.out.println(min);
	}
}