package FirstYearSecondSem;

public class dim2 
{
	public static void main(String[] args) 
	{
		int [][] igado =  {
						{16, 3 ,2 , 13},
						{5, 10, 11, 8},
						{9, 6, 7, 12},
						{4, 15, 14, 1}
						};
		for(int a = 0; a<igado.length; a++)
		{
			for (int b = 0; b<igado.length; b++)
		{
		System.out.print(igado[a][b] + " ");
		}
		System.out.println();
		}
	}
}