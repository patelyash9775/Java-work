interface person
{
	void getname(String n);
	void getage(int age);
}
class student implements person
{
	int rollno;
	public void getname(String n)
	{
		System.out.println("name= "+n);
	}
	public void getage(int a)
	{
		System.out.println("age= "+a);
	}
	public void setrollno(int r)
	{
		rollno=r;
	}
	public void getrollno()
	{
		System.out.println("rollno= "+rollno);
	}
	
}
public class Interfaceinfo {

	public static void main(String[] args) {
		person p=new student();
		p.getname("yash");
		p.getage(18);
		//p.setrollno(134); we can access methods those have in class of refernce type
		//p.getrollno();So we can't access these methods

	}

}
