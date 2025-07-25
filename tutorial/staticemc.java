package tutorial;
class member
{
	int mark=0;
	static String teacher="MPk";
}

public class staticemc
{
   public static void main(String args[])
   {
	   member s=new member();
	   s.mark=50;
	   
	  
	   member.teacher="shiva";
	  
	   System.out.println(s.teacher);
	  
	   
   }
}
