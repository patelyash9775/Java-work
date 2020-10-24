package lecture7;

public class Counter2 {

	static int count=0;
	Counter2()
	{
		count+=1;
	}
	public void display()
	{
		System.out.println("count= "+count);
	}
	public static void main(String[] args) {
		Counter2 c1=new Counter2();
		c1.display();
		Counter2 c2=new Counter2();
		c2.display();
		Counter2 c3=new Counter2();
		c3.display();
		
	}

}
