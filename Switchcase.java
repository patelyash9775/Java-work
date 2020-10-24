package lecture5;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		
		int Day;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of day : ");
		Day=scan.nextInt();
		String str="Today is ";
		
		switch(Day)
		{
		case 1: System.out.println(str + "Monday");
		break;
		case 2: System.out.println(str + "Tuesday");
		break;
		case 3: System.out.println(str + "Wednesday");
		break;
		case 4: System.out.println(str + "Thursday");
		break;
		case 5: System.out.println(str + "Friday");
		break;
		case 6: System.out.println(str + "Saturday");
		break;
		case 7: System.out.println(str + "Sunday");
		break;
		}

	}

}
