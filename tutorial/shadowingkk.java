package tutorial;

public class shadowingkk
{
	static  int x=90;
   public static void main(String args[])
   {
	  System.out.println(x);
	  int x;
	  x=50;
	  System.out.println(x);
	  fun();
   }
   static void fun()
   {
	   System.out.println(x);
   }
}
