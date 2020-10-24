package lecture7;

public class Lemp {
      private boolean isOn;
      public void turnon()
      {
    	  isOn=true;
      }
      public void turnoff()
      {
    	  isOn=false;
      }
      public void display()
      {
    	  System.out.println("lemp is on?"+isOn);
      }
	
	public static void main(String[] args) {
      
		Lemp l1=new Lemp();
		Lemp l2=new Lemp();
		l1.turnon();
		l2.turnoff();
		l1.display();
		l2.display();

	}

}
