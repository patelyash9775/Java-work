import java.util.Scanner;

public class Arraystep {

	public static void main(String[] args) {
	  
		Scanner scan=new Scanner(System.in);
		System.out.println("No. of elements : ");
		int n=scan.nextInt();
		System.out.println("Enter array : ");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		
		int i=0,j,count=0,l;
		int b=0;
		while(i<n)
		{
	      j=a[i];
	      if(j<n)
	      {
	    	  for(l=i;l<j;l++)
	    	  {
	    		  if(b>=n)
	    		  {
	    			  b=n-1;
	    			  break;
	    		  }
	    		  else if(a[l+1]>a[l])
	    		  {
	    			  b=b+a[l+1];
	    		  }
	    	  }
	    	  b=i;
	      }
	      else if(i==n-1)
	      {
	    	  i++;
	      }
	      else 
	      {
	    	  i=n-1;
	      }
		  count++;
		}
		
     System.out.println("Total no. of step : "+count);
	}

}
