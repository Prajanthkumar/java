package tutorial;

public class patter2kk {

	public static void main(String[] args)
	{
		patter3(5);
	}
	static void patter1(int a)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void patter3(int b)
	{
		for(int i=1;i<=b;i++)
		{
			for(int j=1;j<=b-i+1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
