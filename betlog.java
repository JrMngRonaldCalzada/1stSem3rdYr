package ronald;

public class betlog 
{
	public static void main(String[] args) 
	{
		for(int x=0; x<3; x++)
		{
			for(int y=0; y<3; y++)
			{
				System.out.println(((y+x))*2);
			}
			System.out.println();
		}
	}
}