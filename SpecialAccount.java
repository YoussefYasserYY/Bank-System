package BankSystem;

/**
 * This class extends the Account class with an extra future(overdraft)
 * @author Youssef Yasser Ezzat
 * @since   18/4/2021
 */
	public class SpecialAccount extends Account{
		
		/**
		 * This method is used to withdraw the amount of money taken from the user 
		 * <p>note: you can withdraw to -1000  
		 */
		public void withdraw() 
		{
			if(getBalance()==-1000)
			{
				System.out.println("no enough balance you have: "+getBalance());
			}
			else 
			{
				int i=0;
				while(i==0) 
				{
					System.out.print("Enter the amount of money you are withdrawing:");
					double money = scan.nextDouble();  
					if(money>getBalance()+1000 ) 
					{
						System.out.println("no enough balance you have: "+getBalance());
						System.out.println("try again");
					}
					else 
					{  
						setBalance(getBalance()-money);
						System.out.println("Done, your current balance is "+getBalance());
						i=1;
					}
	
				}	
			}
		}
}
