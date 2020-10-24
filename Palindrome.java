package lecture4;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=scan.nextInt();
		scan.close();
		int y=x;
		int r=0;
		while(x!=0)
		{
         r=x%10+r*10;
         x=x/10;
	}
		if(r==y)
			System.out.println("Number is a palindrome");
		else
			System.out.println("Number is not a palindrom");
	}

}
