package SecondYearOOP;

//polymorphism
class CalzadaRonald 
{
  void name() 
  {
      System.out.println("Student Name:");
  }
  void id() 
  {
      System.out.println("Ronald Agacid Calzada");
  }
}
class ID extends CalzadaRonald 
{
  
  void name() 
  {
      System.out.println("Student ID:");
  }
  void id() 
  {
      System.out.println("2020-14378");
  }
}

//abstraction
abstract class RonaldCalzada
{
  abstract void course();
}
class label extends RonaldCalzada
{
  void course(){System.out.println("Student Course:");}
}
class IT extends RonaldCalzada
{
  void course(){System.out.println("Bachelor of Science in Information Technology");}
}

//interface
interface Instructor
{
void nagan();
}
interface Instrctr
{
void fill();
}
class MAAM implements Instructor,Instrctr
{
    public void nagan(){System.out.println("Instructor:");}
    public void fill(){System.out.println("Engr. Cherilyn Babila");}
}


public class main
{
	public static void main(String[] args)
	{
		CalzadaRonald A = new CalzadaRonald();
		CalzadaRonald B = new ID();
		
		
		
		A.name();
		A.id();
		
		B.name();
		B.id();
		
		
		RonaldCalzada R = new label();
		RonaldCalzada C = new IT();
		R.course();
		C.course();
		
		MAAM M = new MAAM();
		M.nagan();
		M.fill();
	}
}