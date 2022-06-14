package BankSystem;
import java.util.Scanner;
 
/**
 * This class implements a system bank account 
 * @author Youssef Yasser Ezzat
 * @since   18/4/2021
 */




public class Account {
	    Scanner scan = new Scanner(System.in);
	
	   private double balance;
	   private int accountnumber;
/**
 * This constructor initiates the balance and account number with zero     
 */
	public Account ()
	{
		balance=0;
		accountnumber=0;
	}
	
	/**
	 * This returns the Current Account Balance
	 * @return Account Balance
	 */
	public double getBalance()
	{
		return balance;
	}
	/**
	 * This method takes the amount of money to set the initial Account balance and prints the amount of money added
	 * @param balance 
	 */
	public void setBalance(double balance) 
	{  
		this.balance = balance;
	    System.out.println("account balance is: " +balance);
	}
	
	/**
	 * this method returns the account number
	 * @return Account number
	 */
	public int getAccountnumber()
	{
		return accountnumber;
	}
	
	/**
	 * this method takes the account number from the user and set it
	 */
	public void setAccountnumber()
	{
		System.out.print("Enter the account number:");
		 int accnum1 = scan.nextInt();  
		this.accountnumber = accnum1;
		System.out.println("account number is: " +accnum1);
	}
	
	/**
	 * this method takes the amount of money added to the Account balance
	 */
	public void deposit() 
	{
		System.out.print("Enter the amount of money you are entering:");
		double money = scan.nextDouble();  
		balance+=money;
		System.out.println("Done, your balance is currently: " +balance);
	}
	
	/**
	 * this method takes the amount of money withdrawn from the account balance
	 *   <p>
	 * note: you can't withdraw more than the current balance
	 */
	public void withdraw()
	{
		if(balance==0)
		{
			System.out.println("no enough balance, you have: "+balance);
		}
		else
		{
			int i=0;
			while(i==0)
			{
				System.out.print("Enter the amount of money you are withdrawing:");
				double money = scan.nextDouble();  
				if(money>balance) 
				{
					System.out.println("no enough balance, you have: "+balance+"\r\n"+"try again");
				}
				else 
				{  
					balance-=money;
					System.out.println("Done, your current balance is "+balance);
					i=1;
				}
			}
		}
	}
	
	/**
	 * this method prints the Account info(account balance, account number)
	 */
	public String toString() {
		return "\r\n"+"Account Number: " + accountnumber +"\r\n"+"Account Balance: "+ balance+"\r\n";
	}
		
}