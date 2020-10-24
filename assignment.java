import java.util.Scanner;

public class assignment {

	public static void main(String[] args) {
	  int i;
	 
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter any string:");
      String str=scan.nextLine();
      scan.close();
      String rev="";
       int lenth = str.length();
       for(i=lenth-1;i>=0;i--)
       {
    	   rev=rev + str.charAt(i);
       }
       System.out.println("Reverse is : "+rev );

}
}