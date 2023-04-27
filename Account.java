import java.util.*;
public class Account {
	
	private int accno;
	private double balance;
	
	public Account(int accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	public String toString()
	{
		return "Account no="+accno+"\nBalance="+balance;
	}
	public double getbalance()
	{
		return balance;
	}
	public void Withdraw() throws LowBalanceException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw:");
		double amt=sc.nextDouble();
		
		if(amt>balance)
		{
			throw new LowBalanceException("Balance is Low...");
		}
		else 
		{
			balance=balance-amt;
			System.out.println("Total Available Balance is:"+balance);
		}
	}


	public static void main(String[] args) 
	{
		Account ac=new Account(123,8000);
		System.out.println(ac);
		
		try
		{
			ac.Withdraw();
			
		}
		catch(LowBalanceException e)
		{
			e.printmsg();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	    finally
	    {
	    	System.out.println("Thank You Visit Again...");
	    }
	    
	   
}
}

