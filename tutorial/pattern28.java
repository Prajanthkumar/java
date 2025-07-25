package tutorial;

public class pattern28 {

	public static void main(String[] args) {
		pattern28(5);

	}
	static void pattern28(int n)
	{
		for(int i=0;i<2*n;i++)
		{
			int c = i>n ? 2* n-i:i;
			int noofspaces=n-c;
			for(int s=0;s< noofspaces;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<c;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
