package tutorial;
import java.io.FileWriter;
public class fileemc 
{
   public static void main(String[] args) 
	{
	   try {
		FileWriter fw=new FileWriter("output.txt",true);
		fw.write("hello world");
		fw.close();
		System.out.println("success");
	   }
	   catch(Exception e)
	   {
		   System.out.println("something has happen");
	   }
	}

}
