import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		 int[] arr=new int[5];
		 Scanner scan = new Scanner(System.in);
	      System.out.println("Enter array:");
	      for(int i=0;i<5;i++)
	      {
	        arr[i]=scan.nextInt();
	      }
	      scan.close();
	      int s=0;
	      for(int i=0;i<5;i++)
	      {
	    	  s=s+arr[i];
	      }
	     System.out.println("Sum of array is : "+s);
 
}
}