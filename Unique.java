
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("No. of elements : ");
		int n=scan.nextInt();
		System.out.println("Enter an elements");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		int l=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					l++;
				}
			}
		}
		if(l>0)
		{
			System.out.println("Array is not unique");
		}
		else
		{
			System.out.println("Array is an unique");
		}

	}

}
