package SecondYearOOP;
import java.util.*;

class employee
{
    Scanner s=new Scanner(System.in);
    int emp_id;
    String empname;
    
    {
        System.out.println("enter name::");
       
        System.out.println("enter empid::");
       
    }
}
class salary extends employee
{
    ;
    double monthly_salary;
    String designation;
    salary(double monthly_salary,String designation,String empname)
    {
       
       this.empname=empname;
       this.designation=designation;
       this.monthly_salary=monthly_salary;
    }   
    void condition()
    {
        System.out.println("monthly salary is:"+monthly_salary);
        if(monthly_salary>20000)
        {
            System.out.println("name of employee is::"+empname);
            
            System.out.println("monthly salary is::"+monthly_salary);
            System.out.println("designation of employee is::"+designation);
        }
        else
        {
            System.out.println("Cannot display details....");
        }
    }
    
}
class hierarchial1 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int id,i;
        String name,desig;
        double sal;
        for(i=0;i<3;i++)
        {
           
            System.out.println("enter name of employee..");
            name=s.next();
            System.out.println("enter designation of employee...");
            desig=s.next();
            System.out.println("enter salary of employee");
            sal=s.nextDouble();
            salary x=new salary(sal,desig,name);
            x.condition();
        }    
      
    }
    
}