package tutorial;
import java.util.Scanner;
public class repeatno 
{
 public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size : ");
	int a=s.nextInt();
	int arr[]=new int[a];
	System.out.println("enter the given value");
	
    int count=0;
	for(int i=0;i<a;i++)
	{
		arr[i]=s.nextInt();	
	}
	System.out.println("Enter the search element ");
	int b=s.nextInt();
	for(int i=0;i<a;i++)
	{
		if(b == arr[i]) {
			count++;
		}
		
	}
	System.out.println(count);
	
	
 }
}
