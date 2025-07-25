package tutorial;

class Teacher
{
	private String t_name="Shiva";
	void disp()
	{
		System.out.println(t_name);
	}
}
public class accessmodifier 
{

	public static void main(String[] args) 
	{
		Teacher t=new Teacher();
		System.out.println("hello");
        t.disp();
	}

}
