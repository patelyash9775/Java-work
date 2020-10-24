
public class Baby {

	static int numbabies=0;
	public static void main(String[] args) {
	
		Baby.numbabies=100;
		System.out.println("num= "+Baby.numbabies);
		Baby b1=new Baby();
		Baby b2=new Baby();
		b1.numbabies=150;
		System.out.println("num= "+b1.numbabies);
		b2.numbabies=200;
		System.out.println("num= "+Baby.numbabies);
		
				

	}

}
