package SecondYearOOP;

public class act2java 
{
	public static void main(String[] args) 
	{
		IgadoClass igado = new IgadoClass();
		
		igado.obj1();
		igado.obj2();
		igado.obj3();
		igado.obj4();
	}
}

class KilawinClass
{
	public void obj1()
	{
		System.out.println("Ronald");
	}
	public void obj2()
	{
		System.out.println("Game");
	}
}

class IgadoClass extends KilawinClass
{
	public void obj3()
	{
		System.out.println("Developer");
		
	}
	public void obj4()
	{
		System.out.println("Playing");
	}
}