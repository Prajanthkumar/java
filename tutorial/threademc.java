package tutorial;
 
class ns extends Thread
{
  	public void run()
  	{
  	for(int i=0;i<10;i++)
  	{
  	
  		System.out.println("hey hello");
  	
  	}
}
}
class kk extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
	  	{
	  	
	  		System.out.println("ok bye");
	  	
	  	}
	}
}
public class threademc
{

	public static void main(String[] args) 
	{
		ns a=new ns();
		a.start();
		kk b=new kk();
		b.start();
		a.setPriority(5);
		

	}

}
