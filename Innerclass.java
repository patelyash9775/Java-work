package lecture9;

class X
{
	public int i;
	class Y extends X
	{
		public int j;
		public void show()
		{
			System.out.println("it is class Y");
		}
	}
	public void draw()
	{
		System.out.println("it is class X");
	}
}

public class Innerclass {

	public static void main(String[] args) {
		
    X x=new X();
    x.i=5;
    X.Y y=x.new Y();
    y.show();
    y.draw();
	}

}
