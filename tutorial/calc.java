package tutorial;
import java.util.*;
public class calc 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ans=0;
         while(true)
         {
        	 System.out.println("enter the operator");
        	 char ch=sc.next().trim().charAt(0);
        	
        	 if(ch=='+'|| ch=='-' || ch=='*'|| ch=='/' ||ch=='%')
        	 {
        		 System.out.println("Enter the two numbers");
        	 
        		 int a=sc.nextInt();
        		 int b=sc.nextInt();
        		 
        		 if(ch=='+')
        		 {
        			 ans=a+b;
        		 }
        		 if(ch=='-')
        		 {
        			 ans=a-b;
        		 }
        		 if(ch=='*')
        		 {
        			 ans=a*b;
        		 }
        		 if(ch=='%')
        		 {
        			 ans=a%b;
        		 }
        		 if(ch=='/')
        		 {
        			 if(b!=0);{
        				 ans=a/b;
        			 }
        		 }
        		 else if(ch=='x'||ch=='X')
        		 {
        			 break;
        		 } }
        		 else
        		 {
        			 System.out.println("Invalid operator");
        		 }
        	 }
        	 System.out.println(ans);
         }
         
}

