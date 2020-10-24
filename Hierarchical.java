class A
{
  public void method1()
  {
	  System.out.println("This is a method A");
  }
}

class B extends A
{
	public void method2()
	{
		System.out.println("This is a method B");
	}
}

class C extends A
{
	public void method3()
	{
		System.out.println("This is a method C");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		b.method1();
		b.method2();
		c.method3();

	}

}
