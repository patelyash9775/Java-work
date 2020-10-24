
public class Demo {

	protected void finalize()
	{
		System.out.println("Object is garbage collected");
	}
	public static void main(String[] args) {
	 
		Demo dm=new Demo();
		dm=null;
		System.gc();
		System.out.println("In the Main Method");

	}

}
