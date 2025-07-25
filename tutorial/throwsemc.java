package tutorial;
import java.util.Scanner;
class cal 
{
	void div() throws Exception
	{
		
			
		int a=10/0;
		
		
	}
}
public class throwsemc 
{
public static void main(String[] args) 
    {
		cal c=new cal();
		try {
		c.div();
    }
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}

