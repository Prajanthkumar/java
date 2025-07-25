package tutorial;

import java.util.Arrays;

public class varargs 
{
  public static void main(String args[])
  {
	 multiply(5,5) ;
  }
  static void multiply(int a, int b,String ...v)
  {
	  System.out.println(Arrays.toString(v));
  }
  static void fun(String ...v)
  {
	 System.out.println(Arrays.toString(v));
  }
}
