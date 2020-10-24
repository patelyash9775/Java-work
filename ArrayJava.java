package lecture5;

public class ArrayJava {

	public static void main(String[] args) {
		
		double[] myList= {10,5,6,8,9};
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList[i]+" ");
		}
		
		double sum=0;
		for(int i=0;i<myList.length;i++)
			 sum+=myList[i];
		double max=myList[0];
		for(int i=1;i<myList.length;i++) {
			if(myList[i]>max)
				max=myList[i];
		}
		System.out.println("Max is "+max);
	}

}
