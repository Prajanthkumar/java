package tutorial;
import java.util.Scanner;
public class exceptionhandlingemc 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Program Ended");
	}
	
}
