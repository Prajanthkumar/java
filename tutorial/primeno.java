package tutorial;
import java.util.Scanner;
public class primeno
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    	if(a%2!=0)
    	{
    		System.out.println(a+" "+ "it is a prime ");
    	}
    	else
    	{
    		System.out.println("not a prime");
    	}
    }
}

