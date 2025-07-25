package tutorial;

public class pattern5kk {

	public static void main(String[] args)
	{
		patter5(9);

	}
	static void patter5(int b)
	{
		for(int i=1;i<2*b;i++)
		{
			int c = i>b ? 2* b-i:i;
			for(int j=1;j<=c;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
