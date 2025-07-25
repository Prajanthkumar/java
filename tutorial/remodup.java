package tutorial;
import java.util.Scanner;
import java.util.ArrayList;
public class remodup 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,2,3};
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i:a)
		{
			list.add(i);
			
		}
		ArrayList<Integer>ans=new ArrayList<Integer>();
		for(int i:list)
		{
			if(!ans.contains(i))
			{
				ans.add(i);
			}
			
		}
		System.out.println(ans);
		

	}

}
