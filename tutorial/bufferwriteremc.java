package tutorial;

import java.io.BufferedWriter;
import java.io.FileWriter;
 
public class bufferwriteremc 
{

	public static void main(String[] args) 
	{
		try {
			FileWriter fw=new FileWriter("output.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("hey man");
			bw.newLine();
			bw.write("ok");
			bw.close();
			System.out.println("success");
		   }
		   catch(Exception e)
		   {
			   System.out.println("something has happen");
		   }
		}

}


