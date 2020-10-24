package lecture7;

public class Count1 {
	static int count=0;
	Count1()
	{
		count++;
	}
	public void display()
	{
		System.out.println("count= "+count);
	}
	public static void main(String[] args) {
	
		Count1 c1=new Count1();
		c1.display();
		Count1 c2=new Count1();
		c2.display();
		Count1 c3=new Count1();
		c3.display();
	}

}
