package tutorial;
import java.util.Scanner;
public class remzero 
{
  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a= {1,2,0,4,3,0,5,0};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<i+1;j++)
			{
				if(j==0)
				{
					System.out.println();
				}
			}
		}
		
	}

}
