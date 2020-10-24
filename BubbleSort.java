import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		 int[] arr=new int[5];
		 Scanner scan = new Scanner(System.in);
	      System.out.print("Enter array:");
	      for(int i=0;i<5;i++)
	      {
	        arr[i]=scan.nextInt();
	      }
	      scan.close();
	      int i,j,t;
	      for(i=1;i<arr.length-1;i++)
	      {
	    	  for(j=0;j<arr.length-1-i;j++)
	    	  {
	    		  if(arr[j+1]<arr[j])
	    		  {
	    			  t=arr[j];
	    			  arr[j]=arr[j+1];
	    			  arr[j+1]=t;
	    			  
	    		  }
	    	  }
	      }
	      System.out.println("Array after sorting:"+Arrays.toString(arr));
	      
	}

}
