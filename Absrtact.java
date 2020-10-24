package lecture9;

abstract class Shape
{
	public abstract void draw();
	public void display()
	{
		System.out.println("This is a method");
	}
}

class Circ extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Circle");
	}
}
class Dia extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Diamond");
	}
 }

class Rec extends Shape
{
	public void draw()
	{
		System.out.println("Draw a Rectangle");
	}
}

public class Absrtact {

	public static void main(String[] args) {
		Shape s=new Circ();
		s.draw();
		s.display();
		Shape s1=new Rec();
		s1=s;
		s1.draw();
		Shape s2=new Dia();
		s2.draw();

	}

}
