
class A
{
	static String name;
	public void set(String s)
	{
		name=s;
	}
	public static void show()
	{
		System.out.println(name);
	}
}

public class Name {

	public static void main(String[] args) {
		 A a=new A();
		 a.set("Yash");
		 a.show();
	}

}
