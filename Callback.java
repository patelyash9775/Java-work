
interface Touch
{
	void click();
}

class Clickhand implements Touch
{
	public void click()
	{
		System.out.println("Click");
	}
}

class Button{

	public void onclick(Clickhand c)
	{
		c.click();
	}
}

public class Callback{
	
	public static void main(String[] args) {
		
		Button b=new Button();
		Clickhand c1=new Clickhand();
		b.onclick(c1);
	}

}
