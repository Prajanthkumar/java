package tutorial;

import java.util.Scanner;

public class switchkk 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//		String fruit=sc.nextLine();
//		switch(fruit)
//		{
//		case "mango":
//		System.out.println("king");
//		break;
//		case "apple":
//			System.out.println("sweet");
//			break;
//			default:
//				System.out.println("invalid furit");
			int day=sc.nextInt();
			switch(day)
			{
			case 1-> System.out.println("monday");
		    case 2-> System.out.println("tuesday");
			case 3-> System.out.println("wednesday");
			case 4-> System.out.println("Thursday");
			case 5-> System.out.println("friday");
			case 6-> System.out.println("saturday");
			case 7-> System.out.println("sunday");
	}

}
}
