package lecture5;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter a string : ");
		 String str=scan.nextLine();
		 String rev="";
		 int len=str.length();
		 for(int i=len-1;i>=0;i--)
		 {
			 rev=rev+str.charAt(i);
		 }
		 if(str.equals(rev))
			 System.out.println(str+" is a palindrome");
		 else
			 System.out.println(str+" is not a palindrome"); 

	}

}
