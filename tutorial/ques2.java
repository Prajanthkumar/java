package tutorial;
interface Readable
{
	void read();
}
interface Writable
{
	void write();
}
interface Storable
{
	void store();
}
class file implements Readable,Writable,Storable
{
	public void read()
	{
		System.out.println("readble");
	}
	public void write()
	{
		System.out.println("Writable");
	}
	public void store()
	{
		System.out.println("storable");
	}
}
public class ques2 
{

	public static void main(String[] args) 
	{
		file f1=new file();
		f1.read();
		f1.store();
		f1.write();

	}

}
