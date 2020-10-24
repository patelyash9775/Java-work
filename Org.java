import java.util.Scanner;

public class Org {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a leap : ");
		int l=scan.nextInt();
		System.out.println("No. of elemnts : ");
		int n=scan.nextInt();
		int[] a=new int[n];
		System.out.println("Enter an array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(l+i>=n)
			{
				System.out.println("You are win");
				break;
			}
			else
			{
				if(a[i+1]==0)
				{
					System.out.println("You are loss");
					break;
				}
				else
				 continue;	
			}
		}

	}

}
