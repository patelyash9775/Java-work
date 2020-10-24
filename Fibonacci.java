import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		 int a,b,sum;
		 a=0;
		 b=1;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a term where till prints series : ");
		 int i=scan.nextInt();
		 scan.close();
		 i=i-2;
		 System.out.println(a+" ");
		 System.out.println(b+" ");
		 while(i>0)
		 {	
			 sum=a+b;
			 a=b;
			 b=sum;
			 System.out.println(sum+" ");
			 i--;
			 
		 }
		 

	      }

}
