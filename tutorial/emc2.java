package tutorial;
import java.util.Scanner;
public class emc2 {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	int count=0;
	for(int i=1;i<=100;i++)
	{
		if(i%3==0 && i%5==0)
		{
		 System.out.println("Divisible by 3 and 5"+i);
			
		}
		else
		{
			System.out.println("no one is divisible");
		}
		
	}
	
	}

}
