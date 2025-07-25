package tutorial;
import java.util.Scanner;
public class oddev 
{
	void even()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number:");
     int a=sc.nextInt();
     if(a%2==0)
     {
    	 System.out.println("even");
     }
     else
     {
    	 System.out.println("odd");
     }
	}

	public static void main(String[] args) 
	{
	 oddev f=new oddev();
	  f.even();
	}

}
