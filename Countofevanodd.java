package lecture5;

import java.util.Scanner;

public class Countofevanodd {

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
		if(count%2==0)
		     System.out.println("count number of digit is an even");
		else
             System.out.println("count number of digit is an odd");
	}

}


	