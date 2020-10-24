package lecture9;

class A
{
	public void show()
	{
		System.out.println("it is class A");
	}
}

class B extends A
{
	
	public void show()
	{
		
		System.out.println("it is class B");
	}
}
public class Pre {

	public static void main(String[] args) {
    
		A a=new B();
		a.show();
	}

}
