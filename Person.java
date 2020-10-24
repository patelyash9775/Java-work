
public class Person {

	static int num=0;
	Person()
	{
		num+=1;
		System.out.println("num= "+num);
	}
	public static void main(String[] args) {
	
		Person p1=new Person();
		Person p2=new Person();

	}

}
