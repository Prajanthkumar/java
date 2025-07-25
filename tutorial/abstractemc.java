package tutorial;

 abstract class Vehicle
 {
	abstract void speed();
	void brand()
	{
		System.out.println("bmw");
	}
	
 }
class Bike extends Vehicle
{
	void speed()
	{
		System.out.println("565");
	}
	
}
public class abstractemc 
{
   public static void main(String args[])
   {
	   Bike b1=new Bike();
	  b1.brand();
	  b1.speed();
	   
   }
}
