import java.util.Scanner;

public class Printstr {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String  : ");
		String s1=scan.nextLine();
	    String s2=scan.nextLine();
	    char[] a1=s1.toCharArray();
	    char[] a2=s2.toCharArray();
	    int c=a1[0];
	    c=c-32;
	    a1[0]=(char)c;
	    c=a2[0];
	    c=c-32;
	    a2[0]=(char)c;
	    s1=new String(a1);
	    s2=new String(a2);
	    System.out.print(s1+" "+s2);
		

	}

}
