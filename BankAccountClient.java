
class BankAccount
{
	private String name;
	private double balance;
	public BankAccount(String name,double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	public BankAccount()
	{
     //default constructor
	}
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
		}
	}
	public String toString()
	{
		return(name+", $"+String.format("%.2f",balance));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
public class BankAccountClient {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("Yash",700);
		b1.deposit(500);
		System.out.println(b1.toString());
		b1.withdraw(300);
		System.out.println(b1);
		
		BankAccount B2=new BankAccount();
		System.out.println(B2);
		
		B2.setBalance(1.01);
		B2.setName("Meet");
		System.out.println(B2);

	}

}
