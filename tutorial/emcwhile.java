package tutorial;
import java.util.Scanner;
public class emcwhile 
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int a=0;
	do
	{
		System.out.println("Enter the number > 10");
		a=sc.nextInt();
	}
	while(a<10);
  }
}
