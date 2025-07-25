package tutorial;

public class overloadingkk {

	public static void main(String[] args) 
	{
		siva(50);
		siva("mpk");

	}
	static void siva(int a)
	{
		System.out.println(a);
	}
	static void siva(String name)
	{
		System.out.println(name);
	}

}
