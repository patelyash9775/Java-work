import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int x=scan.nextInt();
        scan.close(); 
        int i;
		for(i=2;i<x;i++)
		{
			if(x%i==0)
				break;
		}
		if(i==x)
			System.out.println(x+" is a prime number");
		else
			System.out.println(x+" is not a prime number");
	}

}
