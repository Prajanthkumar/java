package tutorial;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class filereademc 
{

	public static void main(String[] args)
	{
		try
		{
		FileReader fr=new FileReader("output.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		System.out.println(line);
		br.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
