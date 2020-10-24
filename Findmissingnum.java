import java.util.Scanner;

public class Findmissingnum {

	public static void main(String[] args) {
		
		 int[] arr=new int[5];
		 Scanner scan = new Scanner(System.in);
	      System.out.print("Enter array:");
	      for(int i=0;i<5;i++)
	      {
	        arr[i]=scan.nextInt();
	      }
	      scan.close();
          int sum1=0,sum2=0;
          for(int i=0;i<arr.length;i++)
          {
        	  sum1=sum1+arr[i];
          }
          for(int i=arr[0];i<=arr[arr.length-1];i++)
          {
        	  sum2=sum2+i;
          }
          System.out.println("Missing number is a "+(sum2-sum1));
	}

}
