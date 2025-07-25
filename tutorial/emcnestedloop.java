package tutorial;
import java.util.Scanner;
public class emcnestedloop 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   for(int j=1;j<=3;j++)
	   {
		   for(int i=1;i<=j;i++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
	  
   }
}

