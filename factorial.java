package lecture4;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	   
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=scan.nextInt();
		int f=1;
		for(int i=n;i>=1;i--)
		{
		  f=f*i;
		}
		System.out.println("factorial of "+n+" is a "+f);
	}

}
