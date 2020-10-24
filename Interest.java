
public class Interest {

	public void calculate(int p,int t,double r,int n)
	{
		double inter=p*Math.pow(1+r/n,n*t);
		double compound=inter-p;
		System.out.println("Compound Interest after "+t+"years : "+compound);
		System.out.println("Amount after "+t+" years : "+inter);
	}
	public static void main(String[] args) {
		Interest i=new Interest();
		i.calculate(2000,5,.08,12);

	}

}
