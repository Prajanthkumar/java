package tutorial;

public class pattern6 
{
	public static void main(String[] args)
	{
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++)
		{
			for(int j=i;j<=a-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
}



	