package BankSystem;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is implemented to store client and account information and access it
 * @author Omar Mohamed AbdelBary 
 * @since   18/4/2021
 */

public class Bank {
    Scanner scan = new Scanner(System.in);
    
    
	private String name; 
	private String address;
	private String phone;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private ArrayList<Client> clients = new ArrayList<Client>();
	private int count=0;
	
	
	
	public Bank() {}
	
	/**
	 * This constructor sets the name,address and phone number of the bank
	 * @param name Bank name
	 * @param address Bank address
	 * @param phone Bank phone number
	 */
	public Bank(String name,String address,String phone) 
	{
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	
	/**
	 * This method used to get the Bank name 
	 * @return Bank name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * This method sets the Bank name 
	 */
	public void setName() 
	{
		System.out.println("Enter Bank Name");
		String Name = scan.nextLine();
		name=Name;
	}
	
	/**
	 * This method sets the Bank Address
	 */
	public void setAddress()
	{
		System.out.println("Enter Bank Address");
		String Address = scan.nextLine();
		address=Address;
	}
	
	/**
	 * This method gets the Bank Address
	 */
	public String getAddress() 
	{
		return address;
	}
	
	/**
	 * This method gets the Bank Address
	 */
	public String getPhone()
	{
		return phone;
	}
	
	/**
	 * This method sets the bank phone number
	 */
	public void setPhone() 
	{
		System.out.println("Enter Bank Phone");
		String Phone = scan.nextLine();
		phone=Phone;
	}
	/**
	 * This method gets the account number
	 */
	public int getcount() {
		return count;
	}
	
	/**
	 * This method adds a regular account to the arraylist 
	 * @param Regular Account
	 */
	public void AddAccount(Account account)
	{
		count++;
		accounts.add(account);
	}
	
	/**
	 * This method adds a special account to the arraylist 
	 * @param Special Account
	 */
	public void AddAccount(SpecialAccount account)
	{
		count++;
		accounts.add(account);
	}
	
	/**
	 * This method adds a regular client to the arraylist 
	 * @param Regular client
	 */
	public void AddClient(Client client )
	{
		clients.add(client);
	}
	
	/**
	 * This method adds a Commercial client to the arraylist 
	 * @param commercial client
	 */
	public void AddClient(CommercialClient client ) 
	{
		clients.add(client);
	}
	
	/**
	 * This method searches for an account by the account number 
	 * @param account number
	 */
	public Account search(int AccNum)
	{
		Account acco=new Account();
		Client client = new Client();
		int x =0;
		for(int i=0;i<count;i++)
		{
			if(accounts.get(i).getAccountnumber()==AccNum)
			{
				x=1;
				acco = accounts.get(i);
				client = clients.get(i);
			}
		}
		if(x==1)
		{
			System.out.print("\r\n"+client);
			return acco;
		}
		else
		{
			return null;
		}
	}
	/**
	 * this method is to display all clients and their account info.	
	 */
	public void Display()
	{
		if(count==0)
		{
			System.out.print("No Accounts yet, would you like to create one?");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.print(clients.get(i));
				System.out.print("\r\n");
			}
		}
	}
		
	
}
	
