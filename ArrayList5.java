package FirstYearSecondSem;
import java.util.*;

public class ArrayList5 
{
	int age;
	int name;
	String rollno;
	public Student(int age, String rollno, int name)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Student s1=new Student(101, "sonoo", 23);
		Student s2=new Student(102, "Ravi" , 21);
		Student s3=new Student(103, "Hanumant", 25);
		
		ArrayList<Student>al=new
		Arraylist<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext());
		Student st=(Student)itr.next();
		System.out.println(st.rollno+ "" +st.name+ "" +st.age);
		}
	}