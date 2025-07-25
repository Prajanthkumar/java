package tutorial;
import java.util.Scanner;
import java.util.Arrays;
public class candies 
{
  public static void main(String[] args) 
	{
		int[] a= {2,3,4,5,1,3};
		int candy=3;
		ArrayList<Boolean>list=new ArrayList<Boolean>();
		// find the max
		int max=0;
		for(int i:a)
		{
			if(i>max)
				max=i;
		}
		for(int i:a)
		{
				list.add(i+candy>=max);
		}
		System.out.println(list);
	}

}
