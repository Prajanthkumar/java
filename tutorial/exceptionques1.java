package tutorial;
import java.util.Scanner;
public class exceptionques1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		try
		{
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("program ended"+c);
		
     }

}
