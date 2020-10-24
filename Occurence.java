import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=scan.nextLine();
		scan.close();
		int l=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					l++;
				}
			}
		}	
      if(l>0)
      {
    	  System.out.println("\nstring is an occurence");
      }
      else
      {
    	  System.out.println("\nString is not an occurence");
      }
	}

}
