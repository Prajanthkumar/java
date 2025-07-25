package tutorial;

public class throwemc
{
   public static void main(String args[])
   {
	   try
	   {
		   int a=10;
		   throw new ArithmeticException();
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   System.out.println("program");
   }
}
