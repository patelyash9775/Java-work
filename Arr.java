import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter elements: ");
		int[][] a=new int[3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("print array");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
			System.out.println("\n");
		}

	}

}
