package tutorial;
import java.util.Scanner;
class Notvalid extends Exception
{
	public Notvalid(String s)
	{
		super(s);
	}
}
public class customexpemc {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			int age=sc.nextInt();
			if(age<18)
			{
				throw new Notvalid("your age should be above 18");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
