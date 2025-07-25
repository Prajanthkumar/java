package tutorial;

class kkk extends Thread
{
	int j=0;
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			j=i;
		}
	}
}
public class joinemc {

	public static void main(String[] args) 
	{
		kkk a= new kkk();
		a.start();
		try
		{
		a.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(a.j);

	}

}
