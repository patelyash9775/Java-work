import java.util.Scanner;

public class Strnum {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int a=scan.nextInt();
		int i=15;
		int j=0;
		
       System.out.format("%s",s);
       for(i=(s.length()+1);i<=15;i++)
       {
    	   System.out.format(" ");
       }
       System.out.format("%d",a);
	}

}
