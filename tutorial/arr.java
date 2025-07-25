package tutorial;

import java.util.Scanner;
public class arr
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int[] a= {1,2,3,4,5,6};
	   System.out.println(max(a));
	   }
 static int max(int[] a)
 {
	 int maxVal=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 if(a[i]>maxVal)
		 {
			maxVal=a[i]; 
		 }
	 }
	 return maxVal;
 }
}
