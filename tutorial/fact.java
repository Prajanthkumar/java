package tutorial;
import java.util.*;
public class fact 
{
	static void factorial(int a)
	{
		
	int fact=1;
	for(int i=a;i>=0;i--)
	{
		
		fact=fact*i;
		System.out.println(fact);
	}
	
	
	}
  public static void main(String args[])
  {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	  factorial(a);
  }
}
