
abstract class BankAccount{
	static int accountnumber;
	public String Ownername;
	public double balance;
	public void setbalance(double b)
	{
		balance=b;
	}
	public void setdeposit(double n)
	{
		balance=balance+n;
	}
	public double getbalance()
	{
		return(balance);
	}
	public String getownername()
	{
		return(Ownername);
	}
	public abstract void withdraw(double n);
	
}
class SavingsAccount extends BankAccount
{
	public void withdraw(double a)
	{
		if(a<=balance)
		{
			balance=balance-a;
		}
		else
		{
			System.out.println("we can not withdraw");
		}
	}
}

class CheckingAccount extends BankAccount
{
	public void withdraw(double b)
	{
		if(b<=balance)
		{
			balance=balance-b;
		}
		else
		{
			System.out.println("we can not withdraw");
		}
	}
}
public class Bank {

	public static void main(String[] args) {
	  
		SavingsAccount s=new SavingsAccount();
		s.setbalance(25000);
		s.Ownername="Yash";
		s.withdraw(1000);
		s.setdeposit(5000);
		System.out.println(s);
	    

	}

}
