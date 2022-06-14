package BankSystem;


/**
 * 
* @author Marwan Ashraf Mohamed 
* @since   18/4/2021
 */


public class CommercialClient extends Client{
	
	private String commercialID;

	/**
	 * This constructor sets the special account national ID 
	 */
	public CommercialClient() 
	{
		setID("00000000000000");
	}
	/**
	 * This constructor sets these data ( Name, Commercial ID, Address, Phone, Account) 
	 * @param Commercial Client name
	 * @param Commercial Client ID
	 * @param Commercial Client address
	 * @param Commercial Client phone
	 * @param Commercial Client account
	 */
	public CommercialClient(String name,String  commercialID,String address,String phone,Account account) 
	{
    super(name,"0000000000000",address,phone,account);
    this.commercialID=commercialID;
	}

	/**
	 * This method gets the commercial  client's ID
	 * @return client's commercial ID
	 */
	public String getCommercialID() 
	{
		return commercialID;
	}

	/**
	 * This method sets the commercial client's ID
	 */
	public void setCommercialID() 
	{
		System.out.print("Enter The CommercialID:");
		String ID = scan.nextLine();
		commercialID = ID;
	}
	/**
	 * This method prints the commercial client's name, commercial ID, address, phone, account info  
	 */
	public String toString( ) 
	{
		return "Client name: " + getName() +"\r\n"+"Commercial ID: "+ getCommercialID() +"\r\n"+ "Address: "+ getAddress() +"\r\n"+ "Phone: "+ getPhone() +"\r\n"+ "Account: "+ getAccount();
		
	}
}