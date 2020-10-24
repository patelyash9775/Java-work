import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int x=n;
		int s=0,r;
		while(x!=0)
		{
			r=x%10;
			s=s+r*r*r;
			x=x/10;
			}
        if(s==n)
        	System.out.println(n+" is a Armstrong");
        else
        	System.out.println(n+" is not Armstrong");
	}

}
