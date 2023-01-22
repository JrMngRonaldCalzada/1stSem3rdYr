package FirstYearSecondSem;

public class coding 
{
	public static void main(String[] args) 
	{
		int x=10;
		System.out.println("I am pasing values to displayValue");
		displayValue(5);
		displayValue(x);
		displayValue(x*4);
		displayValue(Integer.parseInt("700"));
		System.out.println("Now I am back to main");
	}
	public static void displayValue(int num)
	{
		System.out.println("The value is " + num);
	}
}