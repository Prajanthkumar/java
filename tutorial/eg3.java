package tutorial;

public class eg3
{
  public static void main(String[] args) 
	{
	  int count=0;
	  int count1=0;
		String a="hello";
		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
		
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
       System.out.println(count);
       System.out.println(count1);
		
		
	}

}
