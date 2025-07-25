package tutorial;

public class incedec {

	public static void main(String[] args)
	{
		String arr[]= {"--X","X++","X++"};
		int x=0;
	  for(String op:arr) {
		if(op.charAt(1)=='+')
		{
			x+=1;
		}
		else {
			x-=(44-op.charAt(1));
		}
		
	}
		System.out.println(x);	
	}
	

}
