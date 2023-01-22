package ronald;

public class nestedif {

	public static void main(String[] args) {
		for(int x=0; x<4; x++)
		{
			for(int y=0; y<4; y++)
			{
				if(x>=y)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}