abstract class Person
{
	String name;
	int rollno;
	int age;
	public void name(String s)
	{
		name=s;
	}
	public abstract void rollno(int r);
	public abstract void age(int a);
}

class Student extends Person
{
	public void rollno(int r)
	{
	 rollno=r;
	}
	public void age(int a)
	{
		age=a;
	}
	public void show()
	{
		System.out.println("name = "+name+" "+"rollno = "+rollno+" "+"age = "+age);
	}
}
public class Newabstract {

	public static void main(String[] args) {
		Student s=new Student();
		s.name("yash");
		s.rollno(134);
		s.age(18);
		s.show();

	}

}
