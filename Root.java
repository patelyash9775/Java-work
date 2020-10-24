import java.util.Scanner;

public class Root {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter constant : ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		double det=b*b-4*a*c;
		double root1,root2;
		if(det>0)
		{
		  root1 = (-b + Math.sqrt(det))/2*a;
		  root2 = (-b - Math.sqrt(det))/2*a;
		  System.out.println("root1 = "+root1+" "+"root2= "+root2);
		}
		else if(det==0)
		{
			root1 = root2 = b / 2*a;
			System.out.println("root1 = root2 = "+root1);
		}
		else
		{
			double realpart = (-b)/(2*a);
			double imaginarypart = (Math.sqrt(-det))/(2*a);
			
			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi",realpart,imaginarypart,realpart,imaginarypart);
		}
	}

}
