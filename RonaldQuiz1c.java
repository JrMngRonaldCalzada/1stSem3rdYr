package FirstYearSecondSem;

public class RonaldQuiz1c 
{
	public static void main(String[] args)
	{
		int [] ronald = new int [] {7,14,21,28,35};
		int sum = 0;
		for(int ampalaya = 0; ampalaya<ronald.length; ampalaya++)
		{
			sum += ronald[ampalaya];
	}
	System.out.println("Sum of all element:" + sum);
	}
}