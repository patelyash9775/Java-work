
public class Child {

	int num=0;
	Child()
	{
		num+=1;
		System.out.println("num= "+num);
	}
	public static void main(String[] args) {
		Child c1=new Child();
		Child c2=new Child();
		
	}

}
