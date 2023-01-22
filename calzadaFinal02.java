package FirstYearSecondSem;
import java.util.ArrayList;

public class calzadaFinal02
{	
  public static void main(String[] args) 
  {
  	  ArrayList <String> day = new ArrayList <String>();
	  
	  day.add("Monday");
	  day.add("Tuesday");
	  day.add("Wednesday");
	  day.add("Thursday");
	  day.add("Friday");
	  day.add("Saturday");
	  day.add("Sunday");
	 
	  System.out.println("Display all elements: " + day);
	  day.set(0, "Calzada");
	  System.out.println("The elements: " + day);
	 } 
  }