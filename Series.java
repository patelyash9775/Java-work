import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter term which till print series");
		int n=scan.nextInt();
		System.out.println("Enter a first term : ");
		int a=scan.nextInt();
		System.out.println("Enter b= ");
		int b=scan.nextInt();
		scan.close();
		long s;
		int i,j,k;
		System.out.println("The Series is : ");
		for(j=1;j<=n;j++)
		  {
			s=a;
			k=1;
			for(i=1;i<=j;i++)
		  {  
			 if(i==1)
			    {
				 s=s+i*b;
			    }
			 else
			 {
				k=2*k;
				s=s+k*b;
				
			 }
		  }
		  System.out.print("  "+s);
		  }

	}

}
