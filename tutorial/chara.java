package tutorial;
// problem mountain
import java.util.*;
public class chara 
{
   public static void main(String args[])
   {
	  int a[]= {1,2,3,2,1};
	 int i=0;
	 //check for increasing
	 while(i+1<a.length && a[i]<a[i+1])
	 {
		 i++;
	  }
	 //check if the peak is in 0 or n-1
	 if(i==0 || i==a.length-1)
	 {
		 System.out.println("not mountain");
		 return;
	 }
	 //check for decreasing
	 while(i+1<a.length && a[i]>a[i+1])
	 {
		 i++;
	  }
	 System.out.println(i==a.length-1?"mountain":"not mountain");
   }
}
