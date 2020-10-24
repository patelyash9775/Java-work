package lecture7;

import java.util.Scanner;

public class Bankaccount {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int id=scan.nextInt();
		double d=scan.nextDouble();
		scan.nextLine();
		String s=scan.nextLine();
		scan.close();
		System.out.println("id= "+id+" "+"d= "+d+"s= "+s);

	}

}
