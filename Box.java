package lecture9;

class Rectangle
{
	private double length;
	private double width;
	public void setdimension(double l,double w)
	{
		length=l;
		width=w;
	}
	public void getdimension()
	{
		System.out.println("length = "+length+" "+"width= "+width);
	}
	public double getlength()
	{
		return(length);
	}
	public double getwidth()
	{
		return(width);
	}
	public double area()
	{
		return(length*width);
	}
	public void getarea()
	{
		System.out.println("area = "+area());
	}
}


public class Box extends Rectangle {
    private double height;
    
    public void setdimension(double l,double w, double h) 
    {super.setdimension(l, w);
     if (h>=0)
     {height = h;}
     else 
     {height = 0;}	 
    }
    public void getheight() 
    {System.out.println("height = " + height);} 
    
    public double area() 
    {return 2*(getlength()*getwidth() + getlength()*height + getwidth()*height);
     }
	
    public void getarea()
    {   
    	System.out.println(area());
    	}
    
    public static void main(String[] args) {
    Box mybox = new Box();    	 
    mybox.setdimension(5, 4, 2);	
    mybox.area();
    mybox.getarea();
    Rectangle recbox = new Box();
    recbox.setdimension(5,4);
    recbox.getarea();
	}

}