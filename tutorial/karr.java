package tutorial;
import java.util.Arrays;
import java.util.Scanner;
public class karr 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	  
	  String [] str=new String[4];
	  for(int i=0;i<str.length;i++)
	  {
		  str[i]=sc.next();
	  }
	  System.out.println(Arrays.toString(str));
   }
}
