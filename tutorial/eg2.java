package tutorial;

public class eg2 {

	public static void main(String[] args)
	{
		String rev="";
		String a="madam"; 
		for(int i=a.length()-1;i>=0;i--)
		{
			char ch=a.charAt(i);
			rev=rev+ch;
		}
			if(a.equals(rev))
			{
				System.out.println("It is a palidrome");
			}
			else
			{
				System.out.println("Not a palidorme");
			}
			
		
		
	}

}
