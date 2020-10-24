import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any year : ");
		int year=scan.nextInt();
		scan.close();
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			System.out.println(year + " is a leap year");
			
		}
		else
		{
			System.out.println(year + " is not a leap year");
		}
	}

}
