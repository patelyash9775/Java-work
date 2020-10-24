import java.util.Scanner;

class car{
	int gear;
	int headlight;
	int engine;
	String name;
	double average,highspeed,price;
	Scanner scan=new Scanner(System.in);
	public void setgear()
	{
		System.out.println("Enter no. of gear = ");
		gear=scan.nextInt();
	}
	public void setheadlight()
	{
		System.out.println("Enter no. of headlight= ");
		headlight=scan.nextInt();
	}
	public void setengine()
	{
		System.out.println("Enter no. of engine = ");
		engine=scan.nextInt();
	}
	public void setname()
	{
		System.out.println("Enter a car name = ");
		scan.nextLine();
		name=scan.nextLine();
	}
	public void display()
	{
		System.out.println("gear = "+gear+" "+"headlight = "+headlight+" "+"Engine = "+engine+" "+"name ="+name+" "+"price = "+price+" "+"highspeed = "+highspeed+" "+"average = "+average);
		scan.close();
	}
	
}

public class Sportscar extends car{
	public void setprice()
	{
		System.out.println("Enter a price = ");
		price=scan.nextDouble();
	}
	public void setspeed()
	{
		System.out.println("Enter a speed = ");
		highspeed=scan.nextDouble();
	}
	public void setaverage()
	{
		System.out.println("Enter an average = ");
		average=scan.nextDouble();
	}
	
     
	public static void main(String[] args) {
		Sportscar s=new Sportscar();
		s.setgear();
		s.setheadlight();
		s.setengine();
		s.setname();
		s.setaverage();
		s.setprice();
		s.setspeed();
		s.display();
		
	}

}
