import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		 int[] arr=new int[5];
		 Scanner scan = new Scanner(System.in);
	      System.out.print("Enter array:");
	      for(int i=0;i<5;i++)
	      {
	        arr[i]=scan.nextInt();
	      }
	      System.out.println("Enter a search number : ");
	      int x=scan.nextInt();
	      scan.close();
	      int i;
	      for(i=0;i<arr.length;i++)
	      {
	    	  if(x==arr[i])
	    		  break;
	      }
	      if(i==arr.length)
	    	  System.out.println("Searching is unsuccessful");
	      else
	    	  System.out.println("Searching is successful and index is a "+i);

	}

}
