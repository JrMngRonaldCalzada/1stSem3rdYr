package FirstYearSecondSem;
import java.util.*;

public class o {

	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	}
}