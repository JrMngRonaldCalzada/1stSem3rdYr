package SecondYearOOP;

class Shape 
{
	public void area()
	{
		System.out.println("Find area");
	}
	public void area(int r)
	{
		System.out.println("Circle area = "+3.14*r*r);
	}
	public void area(double b, double h)
	{
		System.out.println("Triangle area="+0.5*b*h);
	}
	public void area(int l, int w)
	{
		System.out.println("Rectangle area="+l*w);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Shape myShape = new Shape();
		
		myShape.area();
		myShape.area(5);
		myShape.area(6.0,1.2);
		myShape.area(6,2);
	}
}