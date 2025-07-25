package tutorial;

public class pattern4kk {

	public static void main(String[] args) 
	{
		patter4(5);
	}
	static void patter4(int b)
	{
		for(int i=1;i<=b;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
