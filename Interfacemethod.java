package lecture9;

interface Drawable{
    void draw();
	default void msg()
	{
		System.out.println("Default method");
	}
}

class Re implements Drawable{
	
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
}

public class Interfacemethod {

	public static void main(String[] args) {
	
      Drawable d=new Re();
      d.draw();
      d.msg();
	}

}
