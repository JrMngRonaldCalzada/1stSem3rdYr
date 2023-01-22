package SecondYearOOP;

public class quizSept24
{
	String name;
    void fname() 
    {
        System.out.println("Ronald");        
    }
     void lname()
     {
        System.out.println("Calzada");
     }m
     void snum() 
     {
        System.out.println("SSS number: 101-00-010");
     }
     void gross() 
     {
        System.out.println("Gross sales is 10000.00");
     }
     void commission() 
     {
        System.out.println("Commission Rate: 0.06"); 
        
     }
}
class Ronald extends quizSept24 
{    
     void CommissionEmployee() 
     {
        System.out.println("Ronald A. Calzada");    
     }
     void gsales() 
     {
        System.out.println("Gross Sales: 5000.00");
	}
     void CommissionRate() 
     {
            System.out.println("Commission Rate: 500000.00");
     }
}

public class Hello
{
	public static void main(String[] args)
	{
    Ronald bato = new Ronald();
    System.out.println("Employee: ");
    bato.fname();
    bato.lname();
    bato.snum();
    bato.gross();
    bato.commission();
    System.out.println(" ");
    System.out.println("Update Employee Information:");
    bato.CommissionEmployee();
    bato.snum();
    bato.gsales();
    bato.CommissionRate();
	}
}