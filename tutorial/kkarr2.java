package tutorial;
import java.util.Scanner;
public class kkarr2
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int [] [] a=new int[sc.nextInt()][sc.nextInt()];

		   for(int row=0;row<a.length;row++)
		   {
			   for(int col=0;col<a[row].length;col++)
			   {
				 a[row][col]=sc.nextInt();
				   
			   }
		   }
			   for(int row=0;row<a.length;row++)
			   {
				   for(int col=0;col<a[row].length;col++)
				   {
					  System.out.print(a[row][col] + " ");
					   
				   }
				   System.out.println();
		  
	   }

}
   }


