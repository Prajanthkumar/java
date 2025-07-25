package tutorial;

public class seclar 
{
 public static void main(String[] args) 
	{
	 int arr[]= {};
		int sum=354,i=2;
		int rem=0;
	
		{
			while(sum>0)
			{
				rem=sum%10;
				arr[i--]=rem;
				sum=sum/10;
				if(i==0)
				{
					break;
				}

			}
	      }
	}
}



 