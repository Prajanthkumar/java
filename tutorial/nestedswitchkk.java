package tutorial;

import java.util.Scanner;

public class nestedswitchkk {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int empId=sc.nextInt();
		 String department=sc.next();
		 switch(empId)
		 {
		 case 1:
			 System.out.println("mpk");
			 break;
		 case 2:
			 System.out.println("shiva");
			 break;
		 case 3:
			 System.out.println("emp number 3");
			 switch(department)
			 {
			 case "IT":
				 System.out.println("it");
				 break;
			 case "cse":
				 System.out.println("cse");
				 break;
			 default:
				 System.out.println("others");
			 }
			 break;
		 default:
			 System.out.println("Enter correct id");
		 }

	}

}
