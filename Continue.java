package lecture5;

public class Continue {

	public static void main(String[] args) {
	
		int i;
		System.out.println("Odd numbers are ");
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
				 continue;
			System.out.println(i+" ");
		}
	}

}
