package BankSystem;

/**
 * @author Marwan Ashraf Mohamed
* @since   18/4/2021
 */

import java.util.Scanner;

public class Client {
	Scanner scan = new Scanner(System.in);
	private String name;
	private String nationalID;
	private String address;
	private String phone;
	private Account account;
	

	public Client() {}
	/**
	 * This constructor sets these data(Name,nationalID,address,phone,Account) of Client
	 * @param name
	 * @param nationalID
	 * @param address
	 * @param phone
	 * @param ACC
	 */
	public Client(String name,String nationalID,String address,String phone,Account account)	
	{
		this.account = account;
		this.name=name;
		this.phone=phone;
		this.nationalID=nationalID;
		this.address=address;
	}
	
	/**
	 * This method sets the name of the client 
	 */
	public void setName()
	{
		System.out.print("enter your name:");
		String Name = scan.nextLine();
		name=Name;
		
	}
	
	/**
	 * This method gets the client name 
	 * @return Name
	 */
	public String getName()
	{
		
		return name;
		
	}
	/**
	 * This method sets the client national id 
	 */
	public void setID()
	{
		System.out.print("Enter your national ID:");
		String p = scan.nextLine();
		nationalID = p;
	}
	
	/**
	 * This an overloaded method that takes string input national ID and set it
	 * @param national ID
	 */
	public void setID(String id)
	{
		nationalID = id;
	}
	
	/**
	 * This method gets the client national ID
	 * @return national ID
	 */
	public String getID() 
	{
		
		return nationalID;
		
	}
	/**
	 * This method sets the client address
	 */
	public void setAddress() 
	{
		System.out.print("Enter your address:");
		String add=scan.nextLine();
		address=add;
		
	}
	/**
	 * This method gets the client address
	 * @return client address
	 */
	public String getAddress() 
	{	
		return address;
		
	}
	/**
	 * This method sets the client phone number
	 */
	public void setPhone() 
	{
		System.out.print("Enter phone number:");
		String p = scan.nextLine();
		phone = p;
		
	}
	
	/**
	 * This method gets the client phone number
	 * @return client phone number
	 */
	public String getPhone()
	{
		
		return phone;
		
	}
	
	/**
	 * This method prints the client info (Name, National ID, Address, phone, Account info )
	 */
	public String toString( ) {
		return "\r\n"+"client Name: " + name +"\r\n"+"National ID: "+ nationalID +"\r\n"+ "Address: "+ address +"\r\n"+ "Phone: "+ phone + "\r\n"+ account;
		
	}
/**
 * This method gets the account info
 * @return account info
 */
	public Account getAccount()
	{
		return account;
	}
/**
 * This method sets the account 
 * @param account
 */
	public void setAccount(Account account)
	{
		this.account = account;
	}
	/**
	 * This method sets the special account
	 * @param  Special Account
	 */
	public void setAccount(SpecialAccount specAccount) {
		account=specAccount;
	}
	
}