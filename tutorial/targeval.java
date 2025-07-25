package tutorial;

public class targeval {

	public static void main(String[] args) {
		int nums[]= {2,7,11,15};
		int target=9;
		int start=0;
		int end=nums.length-1;
		while(start<end)
		{
			if(nums[start]+nums[end]>target)
			{
				end--;
			}
			else {
			start++;
			}
			if(nums[start]+nums[end]==target)
			{
				System.out.println(start+" "+end );
				break;
			}
		}
		
	}

}
