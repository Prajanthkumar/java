package tutorial;
import java.util.Arrays;
public class rotatearr
{

	public static void main(String[] args)
	{
		int[] arr= {6,2,1,5,8,7 };
		Arrays.sort(arr);
				
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]-2);
		}
		
	}

}
