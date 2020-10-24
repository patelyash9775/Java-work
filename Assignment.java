import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		  int n;
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number of elements : ");
		  n=scan.nextInt();
		  int[] arr=new int[n];
	      System.out.println("Enter array:");
	      for(int i=0;i<n;i++)
	      {
	        arr[i]=scan.nextInt();
	      }
	      System.out.println("Enter a current price : ");
	      int y=scan.nextInt();
	      scan.close();
	      int i,j;
	      for(i=0;i<n;i++)
	      {
	    	  System.out.println(arr[i]+" ");
	      }
	      for(i=0;i<n;i++)
	      {
	    	  if(arr[i]==y)
	    		  break;
	      }
	      int max=arr[i];
	      int max2=arr[0];
	      for(j=i+1;j<n;j++)
	      {
	    	  if(arr[j]>max)
	    		  max=arr[j];
	      }
	      for(j=0;j<i;j++)
	      {
	    	  if(arr[j]>max2)
	    		  max2=arr[j];
	      }
	      
	      System.out.println("Maximum profit is "+(max-y));
	      System.out.println("Maximum loss is "+(max2-y));
	        
	}

}
