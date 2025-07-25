package tutorial;
import java.util.Scanner;
class invalidAgeException extends Exception
{
	invalidAgeException(String a)
	{
		super(a);
	}
}
class Agevalidator
{
	void checkAge(int age)
	{
		try
		{
			if(age<0 || age>150)
			{
				throw  new invalidAgeException("Age is invalid");
			}
			else
			{
				System.out.println("valid age");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class cq_2 {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
  Agevalidator a=new Agevalidator();
  a.checkAge(age);
	}

}
