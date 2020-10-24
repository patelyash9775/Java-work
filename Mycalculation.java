class calculation
	 {
		 double result;
			public void addition(int p,int q)
			{
				result=p+q;
			}
			public void substraction(int p,int q)
			{
				result=p-q;
			}
			public void display()
			{
				System.out.println("resul is a "+result);
			}
	 }

public class Mycalculation extends calculation {

	public void multiply(int p,int q)
	{
		result=p*q;
	}
	
	public void divide(int p,int q)
	{
		result=p/q;
	}
	public void modulas(int p,int q)
	{
		result=p%q;
	}

		public static void main(String[] args) {
			Mycalculation m1=new Mycalculation();
		       m1.addition(4,3);
		       m1.display();
		       m1.substraction(4,3);
		       m1.display();
		       m1.multiply(4,3);
		       m1.display();
		       m1.divide(4,3);
		       m1.display();
		       m1.modulas(4,3);
		       m1.display();

		}


	}


