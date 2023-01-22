package SecondYearOOP;

class Shapes {
	public void area() {
		System.out.println("The formula for the area of ");
	}
}
class Triangle extends Shapes {
	public void area() {
		System.out.println("Triangle is 1/2 * base * height ");
	}
}
class Circle extends Shapes {
	public void area() {
		System.out.println("Circle is 3.14 * radius * radius ");
	}
}
public class Main 
{
	 public static void main(String [] args) {
		 Shapes myShape = new Shapes();
		 Shapes myTriangle = new Triangle();
		 Shapes myCircle = new Circle();
		 
		 myShape.area();
		 myTriangle.area();
		 myShape.area();
		 myCircle.area();
	   }
	}