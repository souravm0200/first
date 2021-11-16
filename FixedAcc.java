import java.lang.*;

public class FixedAccount
{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private int tenureYear; 
	private static double perTransactionLimit;
	
	public FixedAccount ( )
	{
		System.out.println("Empty Fixed Account:");
		
	}
	public static void setPerTransactionLimit(double ptl)
	{
		perTransactionLimit=ptl;
	}
	public static double getPerTransactionLimit( )
	{
		return perTransactionLimit;
	}
	
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
		
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	
	
	public String getAccountNumber( )
	{
		return accountNumber;
	}
	public String getAccountHolderName( )
	{
		return accountHolderName;
	}
	public double getBalance( )
	{
		return balance;
	}
	public int getTenureYear( )
	{
		return tenureYear;
	}
	
	public void depositMoney(double amount)
	{
		
	}
	public void withdrawMoney(double amount)
	{
		
	}
}
