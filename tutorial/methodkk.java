package tutorial;
import java.util.Arrays;
import java.util.Scanner;
public class methodkk 
{
	public static void main(String args[])
	{
	 int [] a= {1,5,8,7};
	 change(a);
	 System.out.println(Arrays.toString(a));
	 
	}
	 
	static void change(int[] num)
	{
		num[0]=4;
	}
}
