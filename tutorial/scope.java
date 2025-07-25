package tutorial;
import java.util.Scanner;
public class scope
{
  public static void main(String args[])
  {
	  int a=10;
	  int b=20;
	  String s ="shiva";
	  {
		s="siva";
		System.out.println(s);
	  }
	  
  }
  static void rea(int marks)
  {
	  int num=67;
	  System.out.println(num);
	  System.out.println(marks);
  }
}
