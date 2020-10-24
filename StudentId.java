class StudentInfo
{
	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String toString()
	{
		return(name+" , "+String.format("%d",rollno));
	}
	
}
public class StudentId {

	public static void main(String[] args) {
		StudentInfo S1=new StudentInfo();
		S1.setName("Yash");
		S1.setRollno(134);
		System.out.println(S1);

	}

}
