import java.util.Scanner;
public class Checkvowel {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string ");
		String a=scan.nextLine();
		int l=0;
		char b[]= {'a','e','i','o','u'};
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a.charAt(i)==b[j])
				{
					l++;
				}
			}
		}
		System.out.println("no. of vowel is a "+l);
		System.out.println("no.of consonent is a "+(a.length()-l));

	}

}
