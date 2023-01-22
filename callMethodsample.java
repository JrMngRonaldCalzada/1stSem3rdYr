package FirstYearSecondSem;

public class callMethodsample 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from the main method");
		
		for(int myMethod=0; myMethod<5; myMethod++)
		{
		displayMessage(myMethod);
		}
		System.out.println("Back from the main method");
		
	}
	public static void displayMessage(int myMethod)
	{
		System.out.println("Hello from the displayMessage main method");
	}
}
