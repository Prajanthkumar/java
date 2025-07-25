package tutorial;
//multiple inheritance achieved by interface
interface printable
{
	void display();
}
interface showable
{
	void display();
}
class Document implements printable,showable
{
	public void display()
	{
		System.out.println("Document");
	}
}
public class multiinheritnemc
{

	public static void main(String[] args) 
	{
		Document d1=new Document();
		d1.display();

	}

}
