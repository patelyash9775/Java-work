
import java.util.ArrayList; 
import java.util.Iterator; 

public class PracticeIter {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=1;i<11;i++)
		{
			ar.add(i);
		}
		System.out.println(ar);
		
		Iterator<Integer> it=ar.iterator();
		while(it.hasNext())
		{
			int i=(Integer)it.next();
			System.out.print(i+" ");
			
			if(i%2==0)
			{
				it.remove();
			}
		}
		System.out.println();
		System.out.println(ar);
	}

}
