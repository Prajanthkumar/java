package tutorial;
import java.util.Scanner;
public class reverseno
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int ans=0;
	  while(a>0)
	  {
		 int rem=a%10;
		  a/=10;
		 ans=ans*10+rem;
	  }
	  System.out.println(ans);
  }
}
