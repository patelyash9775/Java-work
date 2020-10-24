package lecture4;
import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=scan.nextInt();
		scan.close();
		String str=" ";
		int r;
		while(x!=0)
		{
         r=x%10;
         str=str+r;
         x=x/10;
	}
		System.out.println("Reverse num is a "+str);

}
}
