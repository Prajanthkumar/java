package tutorial;
import java.util.Scanner;
class Division
{
	void dividenumber(int num, int den)
	{
		try 
		{
			int result=num/den;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot be divided by zero");
		}
	}
}
public class c7_1 
{

	public static void main(String[] args) 
	{
		Division d=new Division();
		d.dividenumber(2, 2);

	}

}
