package FirstYearSecondSem;

public class secsemprelimronald3 
{
	public static void main(String[] args) 
	{
        int igado = 341 ,reversed = 0;

        while(igado != 0) 
        {
            int digit = igado % 10;
            reversed = reversed * 10 + digit;
            igado /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
	}
}