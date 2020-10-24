package lecture9;
interface P
{
	void show();
}

interface Q
{
	void show();
	void draw();
}

class R implements P , Q
{
	public void show()
	{
		System.out.println("hiiii");
	}
	public void draw()
	{
		System.out.println("helllooo");
	}
}
public class Multipleinheritance {

	public static void main(String[] args) {
		P a=new R();
		a.show();
		Q b=new R();
		b.draw();
		b.show();

	}

}
