package SecondYearOOP;
import java.util.*;

public class Circle 
{
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Circle1:");
        double radius = sc.nextDouble();
        double area = Math.PI*(radius*radius);
        System.out.println("Area:" + area);
        double Perimeter = Math.PI*2*radius;
        System.out.println("Perimeter:" + Perimeter);
        	System.out.println("Circle2:");
        	double radius1 = sc.nextDouble();
        	double area1 = Math.PI*(radius1*radius1);
        	System.out.println("Area:" + area1);
        	double Perimeter1 = Math.PI*2*radius1;
        	System.out.println("Perimeter:" + Perimeter1);
        		System.out.println("Circle3:");
        		double radius2 = sc.nextDouble();
        		double area2 = Math.PI*(radius2*radius2);
        		System.out.println("Area:" + area2);
        		double Perimeter2 = Math.PI*2*radius2;
        		System.out.println("Perimeter:" + Perimeter2);	
        			System.out.println("Circle4:");
        			double radius3 = sc.nextDouble();
        			double area3 = Math.PI*(radius3*radius3);
        			System.out.println("Area:" + area3);
        			double Perimeter3 = Math.PI*2*radius3;
        			System.out.println("Perimeter:" + Perimeter3);
    }
}