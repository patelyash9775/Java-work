import java.util.Scanner;

public class Largestof3number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a three number : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		scan.close();
		int l;
		l=a>b? a>c?a:c : b>c?b:c;
		System.out.println("Largest number is a "+l);

	}

}
