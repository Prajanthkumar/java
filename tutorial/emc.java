package tutorial;
import java.util.*;
public class emc 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a:");
		int a=sc.nextInt();
		System.out.println("Enter the number b:");
		int b=sc.nextInt();
		System.out.println("The values are:");
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);
		}
	}

}
