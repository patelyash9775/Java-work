package lecture7;

public class Stu {

	String name;
	int rollno;
	static String uniname;
	Stu(String n,int r)
	{
		name=n;
		rollno=r;
	}
	public void show()
	{
		System.out.println("name = "+name+" "+"roll no= "+rollno+" "+"uniname="+uniname);
	}
	public static void main(String[] args) {
		
		Stu s1=new Stu("Yash",134);
		Stu s2=new Stu("Meet",167);
		Stu.uniname="PDPU";
		s1.show();
		Stu.uniname="DAIICT";
		s2.show();

	}

}
