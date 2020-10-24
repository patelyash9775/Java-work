package lecture5;

import java.util.Scanner;

public class Countofdigit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=scan.nextInt();
		int count=0;
		while(x!=0)
		{
			x=x/10;
			count++;
		}
		System.out.println("count number of digit is a "+count);

	}

}
