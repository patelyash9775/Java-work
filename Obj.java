class Refer{
	public void display()
	{
		System.out.println("This is a reference method");
	}
}
public class Obj extends Refer {
    public void display()
    {
    	System.out.println("This is a Object method");
    }
	public static void main(String[] args) {
	  
		Refer r=new Obj(); //here r is pointing to the Obj class. 
		r.display();//So here execute the method of Obj.

	}

}
