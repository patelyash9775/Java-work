package lecture4;

public class Average {

	public static void main(String[] args) {

       int sum=0;
       int count=0;
       while(count<10)
       {
    	   count++;
    	   sum+=count;
       }
       double avg=sum/count;
       System.out.println("Average is "+avg);
	}

}
